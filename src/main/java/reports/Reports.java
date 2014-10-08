package reports;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import reports.views.ReportView;

public class Reports implements ReportFacade {
	
	static final Logger logger = LoggerFactory.getLogger(Reports.class);
	Map<String, Renderable> reports;
	final File destDirectory;

	public Reports(File destDirectory) {
		reports = new HashMap<String, Renderable>();
		this.destDirectory = destDirectory;
	}

	@Override
	public void addReport(String name, ReportView report) {
		if (reports.containsKey(name)) {
			reports.remove(name);
		}
		reports.put(name, report);
	}

	@Override
	public void removeReport(String name) {
		if (reports.containsKey(name)) {
			reports.remove(name);
		}
	}

	@Override
	public void createReport() throws IOException {
		checkDestPath();
		for (String reportName : reports.keySet()) {
			createReport(reportName);
		}
	}

	@Override
	public void createReport(String... name) throws IOException {
		checkDestPath();
		for (String reportName : name) {
			createReport(reportName);
		}
	}

	private void checkDestPath() throws IOException {
		if (!destDirectory.exists()) {
			destDirectory.mkdir();
		}
		if (!destDirectory.isDirectory()) {
			logger.error("Destination path is not directory: '{}'",destDirectory.toPath());
			throw new IOException("Destination path is not directory '"
					+ destDirectory + "'");
		}
	}

	private void createReport(String reportName) throws IOException {
		if (!reports.containsKey(reportName)) {
			return;
		}
		try {
			reports.get(reportName).renderOn(
					new HtmlCanvas(new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream(destDirectory+File.separator+
									reportName + ".html"), "utf-8"))));
		} catch (IOException e) {
			logger.error("Report create error", e);
			throw e;
		}
	}
}
