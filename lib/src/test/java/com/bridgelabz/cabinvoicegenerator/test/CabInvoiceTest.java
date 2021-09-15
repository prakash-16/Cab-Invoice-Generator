package com.bridgelabz.cabinvoicegenerator.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.cabinvoicegenerator.main.CabInvoiceGenerator;

public class CabInvoiceTest {
	
	ArrayList<CabInvoiceGenerator> invoice = new ArrayList<CabInvoiceGenerator>();
	HashMap<String, ArrayList<CabInvoiceGenerator>> rideRepository = new HashMap<String, ArrayList<CabInvoiceGenerator>>();
	
	@Test
	public void enhancedInvoiceReturns_AvgFarePerRide_NoOfRides_TotaFare() {
		invoice.add(new CabInvoiceGenerator(2.0,5.2));
		invoice.add(new CabInvoiceGenerator(5.0,7.7));
		invoice.add(new CabInvoiceGenerator(1.7,4.2));
		invoice.add(new CabInvoiceGenerator(2.9,8.8));
		rideRepository.put("A",invoice);
		invoice.add(new CabInvoiceGenerator(3.0,5.2));
		invoice.add(new CabInvoiceGenerator(5.0,7.7));
		invoice.add(new CabInvoiceGenerator(2.7,4.2));
		invoice.add(new CabInvoiceGenerator(2.9,8.8));
		rideRepository.put("B",invoice);
		CabInvoiceGenerator cabTotalFare = new CabInvoiceGenerator();
		cabTotalFare.calInvoiceForMultipleUsers(rideRepository);
	}
}
