package reports.views;

import static org.rendersnake.HtmlAttributesFactory.charset;

import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.Renderable;

import webservice.SalesElement;

/**
 * Create sales table report.
 * 
 * @author Aleksei_Ivshin
 *
 */
public class SalesTableReport implements Renderable {

	/**
	 * Sales data.
	 */
	private List<SalesElement> sales;

	public SalesTableReport(List<SalesElement> sales) {
		this.sales = sales;
	}

	@Override
	public void renderOn(HtmlCanvas html) throws IOException {
		HtmlCanvas view = createView(html);
		writeView(view);
	}

	/**
	 * Write rendered view.
	 * 
	 * @param html
	 *            rendered view
	 * @throws IOException
	 */
	private void writeView(HtmlCanvas html) throws IOException {

		String text = html.toHtml();
		int lastPos = text.lastIndexOf("\n");
		Writer writer = null;
		try {
			writer = html.getOutputWriter();
			writer.write(html.toHtml(), 0, lastPos);
		} finally {
			writer.close();
		}
	}

	/**
	 * Render HTML view.
	 * 
	 * @param html
	 *            starting HTML
	 * @return result report view
	 * @throws IOException
	 */
	private HtmlCanvas createView(HtmlCanvas html) throws IOException {
		html.html().head().meta(charset("utf-8"))._head().body().h1()
				.content("Sales report").table().tr().th().content("Sale ID")
				.th().content("Merchant").th().content("Customer").th()
				.content("Car").th().content("Sum").th().content("Sale date")
				._tr();
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
		return html;
	}
}
