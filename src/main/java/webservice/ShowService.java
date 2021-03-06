
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShowService", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShowService {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarMarkList", targetNamespace = "http://webservice/", className = "webservice.GetCarMarkList")
    @ResponseWrapper(localName = "getCarMarkListResponse", targetNamespace = "http://webservice/", className = "webservice.GetCarMarkListResponse")
    public List<String> getCarMarkList();

    /**
     * 
     * @param merchantId
     * @return
     *     returns webservice.MerchantElement
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMerchantById", targetNamespace = "http://webservice/", className = "webservice.GetMerchantById")
    @ResponseWrapper(localName = "getMerchantByIdResponse", targetNamespace = "http://webservice/", className = "webservice.GetMerchantByIdResponse")
    public MerchantElement getMerchantById(
        @WebParam(name = "merchantId", targetNamespace = "")
        int merchantId);

    /**
     * 
     * @param series
     * @param number
     * @return
     *     returns webservice.CustomerElement
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCustomerByPassport", targetNamespace = "http://webservice/", className = "webservice.FindCustomerByPassport")
    @ResponseWrapper(localName = "findCustomerByPassportResponse", targetNamespace = "http://webservice/", className = "webservice.FindCustomerByPassportResponse")
    public CustomerElement findCustomerByPassport(
        @WebParam(name = "series", targetNamespace = "")
        String series,
        @WebParam(name = "number", targetNamespace = "")
        String number);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.StoreElement>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllStores", targetNamespace = "http://webservice/", className = "webservice.GetAllStores")
    @ResponseWrapper(localName = "getAllStoresResponse", targetNamespace = "http://webservice/", className = "webservice.GetAllStoresResponse")
    public List<StoreElement> getAllStores();

    /**
     * 
     * @param modelName
     * @param modificationName
     * @param markName
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeCar", targetNamespace = "http://webservice/", className = "webservice.RemoveCar")
    @ResponseWrapper(localName = "removeCarResponse", targetNamespace = "http://webservice/", className = "webservice.RemoveCarResponse")
    public void removeCar(
        @WebParam(name = "markName", targetNamespace = "")
        String markName,
        @WebParam(name = "modelName", targetNamespace = "")
        String modelName,
        @WebParam(name = "modificationName", targetNamespace = "")
        String modificationName)
        throws Exception_Exception
    ;

    /**
     * 
     * @param modelName
     * @param markName
     * @return
     *     returns java.util.List<webservice.CarElement>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarByMarkAndModel", targetNamespace = "http://webservice/", className = "webservice.GetCarByMarkAndModel")
    @ResponseWrapper(localName = "getCarByMarkAndModelResponse", targetNamespace = "http://webservice/", className = "webservice.GetCarByMarkAndModelResponse")
    public List<CarElement> getCarByMarkAndModel(
        @WebParam(name = "markName", targetNamespace = "")
        String markName,
        @WebParam(name = "modelName", targetNamespace = "")
        String modelName);

    /**
     * 
     * @param modelName
     * @param modificationName
     * @param markName
     * @return
     *     returns webservice.CarElement
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCar", targetNamespace = "http://webservice/", className = "webservice.AddCar")
    @ResponseWrapper(localName = "addCarResponse", targetNamespace = "http://webservice/", className = "webservice.AddCarResponse")
    public CarElement addCar(
        @WebParam(name = "markName", targetNamespace = "")
        String markName,
        @WebParam(name = "modelName", targetNamespace = "")
        String modelName,
        @WebParam(name = "modificationName", targetNamespace = "")
        String modificationName)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<webservice.MerchantElement>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMerchants", targetNamespace = "http://webservice/", className = "webservice.GetAllMerchants")
    @ResponseWrapper(localName = "getAllMerchantsResponse", targetNamespace = "http://webservice/", className = "webservice.GetAllMerchantsResponse")
    public List<MerchantElement> getAllMerchants();

    /**
     * 
     * @param carId
     * @return
     *     returns webservice.CarElement
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarById", targetNamespace = "http://webservice/", className = "webservice.GetCarById")
    @ResponseWrapper(localName = "getCarByIdResponse", targetNamespace = "http://webservice/", className = "webservice.GetCarByIdResponse")
    public CarElement getCarById(
        @WebParam(name = "carId", targetNamespace = "")
        long carId);

    /**
     * 
     * @param car
     * @return
     *     returns webservice.StoreElement
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStore", targetNamespace = "http://webservice/", className = "webservice.GetStore")
    @ResponseWrapper(localName = "getStoreResponse", targetNamespace = "http://webservice/", className = "webservice.GetStoreResponse")
    public StoreElement getStore(
        @WebParam(name = "car", targetNamespace = "")
        CarElement car);

    /**
     * 
     * @param markName
     * @return
     *     returns java.util.List<webservice.CarElement>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarByMark", targetNamespace = "http://webservice/", className = "webservice.GetCarByMark")
    @ResponseWrapper(localName = "getCarByMarkResponse", targetNamespace = "http://webservice/", className = "webservice.GetCarByMarkResponse")
    public List<CarElement> getCarByMark(
        @WebParam(name = "markName", targetNamespace = "")
        String markName);

    /**
     * 
     * @param modelName
     * @param modificationName
     * @param markName
     * @return
     *     returns webservice.CarElement
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findOneCar", targetNamespace = "http://webservice/", className = "webservice.FindOneCar")
    @ResponseWrapper(localName = "findOneCarResponse", targetNamespace = "http://webservice/", className = "webservice.FindOneCarResponse")
    public CarElement findOneCar(
        @WebParam(name = "markName", targetNamespace = "")
        String markName,
        @WebParam(name = "modelName", targetNamespace = "")
        String modelName,
        @WebParam(name = "modificationName", targetNamespace = "")
        String modificationName)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<webservice.SalesElement>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSales", targetNamespace = "http://webservice/", className = "webservice.GetAllSales")
    @ResponseWrapper(localName = "getAllSalesResponse", targetNamespace = "http://webservice/", className = "webservice.GetAllSalesResponse")
    public List<SalesElement> getAllSales();

    /**
     * 
     * @param car
     * @param merchant
     * @param customer
     * @return
     *     returns webservice.SalesElement
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "newSaleAndUpdateStore", targetNamespace = "http://webservice/", className = "webservice.NewSaleAndUpdateStore")
    @ResponseWrapper(localName = "newSaleAndUpdateStoreResponse", targetNamespace = "http://webservice/", className = "webservice.NewSaleAndUpdateStoreResponse")
    public SalesElement newSaleAndUpdateStore(
        @WebParam(name = "customer", targetNamespace = "")
        CustomerElement customer,
        @WebParam(name = "merchant", targetNamespace = "")
        MerchantElement merchant,
        @WebParam(name = "car", targetNamespace = "")
        CarElement car)
        throws Exception_Exception
    ;

}
