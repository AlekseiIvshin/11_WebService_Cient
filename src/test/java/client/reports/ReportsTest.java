package client.reports;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;
import org.mockito.Mock;

import reports.Reports;
import reports.views.SalesTableReport;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import webservice.CarElement;
import webservice.CustomerElement;
import webservice.MerchantElement;
import webservice.SalesElement;
import static org.mockito.Mockito.*;

public class ReportsTest {

	@Mock
	SalesElement salesMock = mock(SalesElement.class);

	@Mock
	MerchantElement merchantMock = mock(MerchantElement.class);

	@Mock
	CustomerElement customerMock = mock(CustomerElement.class);

	@Mock
	CarElement carMock = mock(CarElement.class);

	@Test
	public void testCreateSalesReport() {
		when(salesMock.getMerchant()).thenReturn(merchantMock);
		when(merchantMock.getSurname()).thenReturn("MerchantSurname");
		when(salesMock.getCustomer()).thenReturn(customerMock);
		when(customerMock.getSurname()).thenReturn("Cusotmersurname");
		when(salesMock.getCar()).thenReturn(carMock);
		when(carMock.getMark()).thenReturn("Mark");
		when(carMock.getModel()).thenReturn("Model");
		when(carMock.getModification()).thenReturn("Modification");
		when(salesMock.getPrice()).thenReturn(1231.2f);
		Calendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		
		when(salesMock.getSaleDate()).thenReturn(XMLGregorianCalendarImpl.createDate(1900, 1, 1, 1));
		Reports reports = new Reports(new File("reports"));
		List<SalesElement> sales  = Arrays.asList(salesMock, salesMock, salesMock );
		reports.addReport("sale", new SalesTableReport(sales));
		try {
			reports.createReport();
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
