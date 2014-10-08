package client;

import java.util.List;

import webservice.CarElement;
import webservice.CustomerElement;
import webservice.Exception_Exception;
import webservice.MerchantElement;
import webservice.SalesElement;
import webservice.StoreElement;

public interface Client {
	/**
	 * Get all mark names.
	 * 
	 * @return mark names
	 */
	public List<String> getMarks();

	/**
	 * Get all merchants.
	 * 
	 * @return merchants
	 */
	public List<MerchantElement> getMerchants();

	/**
	 * Sale car.
	 * 
	 * @param customer
	 *            buy car
	 * @param merchant
	 *            sell car
	 * @param car
	 *            car
	 * @return new sale object
	 * @throws Exception
	 */
	public SalesElement saleCar(CustomerElement customer,
			MerchantElement merchant, CarElement car) throws Exception;

	/**
	 * Get cars by mark.
	 * 
	 * @param markName
	 *            mark name
	 * @return
	 */
	public List<CarElement> getCarsByMark(String markName);

	/**
	 * Get cars by mark and model names.
	 * 
	 * @param mark
	 *            mark name
	 * @param model
	 *            model name
	 * @return
	 */
	public List<CarElement> getCarsByMarkAndModel(String mark, String model);

	/**
	 * Get car by id.
	 * 
	 * @param id
	 *            car id
	 * @return
	 */
	public CarElement getCarById(long id);

	/**
	 * Get merchant by id.
	 * 
	 * @param id
	 *            merchant id
	 * @return
	 */
	public MerchantElement getMerchantById(int id);

	/**
	 * Find one car by mark name , model name and modification.
	 * 
	 * @param markName
	 *            mark name
	 * @param modelName
	 *            model name
	 * @param modificationName
	 *            modification
	 * @return car
	 * @throws Exception
	 */
	public CarElement findCar(String markName, String modelName,
			String modificationName) throws Exception;

	/**
	 * Get store item of car.
	 * 
	 * @param car
	 *            car
	 * @return
	 */
	public StoreElement getStoreByCar(CarElement car);

	/**
	 * Find cusomer by passport.
	 * 
	 * @param series
	 *            passport series
	 * @param number
	 *            passport number
	 * @return found customer
	 */
	public CustomerElement findCustomerByPassport(String series, String number);

	/**
	 * Get all sales.
	 * 
	 * @return
	 */
	public List<SalesElement> getAllSales();

	/**
	 * Get all store items.
	 * 
	 * @return
	 */
	public List<StoreElement> getAllStores();
}
