package century.edu.project;

public class Billing {
	private double payForVisit;
	private double pricePrescription;
	
	public Billing() {
		this.payForVisit = 300.00;
		this.pricePrescription = 150;
	}
	
	public Billing(double payForVisit, double pricePerscription) {
		this.payForVisit = payForVisit;
		this.pricePrescription = pricePerscription;
	}
	
	//getters
	public double getPayForVisit() {
		return payForVisit;
	}

	public double getPricePerscription() {
		return pricePrescription;
	}
	
	//setters
	public void setPayForVisit(double payForVisit) {
		this.payForVisit = payForVisit;
	}

	public void setPricePerscription(double pricePerscription) {
		this.pricePrescription = pricePerscription;
	}
	
	//toString
	public String toString() {
		String Info = "\nPay for Visit: $" + payForVisit + "\nPrice for Perscription: $" + pricePrescription;
		return Info;
	}
}
