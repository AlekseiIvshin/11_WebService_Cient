package app;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import client.Client;
import client.SimpleClient;
import client.reports.ReportFacade;
import client.reports.Reports;
import client.reports.SalesReport;
import client.reports.StoreReport;

public class App {

	static final Logger logger = LoggerFactory.getLogger(Reports.class);
	
	Client client = new SimpleClient();
	ReportFacade reportFacade = new Reports();
	
	public void createReports() throws Exception{
		createSaleReport();
		createStoreReport();
	}
	
	private void createSaleReport() throws Exception{
		SalesReport saleReport = new SalesReport(client.getAllSales());
		
		reportFacade.addReport("AllSales", saleReport);
		try {
			reportFacade.createReport();
		} catch (IOException e) {
			logger.error("Create report error",e);
			throw new Exception(e);
		}
	}
	
	private void createStoreReport() throws Exception{
		StoreReport storeReport = new StoreReport(client.getAllStores());
		
		reportFacade.addReport("AllStores", storeReport);
		try {
			reportFacade.createReport();
		} catch (IOException e) {
			logger.error("Create report error",e);
			throw new Exception(e);
		}
	}
}
