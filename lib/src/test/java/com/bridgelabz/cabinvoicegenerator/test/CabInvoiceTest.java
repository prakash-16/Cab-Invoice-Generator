package com.bridgelabz.cabinvoicegenerator.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.cabinvoicegenerator.main.CabInvoiceGenerator;

public class CabInvoiceTest {
	
	CabInvoiceGenerator invoice = new CabInvoiceGenerator();
	@Test
	public void checkIfCabFareIsCorrect() {
		double distance = 0.1;
		int time = 2;
		double result = invoice.calculateFare(distance, time);
		Assert.assertEquals(5,result,0.0);
	}

}
