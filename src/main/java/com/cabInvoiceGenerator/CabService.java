package com.cabInvoiceGenerator;

public class CabService {

	public static void main(String[] args) {
		System.out.println("Welcome to Cab Invoice Generator");

	}

	public double invoiceGenrator(double distance, int time) {
		double totalFare = 0.0;
		if (distance < 1 && time <= 10) {
			totalFare = 5.00;
		} else {
			totalFare = distance * 10 + time;
		}

		return totalFare;
	}

}
