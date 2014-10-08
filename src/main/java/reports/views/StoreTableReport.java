package reports.views;

import static org.rendersnake.HtmlAttributesFactory.charset;

import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.List;

import org.rendersnake.HtmlCanvas;
import org.rendersnake.internal.CharactersWriteable;

import webservice.StoreElement;

public class StoreTableReport implements ReportView {

	private List<StoreElement> stores;

	public StoreTableReport(List<StoreElement> stores) {
		this.stores = stores;
	}

	@Override
	public void renderOn(HtmlCanvas html) throws IOException {
		html.html().head().meta(charset("utf-8"))._head().body().h1()
				.content("Store report").table().tr().th().content("Store ID")
				.th().content("Car").th().content("Price").th()
				.content("Count")._tr();
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		for (StoreElement store : stores) {
			html.tr()
					.td()
					.content(store.getId() + "")
					.td()
					.content(
							store.getCar().getMark() + " "
									+ store.getCar().getModel() + " "
									+ store.getCar().getModification()).td()
					.content(decimalFormat.format(store.getPrice())).td()
					.content(store.getQuantity() + "")._tr();
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
