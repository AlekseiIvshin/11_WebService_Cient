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

public class SimpleClient {
	static final Logger logger = LoggerFactory.getLogger(SimpleClient.class);

	@WebServiceRef(wsdlLocation = "http://localhost:8888/ws/autoshow?wsdl")
	AutoshowServiceService service;
	ShowService servicePort;

	public SimpleClient() {
		service = new AutoshowServiceService();
		servicePort = service.getPort(ShowService.class);
	}

	public List<String> getMarks() {
		return servicePort.getCarMarkList();
	}

	public List<MerchantDomain> getMerchants() {
		return servicePort.getAllMerchants();
	}

	public SalesDomain saleCar(CustomerDomain customer,
			MerchantDomain merchant, CarDomain car) throws Exception {
		try {
			return servicePort.newSaleAndUpdateStore(customer, merchant, car);
		} catch (Exception_Exception e) {
			logger.error("New sale error", e);
			throw new Exception(e);
		}
	}

	public List<CarDomain> getCarsByMark(String markName){
		return servicePort.getCarByMark(markName);
	}
	
	public List<CarDomain> getCarsByMarkAndModel(String mark, String model){
		return servicePort.getCarByMarkAndModel(mark, model);
	}
	
	public CarDomain getCarById(long id){
		return servicePort.getCarById(id);
	}
	
	public MerchantDomain getMerchantById(int id){
		return servicePort.getMerchantById(id);
	}
}
