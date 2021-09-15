package com.bridgelabz.cabinvoicegenerator.main;

public class CabInvoiceGenerator {

	public static int COST_PER_KM = 10;
	public static int COST_PER_MIN = 1;
	public static int MIN_FARE = 5;

	public double calculateFare(double distance, int time) {
		double result = (distance * COST_PER_KM) + (time * COST_PER_MIN);
		if (result < MIN_FARE) {
			return MIN_FARE;
		}
		return result;
	}

}
