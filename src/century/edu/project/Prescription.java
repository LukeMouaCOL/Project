package century.edu.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prescription {
		
		private long rxNumber;
		private String name;
		private int dosage;
		private int amount;
		private Date dateFilled;
		private int price;
		
		public Prescription(String name, int dosage, int amount, int price) {
			this.rxNumber = genRxNumber();
			this.name = name;
			this.dosage = dosage;
			this.amount = amount;
			this.dateFilled = new Date();
			this.price = genPrescriptionPrice();
		}
		
		public Prescription() {
			
		}
		
		//Generates a random rX number.
		public long genRxNumber() {
			int max = 99999999;
			int min = 10000000;
			int random = (int) (Math.random() * (max - min)) + min;
			this.rxNumber = (long)random;
			return rxNumber;
		}
		
		//Initializes the prescription price to $5.
		public int genPrescriptionPrice() {
			this.price = 5;
			return price;
		}
		
		
		public long getRxNumber() {
			return rxNumber;
		}
		public String getName() {
			return name;
		}
		public int getDosage() {
			return dosage;
		}
		public int getAmount() {
			return amount;
		}
		public Date getDate() {
			return dateFilled;
		}
		public int getGenPrescriptionPrice() {
			return price;
		}
		
		public void setRxNumber(int rxNumber) {
			this.rxNumber = rxNumber;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setDosage(int dosage) {
			this.dosage = dosage;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		//ToString Override. 
		public String toString() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String date1 = sdf.format(dateFilled);
			
			String prescriptionInfo = "Rx Number: " + rxNumber + "\nName: " + name + "\nDosage: " + dosage
			+ " mg" + "\nAmount: " + amount + " pills" + "\nDate Filled: " + date1 + "\nPrice: " + price;
			return prescriptionInfo;
		}
		
		

	}
