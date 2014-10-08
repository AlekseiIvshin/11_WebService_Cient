package client.reports;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reports implements ReportFacade {
	static final Logger logger = LoggerFactory.getLogger(Reports.class);
	Map<String, Renderable> reports;

	public Reports() {
		reports = new HashMap<String, Renderable>();
	}

	public void addReport(String name, Renderable report) {
		if (reports.containsKey(name)) {
			reports.remove(name);
		}
		reports.put(name, report);
	}

	public void removeReport(String name) {
		if (reports.containsKey(name)) {
			reports.remove(name);
		}
	}

	public void createReport() throws IOException {
		for (String reportName : reports.keySet()) {
			try {
				reports.get(reportName).renderOn(
						new HtmlCanvas(new BufferedWriter(
								new OutputStreamWriter(new FileOutputStream(
										reportName + ".html"), "utf-8"))));
			} catch (IOException e) {
				logger.error("Sales report create error", e);
				throw e;
			}
		}
	}
}
