package century.edu.project;
/*
 * I'm writing this just so i know it changed inside GitHub
 * Did this work or no?
 * WORK
 * why is this not working?!
 * working now?
 */

public class Billing {
	private double payForVisit;
	private double pricePerscription;
	private int hours;
	private double payPerHour;
	
	public Billing(double payForVisit, double pricePerscription, int hours, double payPerHour) {
		this.payForVisit = hours * payPerHour;
		this.pricePerscription = 200.50;
		this.hours = 8;
		this.payPerHour = 31;
	}

	//this method will produce a amount pay for the visit
	public double payForVisit(int hours, double payPerHour) {
		payForVisit = hours * payPerHour;
		return payPerHour;
	}
	
	//getters
	public double getPayForVisit() {
		return payForVisit;
	}

	public double getPricePerscription() {
		return pricePerscription;
	}
	
	public int getHours() {
		return hours;
	}
	
	public double getPayPerHour() {
		return payPerHour;
	}
	
	//setters
	public void setPayForVisit(double payForVisit) {
		this.payForVisit = payForVisit;
	}

	public void setPricePerscription(double pricePerscription) {
		this.pricePerscription = pricePerscription;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}
	
	public String toString() {
		String Info = "Pay for Visit: " + payForVisit + "\nPrice for Perscription: " + pricePerscription
				+ "\nHours: " + hours + "\nPay Per Hour: " + payPerHour;
		return Info;
	}
}
