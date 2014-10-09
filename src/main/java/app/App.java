package app;

import java.io.File;
import java.io.IOException;

import org.rendersnake.Renderable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import reports.ReportFacade;
import reports.html.ReportsHTML;
import reports.views.CustomerInfo;
import reports.views.SalesTableReport;
import reports.views.StoreTableReport;
import client.Client;
import client.SimpleClient;

public class App {

	static final Logger logger = LoggerFactory.getLogger(App.class);

	Client client = new SimpleClient();
	ReportFacade reportFacade = new ReportsHTML(new File("bin//htmlreports"));
	
	public static void main(String[] args){
		App app = new App();
		try {
			app.createReports();
		} catch (Exception e) {
			logger.error("Report exception", e);
		}
	}

	public void createReports() throws Exception {
		setSaleReport();
		setStoreReport();
		setCustomerInfoReport("9100","100101");
		try {
			reportFacade.createReport();
		} catch (IOException e) {
			logger.error("Create report error", e);
			throw new Exception(e);
		}
	}

	private void setSaleReport() throws Exception {
		Renderable saleReport = new SalesTableReport(client.getAllSales());

		reportFacade.addReport("AllSales", saleReport);

	}

	private void setStoreReport() throws Exception {
		Renderable storeReport = new StoreTableReport(client.getAllStores());

		reportFacade.addReport("AllStores", storeReport);
	}
	
	private void setCustomerInfoReport(String passportSeries, String passportNumber){
		Renderable cusotmerInfo = new CustomerInfo(client.findCustomerByPassport(passportSeries, passportNumber));
		reportFacade.addReport("customerInfo", cusotmerInfo);
	}
}
