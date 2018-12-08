package century.edu.project;

public class Doctor {
	
	private String fName;
	private String lName;
	private int yearsExperience;
	private int age;
	private String department;
	private String phoneNumber;
	
	public Doctor(String fName, String lName, int yearsExperience, int age, String department, String phoneNumber) {
		this.fName = fName;
		this.lName = lName;
		this.yearsExperience = yearsExperience;
		this.age = age;
		this.department = department;
		this.phoneNumber = phoneNumber;
	}
	
	public String getFName() {
		return this.fName;
	}
	public String getLName() {
		return this.lName;
	}
	public int getYearsExperience() {
		return this.yearsExperience;
	}
	public int getAge() {
		return this.age;
	}
	public String getDepartment() {
		return this.department;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setFName(String Fname) {
		this.fName = Fname;
	}
	public void setLName(String LName) {
		this.lName = LName;
	}
	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		String DoctorInfo = "First Name: " + fName +"Last Name: " + lName + "\nYears of Experience: " + yearsExperience + "\nAge: " + age
		+ "\nDepartment: " + department + "\nPhone Number: " + phoneNumber;	
		return DoctorInfo;
		
	}

}
