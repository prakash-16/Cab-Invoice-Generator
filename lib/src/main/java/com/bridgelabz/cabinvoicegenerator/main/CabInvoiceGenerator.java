package com.bridgelabz.cabinvoicegenerator.main;

import java.util.ArrayList;
import java.util.HashMap;

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
	public double calFareForMultipleRides(ArrayList<CabInvoiceGenerator> person) {
		person.stream().forEach(n -> {
			totalFare = totalFare + n.calculateFare();
			noOfRides++;
		});
		return totalFare;
	}
	
	public void calInvoiceForMultipleUsers(HashMap<String, ArrayList<CabInvoiceGenerator>> rideRepository) {
		rideRepository.forEach((key,value) -> {
			double fare = calFareForMultipleRides(value);
			System.out.println("User-"+key + " has total fare " + fare);
		});
	}
	
	

}
