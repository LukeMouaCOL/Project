package century.edu.project;

public class Patient {

	private String name;
	private int age;
	private String DOB;
	private String address;
	private String pNumber;
	private Billing billing;
	private Prescription prescription;
	
	public Patient(String name, int age, String DOB, String address, String pNumber, Billing billing, Prescription prescription) {
		setName(name);
		this.age = age;
		this.DOB = DOB;
		this.address = address;
		this.pNumber = pNumber;
		this.billing = billing;
		this.prescription = prescription;
	}
	
	//setters
	public Prescription getPrescription() {
		return prescription;
	}
	
	public Billing getBilling() {
		return billing;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getpNumber() {
		return pNumber;
	}
	
	//Setters
	public void setBilling(Billing newBilling) {
		this.billing = newBilling;
	}
	
	public void setName(String newName) {
		if (newName != null && newName.length() > 0) {
			this.name = newName;
			}
		else {
			System.out.println("Please enter a name");
		}

	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public void setDOB(String newDOB) {
		this.DOB = newDOB;
	}

	public void setAddress(String newAddress) {
		this.address = newAddress;
	}

	public void setpNumber(String newPNumber) {
		this.pNumber = newPNumber;
	}
	public void setPrescription(Prescription newPrescription) {
		this.prescription = newPrescription;
	}
	
	//toString
	public String toString() {
		String Info = "\nPERSONAL INFO: " + "\nName: " + name + "\nAge: " + age + "\nDate of Birth: " + DOB + "\nAddress: " 
				+ address + "\nPhone Number: " + pNumber + "\nBILLING INFO: " + billing.toString() + "\nPRESCRIPTION: ";
		if(prescription != null) {
				prescription.toString();
				Info += prescription.toString();
		}
		return Info;
	}

}
