package reports.views;

import static org.rendersnake.HtmlAttributesFactory.charset;

import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.rendersnake.HtmlCanvas;

import webservice.SalesElement;

public class SalesTableReport implements ReportView {

	private List<SalesElement> sales;

	public SalesTableReport(List<SalesElement> sales) {
		this.sales = sales;
	}

	@Override
	public void renderOn(HtmlCanvas html) throws IOException {
		html.html().head().meta(charset("utf-8"))._head().body().h1().content("Sales report").table().tr().th()
				.content("Sale ID").th().content("Merchant").th()
				.content("Customer").th().content("Car").th().content("Sum")
				.th().content("Sale date")._tr();
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		for (SalesElement sale : sales) {
			html.tr()
					.td()
					.content(sale.getId() + "")
					.td()
					.content(sale.getMerchant().getSurname())
					.td()
					.content(sale.getCustomer().getSurname())
					.td()
					.content(
							sale.getCar().getMark() + " "
									+ sale.getCar().getModel() + " "
									+ sale.getCar().getModification())
					.td()
					.content(decimalFormat.format(sale.getPrice()))
					.td()
					.content(
							dateFormat
									.format(DatatypeConverter.parseDate(
											sale.getSaleDate().toXMLFormat())
											.getTime()))._tr();
		}

		html._table()._body()._html().toHtml();
		Writer writer = null;
		try {
			writer = html.getOutputWriter();
			writer.write(html.toHtml());
		} finally {
			writer.close();
		}
	}
}
