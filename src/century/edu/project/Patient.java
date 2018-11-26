package century.edu.project;

/* 
 * working now for patient class?
 */

public class Patient {

	private String name;
	private int age;
	private String DOB;
	private String address;
	private String pNumber;
	
	public Patient(String name, int age, String DOB, String address, String pNumber) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.address = address;
		this.pNumber = pNumber;
	}
	
	//setters
	String getName() {
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
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	
	
	public String toString() {
		String Info = "Name: " + name + "\nAge: " + age + "\nDate of Birth: " + DOB + "\nAddress: " 
				+ address + "\nPhone Number: " + pNumber;
		return Info;
	}
}
