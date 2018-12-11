package century.edu.project;

public class Billing {
	private double payForVisit;
	private double pricePrescription;
	private double fullBill;
	private Prescription prescription;
	
	public Billing() {
		this.payForVisit = 20;
		this.pricePrescription = 100;
		fullBillPrice();
	}
	
	public Billing(double payForVisit, double pricePerscription) {
		this.payForVisit = payForVisit;
		this.pricePrescription = pricePerscription;
		fullBillPrice();
	}
	
	//total billing (prescription + visit price)
	//pay for visit
	
	public double fullBillPrice() {
		this.fullBill = payForVisit + pricePrescription + 5;
		return fullBill;
	}
	
	
	//getters
	public Prescription getPrescription() {
		return prescription;
	}

	public double getPayForVisit() {
		return payForVisit;
	}

	public double getPricePerscription() {
		return pricePrescription;
	}
	
	//setters
	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}
	
	public void setPayForVisit(double payForVisit) {
		this.payForVisit = payForVisit;
	}

	public void setPricePerscription(double pricePerscription) {
		this.pricePrescription = pricePerscription;
	}
	
	//toString
	public String toString() {
		String Info = "\nPay for Visit: $" + payForVisit + "\nPrice for Perscription: $" + pricePrescription +"\nFull Bill: " + fullBill;
		return Info;
	}
	
	public static void main(String[] args) {
		Billing b1 = new Billing();
		System.out.println(b1.toString());
	}
}
