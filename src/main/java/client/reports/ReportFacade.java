package client.reports;

import java.io.IOException;

import org.rendersnake.Renderable;

public interface ReportFacade {

	void addReport(String name, Renderable report);
	
	void removeReport(String name);
	
	void createReport() throws IOException;
}
