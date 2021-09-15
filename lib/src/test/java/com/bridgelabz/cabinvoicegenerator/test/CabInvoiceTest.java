package com.bridgelabz.cabinvoicegenerator.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.cabinvoicegenerator.main.CabInvoiceGenerator;

public class CabInvoiceTest {
	
	ArrayList<CabInvoiceGenerator> invoice = new ArrayList<CabInvoiceGenerator>();
	
	@Test
	public void shouldReturnTotaFareValueForMultipleRides() {
		invoice.add(new CabInvoiceGenerator(2.0,5.2));
		invoice.add(new CabInvoiceGenerator(5.0,7.7));
		invoice.add(new CabInvoiceGenerator(1.7,4.2));
		invoice.add(new CabInvoiceGenerator(2.9,8.8));
		CabInvoiceGenerator cabTotalFare = new CabInvoiceGenerator();
		cabTotalFare.calFareForMultipleRides(invoice);
	}
}
