package client;

import java.util.List;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

import webservice.CustomerDomain;
import webservice.ShowService;

public class Client {
	private ShowService client;
	
	
	public Client(){
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setServiceClass(ShowService.class);
		factory.setAddress("http://localhost:8896/ws/autoshow");
		client = (ShowService) factory.create();
	}
	
	public CustomerDomain getCustomerByPassport(String series, String number){
		return client.findCustomerByPassport(series, number);
	}
	
	public List<String> getCarMarks(){
		return client.getCarMarkList();
	}
}
