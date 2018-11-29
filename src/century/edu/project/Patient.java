package century.edu.project;

public class Patient {

	private String name;
	private int age;
	private String DOB;
	private String address;
	private String pNumber;
	private Billing billing;
	
	public Patient(String name, int age, String DOB, String address, String pNumber, Billing billing) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.address = address;
		this.pNumber = pNumber;
		this.billing = billing;
	}
	
	//setters
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
		this.name = newName;
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
	
	//toString
	public String toString() {
		String Info = "Name: " + name + "\nAge: " + age + "\nDate of Birth: " + DOB + "\nAddress: " 
				+ address + "\nPhone Number: " + pNumber + "\nBilling Info" + billing.toString();
		return Info;
	}
}
