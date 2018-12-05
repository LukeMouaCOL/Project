package century.edu.project;

public class Billing {
	private double payForVisit;
	private double pricePrescription;
	private double price;
	private double fullBill;
	
	Prescription per = new Prescription();
	
	public Billing(double payForVisit, double pricePerscription) {
		this.payForVisit = payForVisit;
		this.pricePrescription = pricePerscription;
	}
	
	//total billing (prescription + visit price)
	//pay for visit
	public double payPrice() {
		this.price = 20;
		return price;
	}
	
	public double fullBillPrice() {
		this.fullBill = payPrice() + per.genPrescriptionPrice();
		return fullBill;
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
		String Info = "\nPay for Visit: $" + payForVisit + "\nPrice for Perscription: $" + pricePrescription + "Full Bill: " + fullBill;
		return Info;
	}
}
