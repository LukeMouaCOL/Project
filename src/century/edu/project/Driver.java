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
		System.out.println("\n=====================================");
		System.out.println("Displaying Info");
		System.out.println("=======================================");

		//just hardcoding the two double variables for the Billing, will change later
		Prescription per1 = new Prescription("Allergy Medicine", 20, 20);
		Billing b1 = new Billing();
		Patient p1 = new Patient(name, age, DOB, address, pNumber, b1, per1);
		System.out.println(p1.toString());
		
		System.out.println("\n=====================================");
		System.out.println("Displaying Doctor Info");
		System.out.println("=======================================");
		Doctor d1 = new Doctor("George Lopez", 20, 45, "That good department", "690-720-8581");
		System.out.println(d1.toString());
		
		
		kb.close();

		
		
		
	}
}
