package app;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import client.Client;
import client.SimpleClient;
import reports.ReportFacade;
import reports.Reports;
import reports.views.ReportView;
import reports.views.SalesTableReport;
import reports.views.StoreTableReport;

public class App {

	static final Logger logger = LoggerFactory.getLogger(Reports.class);

	Client client = new SimpleClient();
	ReportFacade reportFacade = new Reports(new File("bin//htmlreports"));

	public void createReports() throws Exception {
		setSaleReport();
		setStoreReport();
		try {
			reportFacade.createReport();
		} catch (IOException e) {
			logger.error("Create report error", e);
			throw new Exception(e);
		}
	}

	private void setSaleReport() throws Exception {
		ReportView saleReport = new SalesTableReport(client.getAllSales());

		reportFacade.addReport("AllSales", saleReport);

	}

	private void setStoreReport() throws Exception {
		ReportView storeReport = new StoreTableReport(client.getAllStores());

		reportFacade.addReport("AllStores", storeReport);
	}
}
