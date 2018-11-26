package century.edu.project;

import java.util.Scanner;

public class Driver {

	
	public static void main(String[] args) {
		//variables for Patient class
		int age;
		String DOB;
		String pNumber;
		String name;
		String address;
		//variables for Billing class
		double visit = 0;
		double pricePerscription = 0;
		int hours = 0;
		double payPerHour = 0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Name: ");
		name = kb.nextLine();
		System.out.println("Address: ");
		address = kb.nextLine();
		System.out.println("Age: ");
		age = kb.nextInt();
		kb.nextLine();
		System.out.println("Date of Birth: (mm/dd/yyyy)");
		DOB = kb.nextLine();
		System.out.println("Phone Number: (xxx-xxx-xxxx)");
		pNumber = kb.nextLine();
		System.out.println("=====================================");
		System.out.println("Displaying Personal Info");
		System.out.println("=====================================");

		
		
		//	public Patient(String name, int age, int DOB, String address, int pNumber)
		Patient p1 = new Patient(name, age, DOB, address, pNumber);
		System.out.println(p1.toString());
		
		//	public Billing(double payForVisit, double pricePerscription, int hours, double payPerHour)
		
		System.out.println("=====================================");
		System.out.println("Displaying Billing Info");
		System.out.println("=====================================");

		Billing b1 = new Billing(visit, pricePerscription, hours, payPerHour);
		System.out.println(b1.toString());

		
		
		kb.close();

		
		
		
	}
}
