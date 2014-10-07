
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCarByMarkAndModelResponse_QNAME = new QName("http://webservice/", "getCarByMarkAndModelResponse");
    private final static QName _NewSaleAndUpdateStore_QNAME = new QName("http://webservice/", "newSaleAndUpdateStore");
    private final static QName _GetCarByMarkResponse_QNAME = new QName("http://webservice/", "getCarByMarkResponse");
    private final static QName _GetCarById_QNAME = new QName("http://webservice/", "getCarById");
    private final static QName _Exception_QNAME = new QName("http://webservice/", "Exception");
    private final static QName _GetCarMarkList_QNAME = new QName("http://webservice/", "getCarMarkList");
    private final static QName _RemoveCar_QNAME = new QName("http://webservice/", "removeCar");
    private final static QName _GetStore_QNAME = new QName("http://webservice/", "getStore");
    private final static QName _GetAllMerchants_QNAME = new QName("http://webservice/", "getAllMerchants");
    private final static QName _FindOneCarResponse_QNAME = new QName("http://webservice/", "findOneCarResponse");
    private final static QName _GetMerchantById_QNAME = new QName("http://webservice/", "getMerchantById");
    private final static QName _GetStoreResponse_QNAME = new QName("http://webservice/", "getStoreResponse");
    private final static QName _GetCarByIdResponse_QNAME = new QName("http://webservice/", "getCarByIdResponse");
    private final static QName _GetAllMerchantsResponse_QNAME = new QName("http://webservice/", "getAllMerchantsResponse");
    private final static QName _GetCarByMark_QNAME = new QName("http://webservice/", "getCarByMark");
    private final static QName _FindCustomerByPassport_QNAME = new QName("http://webservice/", "findCustomerByPassport");
    private final static QName _AddCarResponse_QNAME = new QName("http://webservice/", "addCarResponse");
    private final static QName _GetCarMarkListResponse_QNAME = new QName("http://webservice/", "getCarMarkListResponse");
    private final static QName _FindCustomerByPassportResponse_QNAME = new QName("http://webservice/", "findCustomerByPassportResponse");
    private final static QName _FindOneCar_QNAME = new QName("http://webservice/", "findOneCar");
    private final static QName _NewSaleAndUpdateStoreResponse_QNAME = new QName("http://webservice/", "newSaleAndUpdateStoreResponse");
    private final static QName _GetMerchantByIdResponse_QNAME = new QName("http://webservice/", "getMerchantByIdResponse");
    private final static QName _GetCarByMarkAndModel_QNAME = new QName("http://webservice/", "getCarByMarkAndModel");
    private final static QName _RemoveCarResponse_QNAME = new QName("http://webservice/", "removeCarResponse");
    private final static QName _AddCar_QNAME = new QName("http://webservice/", "addCar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetCarById }
     * 
     */
    public GetCarById createGetCarById() {
        return new GetCarById();
    }

    /**
     * Create an instance of {@link GetCarByMarkResponse }
     * 
     */
    public GetCarByMarkResponse createGetCarByMarkResponse() {
        return new GetCarByMarkResponse();
    }

    /**
     * Create an instance of {@link GetCarByMarkAndModelResponse }
     * 
     */
    public GetCarByMarkAndModelResponse createGetCarByMarkAndModelResponse() {
        return new GetCarByMarkAndModelResponse();
    }

    /**
     * Create an instance of {@link NewSaleAndUpdateStore }
     * 
     */
    public NewSaleAndUpdateStore createNewSaleAndUpdateStore() {
        return new NewSaleAndUpdateStore();
    }

    /**
     * Create an instance of {@link GetCarMarkList }
     * 
     */
    public GetCarMarkList createGetCarMarkList() {
        return new GetCarMarkList();
    }

    /**
     * Create an instance of {@link GetStore }
     * 
     */
    public GetStore createGetStore() {
        return new GetStore();
    }

    /**
     * Create an instance of {@link RemoveCar }
     * 
     */
    public RemoveCar createRemoveCar() {
        return new RemoveCar();
    }

    /**
     * Create an instance of {@link GetAllMerchants }
     * 
     */
    public GetAllMerchants createGetAllMerchants() {
        return new GetAllMerchants();
    }

    /**
     * Create an instance of {@link GetCarByIdResponse }
     * 
     */
    public GetCarByIdResponse createGetCarByIdResponse() {
        return new GetCarByIdResponse();
    }

    /**
     * Create an instance of {@link GetStoreResponse }
     * 
     */
    public GetStoreResponse createGetStoreResponse() {
        return new GetStoreResponse();
    }

    /**
     * Create an instance of {@link GetAllMerchantsResponse }
     * 
     */
    public GetAllMerchantsResponse createGetAllMerchantsResponse() {
        return new GetAllMerchantsResponse();
    }

    /**
     * Create an instance of {@link FindOneCarResponse }
     * 
     */
    public FindOneCarResponse createFindOneCarResponse() {
        return new FindOneCarResponse();
    }

    /**
     * Create an instance of {@link GetMerchantById }
     * 
     */
    public GetMerchantById createGetMerchantById() {
        return new GetMerchantById();
    }

    /**
     * Create an instance of {@link AddCarResponse }
     * 
     */
    public AddCarResponse createAddCarResponse() {
        return new AddCarResponse();
    }

    /**
     * Create an instance of {@link GetCarMarkListResponse }
     * 
     */
    public GetCarMarkListResponse createGetCarMarkListResponse() {
        return new GetCarMarkListResponse();
    }

    /**
     * Create an instance of {@link GetCarByMark }
     * 
     */
    public GetCarByMark createGetCarByMark() {
        return new GetCarByMark();
    }

    /**
     * Create an instance of {@link FindCustomerByPassport }
     * 
     */
    public FindCustomerByPassport createFindCustomerByPassport() {
        return new FindCustomerByPassport();
    }

    /**
     * Create an instance of {@link FindCustomerByPassportResponse }
     * 
     */
    public FindCustomerByPassportResponse createFindCustomerByPassportResponse() {
        return new FindCustomerByPassportResponse();
    }

    /**
     * Create an instance of {@link GetMerchantByIdResponse }
     * 
     */
    public GetMerchantByIdResponse createGetMerchantByIdResponse() {
        return new GetMerchantByIdResponse();
    }

    /**
     * Create an instance of {@link GetCarByMarkAndModel }
     * 
     */
    public GetCarByMarkAndModel createGetCarByMarkAndModel() {
        return new GetCarByMarkAndModel();
    }

    /**
     * Create an instance of {@link RemoveCarResponse }
     * 
     */
    public RemoveCarResponse createRemoveCarResponse() {
        return new RemoveCarResponse();
    }

    /**
     * Create an instance of {@link NewSaleAndUpdateStoreResponse }
     * 
     */
    public NewSaleAndUpdateStoreResponse createNewSaleAndUpdateStoreResponse() {
        return new NewSaleAndUpdateStoreResponse();
    }

    /**
     * Create an instance of {@link FindOneCar }
     * 
     */
    public FindOneCar createFindOneCar() {
        return new FindOneCar();
    }

    /**
     * Create an instance of {@link AddCar }
     * 
     */
    public AddCar createAddCar() {
        return new AddCar();
    }

    /**
     * Create an instance of {@link CustomerDomain }
     * 
     */
    public CustomerDomain createCustomerDomain() {
        return new CustomerDomain();
    }

    /**
     * Create an instance of {@link CarDomain }
     * 
     */
    public CarDomain createCarDomain() {
        return new CarDomain();
    }

    /**
     * Create an instance of {@link StoreDomain }
     * 
     */
    public StoreDomain createStoreDomain() {
        return new StoreDomain();
    }

    /**
     * Create an instance of {@link MerchantDomain }
     * 
     */
    public MerchantDomain createMerchantDomain() {
        return new MerchantDomain();
    }

    /**
     * Create an instance of {@link SalesDomain }
     * 
     */
    public SalesDomain createSalesDomain() {
        return new SalesDomain();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarByMarkAndModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarByMarkAndModelResponse")
    public JAXBElement<GetCarByMarkAndModelResponse> createGetCarByMarkAndModelResponse(GetCarByMarkAndModelResponse value) {
        return new JAXBElement<GetCarByMarkAndModelResponse>(_GetCarByMarkAndModelResponse_QNAME, GetCarByMarkAndModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSaleAndUpdateStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "newSaleAndUpdateStore")
    public JAXBElement<NewSaleAndUpdateStore> createNewSaleAndUpdateStore(NewSaleAndUpdateStore value) {
        return new JAXBElement<NewSaleAndUpdateStore>(_NewSaleAndUpdateStore_QNAME, NewSaleAndUpdateStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarByMarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarByMarkResponse")
    public JAXBElement<GetCarByMarkResponse> createGetCarByMarkResponse(GetCarByMarkResponse value) {
        return new JAXBElement<GetCarByMarkResponse>(_GetCarByMarkResponse_QNAME, GetCarByMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarById")
    public JAXBElement<GetCarById> createGetCarById(GetCarById value) {
        return new JAXBElement<GetCarById>(_GetCarById_QNAME, GetCarById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarMarkList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarMarkList")
    public JAXBElement<GetCarMarkList> createGetCarMarkList(GetCarMarkList value) {
        return new JAXBElement<GetCarMarkList>(_GetCarMarkList_QNAME, GetCarMarkList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "removeCar")
    public JAXBElement<RemoveCar> createRemoveCar(RemoveCar value) {
        return new JAXBElement<RemoveCar>(_RemoveCar_QNAME, RemoveCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getStore")
    public JAXBElement<GetStore> createGetStore(GetStore value) {
        return new JAXBElement<GetStore>(_GetStore_QNAME, GetStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMerchants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAllMerchants")
    public JAXBElement<GetAllMerchants> createGetAllMerchants(GetAllMerchants value) {
        return new JAXBElement<GetAllMerchants>(_GetAllMerchants_QNAME, GetAllMerchants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findOneCarResponse")
    public JAXBElement<FindOneCarResponse> createFindOneCarResponse(FindOneCarResponse value) {
        return new JAXBElement<FindOneCarResponse>(_FindOneCarResponse_QNAME, FindOneCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMerchantById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getMerchantById")
    public JAXBElement<GetMerchantById> createGetMerchantById(GetMerchantById value) {
        return new JAXBElement<GetMerchantById>(_GetMerchantById_QNAME, GetMerchantById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getStoreResponse")
    public JAXBElement<GetStoreResponse> createGetStoreResponse(GetStoreResponse value) {
        return new JAXBElement<GetStoreResponse>(_GetStoreResponse_QNAME, GetStoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarByIdResponse")
    public JAXBElement<GetCarByIdResponse> createGetCarByIdResponse(GetCarByIdResponse value) {
        return new JAXBElement<GetCarByIdResponse>(_GetCarByIdResponse_QNAME, GetCarByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMerchantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getAllMerchantsResponse")
    public JAXBElement<GetAllMerchantsResponse> createGetAllMerchantsResponse(GetAllMerchantsResponse value) {
        return new JAXBElement<GetAllMerchantsResponse>(_GetAllMerchantsResponse_QNAME, GetAllMerchantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarByMark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarByMark")
    public JAXBElement<GetCarByMark> createGetCarByMark(GetCarByMark value) {
        return new JAXBElement<GetCarByMark>(_GetCarByMark_QNAME, GetCarByMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerByPassport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findCustomerByPassport")
    public JAXBElement<FindCustomerByPassport> createFindCustomerByPassport(FindCustomerByPassport value) {
        return new JAXBElement<FindCustomerByPassport>(_FindCustomerByPassport_QNAME, FindCustomerByPassport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addCarResponse")
    public JAXBElement<AddCarResponse> createAddCarResponse(AddCarResponse value) {
        return new JAXBElement<AddCarResponse>(_AddCarResponse_QNAME, AddCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarMarkListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarMarkListResponse")
    public JAXBElement<GetCarMarkListResponse> createGetCarMarkListResponse(GetCarMarkListResponse value) {
        return new JAXBElement<GetCarMarkListResponse>(_GetCarMarkListResponse_QNAME, GetCarMarkListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerByPassportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findCustomerByPassportResponse")
    public JAXBElement<FindCustomerByPassportResponse> createFindCustomerByPassportResponse(FindCustomerByPassportResponse value) {
        return new JAXBElement<FindCustomerByPassportResponse>(_FindCustomerByPassportResponse_QNAME, FindCustomerByPassportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findOneCar")
    public JAXBElement<FindOneCar> createFindOneCar(FindOneCar value) {
        return new JAXBElement<FindOneCar>(_FindOneCar_QNAME, FindOneCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSaleAndUpdateStoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "newSaleAndUpdateStoreResponse")
    public JAXBElement<NewSaleAndUpdateStoreResponse> createNewSaleAndUpdateStoreResponse(NewSaleAndUpdateStoreResponse value) {
        return new JAXBElement<NewSaleAndUpdateStoreResponse>(_NewSaleAndUpdateStoreResponse_QNAME, NewSaleAndUpdateStoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMerchantByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getMerchantByIdResponse")
    public JAXBElement<GetMerchantByIdResponse> createGetMerchantByIdResponse(GetMerchantByIdResponse value) {
        return new JAXBElement<GetMerchantByIdResponse>(_GetMerchantByIdResponse_QNAME, GetMerchantByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarByMarkAndModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getCarByMarkAndModel")
    public JAXBElement<GetCarByMarkAndModel> createGetCarByMarkAndModel(GetCarByMarkAndModel value) {
        return new JAXBElement<GetCarByMarkAndModel>(_GetCarByMarkAndModel_QNAME, GetCarByMarkAndModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "removeCarResponse")
    public JAXBElement<RemoveCarResponse> createRemoveCarResponse(RemoveCarResponse value) {
        return new JAXBElement<RemoveCarResponse>(_RemoveCarResponse_QNAME, RemoveCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addCar")
    public JAXBElement<AddCar> createAddCar(AddCar value) {
        return new JAXBElement<AddCar>(_AddCar_QNAME, AddCar.class, null, value);
    }

}
