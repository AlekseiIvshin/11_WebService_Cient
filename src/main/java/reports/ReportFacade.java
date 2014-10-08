package reports;

import java.io.IOException;

import reports.views.ReportView;

public interface ReportFacade {

	void addReport(String name, ReportView report);
	
	void removeReport(String name);
	
	void createReport() throws IOException;
	
	void createReport(String... name) throws IOException;
}
