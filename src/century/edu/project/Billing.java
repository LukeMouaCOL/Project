package century.edu.project;

public class Billing {
	private double payForVisit;
	private double pricePerscription;
	
	public Billing(double payForVisit, double pricePerscription) {
		this.payForVisit = payForVisit;
		this.pricePerscription = pricePerscription;
	}
	
	//getters
	public double getPayForVisit() {
		return payForVisit;
	}

	public double getPricePerscription() {
		return pricePerscription;
	}
	
	//setters
	public void setPayForVisit(double payForVisit) {
		this.payForVisit = payForVisit;
	}

	public void setPricePerscription(double pricePerscription) {
		this.pricePerscription = pricePerscription;
	}
	
	//toString
	public String toString() {
		String Info = "\nPay for Visit: $" + payForVisit + "\nPrice for Perscription: $" + pricePerscription;
		return Info;
	}
}
