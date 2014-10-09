package client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import webservice.CarElement;
import webservice.CustomerElement;
import webservice.MerchantElement;
import webservice.SalesElement;

public class SimpleClientTest {

	SimpleClient client;
	
	@Before
	public void setUp(){
		client = new SimpleClient();
	}
	
	@Test
	public void testGetMarks() {
		List<String> marks = client.getMarks();
		assertNotNull(marks);
	}
	
	@Test
	public void testGetCustomer() {
		CustomerElement customer = client.findCustomerByPassport("9100", "100101");
		assertNotNull(customer);
	}
	
	@Test
	public void testSealeCare(){
		CarElement car = client.getCarById(2);
		MerchantElement merchant = client.getMerchantById(2);
		CustomerElement  customerElement = client.findCustomerByPassport("9100", "100100");
		SalesElement salesElement;
		try {
			salesElement = client.saleCar(customerElement, merchant, car);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
			return;
		}
		assertNotNull(salesElement);
	}

}
