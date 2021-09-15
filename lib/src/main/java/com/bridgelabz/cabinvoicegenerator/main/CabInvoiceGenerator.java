package com.bridgelabz.cabinvoicegenerator.main;

import java.util.ArrayList;

public class CabInvoiceGenerator {

	public static int COST_PER_KM = 10;
	public static int COST_PER_MIN = 1;
	public static int MIN_FARE = 5;
	public double distance;
	public double time;
	public double totalFare = 0;
	public int noOfRides = 0;
	
	public CabInvoiceGenerator(){
		
	}
	
	public CabInvoiceGenerator(double distance, double time) {
		this.distance = distance;
		this.time = time;
	}

	public double calculateFare() {
		double result = (distance * COST_PER_KM) + (time * COST_PER_MIN);
		if (result < MIN_FARE) {
			return MIN_FARE;
		}
		return result;
	}
	public void calFareForMultipleRides(ArrayList<CabInvoiceGenerator> person) {
		person.stream().forEach(n -> {
			totalFare = totalFare + n.calculateFare();
			noOfRides++;
			System.out.println("The average fare for ride " + noOfRides + " is " + n.calculateFare());
		});
		System.out.println("The number of rides are " + noOfRides  + " and total fare is " + totalFare);
	}

}
