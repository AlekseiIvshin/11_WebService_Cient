package client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import webservice.CarElement;
import webservice.CustomerElement;
import webservice.MerchantElement;
import webservice.SalesElement;
import webservice.StoreElement;

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
	public void testSeleCare(){
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
	
	@Test
	public void testGetCarByMark(){
		List<CarElement> cars = client.getCarsByMark("Audi");
		assertNotNull(cars);
	}
	

	@Test
	public void testGetCarByMarkAnModel(){
		List<CarElement> cars = client.getCarsByMarkAndModel("Audi","R8");
		assertNotNull(cars);
	}
	
	@Test
	public void testGetCarAndGetStore(){
		CarElement car;
		try {
			car = client.findCar("Audi", "R8", "6.2 MT (442 hs)");
		} catch (Exception e) {
			fail(e.getMessage());
			return;
		}
		assertNotNull(car);
		StoreElement store = client.getStoreByCar(car);
		assertNotNull(store);
		assertEquals(store.getCar().getId(), car.getId());
		assertEquals(store.getCar().getMark(), car.getMark());
		assertEquals(store.getCar().getModel(), car.getModel());
		assertEquals(store.getCar().getModification(), car.getModification());
		assertEquals(store.getQuantity(), 2);		
	}
	
	@Test
	public void testGetAllStroreItems(){
		List<StoreElement> storeItems = client.getAllStores();
		assertNotNull(storeItems);
		assertFalse(storeItems.isEmpty());
	}
	

	@Test
	public void testGetAllSaleItems(){
		List<SalesElement> salesElements = client.getAllSales();
		assertNotNull(salesElements);
		assertFalse(salesElements.isEmpty());
	}

}
