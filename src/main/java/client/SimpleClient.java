package client;

import java.util.List;

import javax.xml.ws.WebServiceRef;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import webservice.AutoshowServiceService;
import webservice.CarDomain;
import webservice.CustomerDomain;
import webservice.Exception_Exception;
import webservice.MerchantDomain;
import webservice.SalesDomain;
import webservice.ShowService;
import webservice.StoreDomain;

public class SimpleClient {
	static final Logger logger = LoggerFactory.getLogger(SimpleClient.class);

	@WebServiceRef(wsdlLocation = "http://localhost:8897/ws/autoshow?wsdl")
	AutoshowServiceService service;
	ShowService servicePort;

	public SimpleClient() {
		service = new AutoshowServiceService();
		servicePort = service.getPort(ShowService.class);
	}

	/**
	 * Get all mark names.
	 * @return mark names
	 */
	public List<String> getMarks() {
		return servicePort.getCarMarkList();
	}

	/**
	 * Get all merchants.
	 * @return merchants
	 */
	public List<MerchantDomain> getMerchants() {
		return servicePort.getAllMerchants();
	}

	/**
	 * Sale car.
	 * @param customer buy car
	 * @param merchant sell car
	 * @param car car
	 * @return new sale object
	 * @throws Exception
	 */
	public SalesDomain saleCar(CustomerDomain customer,
			MerchantDomain merchant, CarDomain car) throws Exception {
		try {
			return servicePort.newSaleAndUpdateStore(customer, merchant, car);
		} catch (Exception_Exception e) {
			logger.error("New sale error", e);
			throw new Exception(e);
		}
	}

	/**
	 * Get cars by mark.
	 * @param markName mark name
	 * @return
	 */
	public List<CarDomain> getCarsByMark(String markName){
		return servicePort.getCarByMark(markName);
	}
	
	/**
	 * Get cars by mark and model names.
	 * @param mark mark name
	 * @param model model name
	 * @return
	 */
	public List<CarDomain> getCarsByMarkAndModel(String mark, String model){
		return servicePort.getCarByMarkAndModel(mark, model);
	}
	
	/**
	 * Get car by id.
	 * @param id car id
	 * @return
	 */
	public CarDomain getCarById(long id){
		return servicePort.getCarById(id);
	}
	
	/**
	 * Get merchant by id.
	 * @param id merchant id
	 * @return
	 */
	public MerchantDomain getMerchantById(int id){
		return servicePort.getMerchantById(id);
	}
	
	/**
	 * Find one car by mark name , model name and modification.
	 * @param markName mark name
	 * @param modelName model name
	 * @param modificationName modification
	 * @return car
	 * @throws Exception
	 */
	public CarDomain findCar(String markName, String modelName, String modificationName) throws Exception{
		try {
			return servicePort.findOneCar(markName, modelName, modificationName);
		} catch (Exception_Exception e) {
			throw new Exception(e);
		}
	}
	
	/**
	 * Get store item of car.
	 * @param car car
	 * @return
	 */
	public StoreDomain getStoreByCar(CarDomain car){
		return servicePort.getStore(car);
	}
	
	public CustomerDomain findCustomerByPassport(String series, String number){
		return servicePort.findCustomerByPassport(series, number);
	}
}
