package client;

import java.util.List;

import javax.xml.ws.WebServiceRef;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import webservice.AutoshowServiceService;
import webservice.CarElement;
import webservice.CustomerElement;
import webservice.Exception_Exception;
import webservice.MerchantElement;
import webservice.SalesElement;
import webservice.ShowService;
import webservice.StoreElement;

public class SimpleClient implements Client {
	static final Logger logger = LoggerFactory.getLogger(SimpleClient.class);

	@WebServiceRef(wsdlLocation = "http://localhost:8897/ws/autoshow?wsdl")
	AutoshowServiceService service;
	ShowService servicePort;

	public SimpleClient() {
		service = new AutoshowServiceService();
		servicePort = service.getPort(ShowService.class);
	}

	public List<String> getMarks() {
		return servicePort.getCarMarkList();
	}

	public List<MerchantElement> getMerchants() {
		return servicePort.getAllMerchants();
	}

	public SalesElement saleCar(CustomerElement customer,
			MerchantElement merchant, CarElement car) throws Exception {
		try {
			return servicePort.newSaleAndUpdateStore(customer, merchant, car);
		} catch (Exception_Exception e) {
			logger.error("New sale error", e);
			throw new Exception(e);
		}
	}

	public List<CarElement> getCarsByMark(String markName) {
		return servicePort.getCarByMark(markName);
	}

	public List<CarElement> getCarsByMarkAndModel(String mark, String model) {
		return servicePort.getCarByMarkAndModel(mark, model);
	}

	public CarElement getCarById(long id) {
		return servicePort.getCarById(id);
	}

	public MerchantElement getMerchantById(int id) {
		return servicePort.getMerchantById(id);
	}

	public CarElement findCar(String markName, String modelName,
			String modificationName) throws Exception {
		try {
			return servicePort
					.findOneCar(markName, modelName, modificationName);
		} catch (Exception_Exception e) {
			throw new Exception(e);
		}
	}

	public StoreElement getStoreByCar(CarElement car) {
		return servicePort.getStore(car);
	}

	public CustomerElement findCustomerByPassport(String series, String number) {
		return servicePort.findCustomerByPassport(series, number);
	}

	public List<SalesElement> getAllSales() {
		return servicePort.getAllSales();
	}

	public List<StoreElement> getAllStores() {
		return servicePort.getAllStores();
	}
}
