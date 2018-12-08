package century.edu.project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;





public class HospitalGUI extends JFrame {
	//Doctor labels
	private JLabel docFNameLabel = new JLabel("First Name");	
	private JLabel docLNameLabel = new JLabel("Last Name");	
	private JLabel experienceLabel = new JLabel("Years of Experience");	
	private JLabel docAgeLabel = new JLabel("Age");	
	private JLabel departmentLabel = new JLabel("Department");	
	private JLabel docPhoneLabel = new JLabel("Phone Number");	
	
	//Patient labels
	private JLabel pacNameLabel = new JLabel("Full Name");	
	private JLabel pacAgeLabel = new JLabel("Age");	
	private JLabel DOBLabel = new JLabel("Birth Date");	
	private JLabel addressLabel = new JLabel("First Name");	
	private JLabel pacPhoneLabel = new JLabel("Phone Number");	
	private JLabel presNameLabel = new JLabel("Prescription Name");	
	
	//Doctor text fields
	private JTextField docFNameTextField = new JTextField(10);
	private JTextField docLNameTextField = new JTextField(10);
	private JTextField experienceTextField = new JTextField(10);
	private JTextField docAgeTextField = new JTextField(10);
	private JTextField departmentTextField = new JTextField(10);
	private JTextField docPhoneTextField = new JTextField(10);
	private JLabel docConsoleLabel = new JLabel("Doctor Console");
	
	//Patient text fields
	private JTextField pacNameTextField = new JTextField(10);
	private JTextField pacAgeTextField = new JTextField(10);
	private JTextField DOBTextField = new JTextField(10);
	private JTextField addressTextField = new JTextField(10);
	private JTextField pacPhoneTextField = new JTextField(10);
	private JTextField presNameTextField = new JTextField(10);
	private JLabel pacConsoleLabel = new JLabel("Patient Console");
	
	//Patient and doctor console fields
	private JTextArea docConsoleTextField = new JTextArea();
	private JTextArea pacConsoleTextField = new JTextArea();

	//Patient and doctor buttons
	private JButton addBtn1 = new JButton("Add Doctor");
	private JButton addBtn2 = new JButton("List Doctors");
	private JButton addBtn3 = new JButton("Clear Doctors");
	private JButton addBtn4 = new JButton("Add Patient");
	private JButton addBtn5 = new JButton("List Patients");
	private JButton addBtn6 = new JButton("Clear Patients");
	
	//Doctor panels
	private JPanel docTopPanel = new JPanel(new GridLayout(2, 3));
	private JPanel docMiddlePanel = new JPanel(new FlowLayout());
	private JPanel docBottomPanel = new JPanel(new BorderLayout());
	
	//Patient panels
	private JPanel pacTopPanel = new JPanel(new GridLayout(2, 3));
	private JPanel pacMiddlePanel = new JPanel(new FlowLayout());
	private JPanel pacBottomPanel = new JPanel(new BorderLayout());
	
	//Arrays of Doctor and Patient
	private Doctor[] doctor = new Doctor[100];
	private int count1;
	private Patient[] patient = new Patient[100];
	private int count2;
	
	
	
	
	//Event listeners
	private class AddBtnListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		String callingBtn = e.getActionCommand();
		Billing billing = new Billing();
		Prescription prescription = new Prescription();
		
		if (callingBtn.equals("List Doctors")) {
			String allDoctors = "";
			
			for(int i = 0; i < count1; i++) {
				allDoctors += doctor[i].toString() + "\n";
			}
			docConsoleTextField.append(allDoctors + "\n");
		
		} else if (callingBtn.equals("Add Doctor")) {
			String fName = docFNameTextField.getText();
			String lName = docLNameTextField.getText(); 
			int yearsExperience = Integer.parseInt(experienceTextField.getText());
			int age = Integer.parseInt(docAgeTextField.getText());
			String department = departmentTextField.getText();
			String phoneNumber = docPhoneTextField.getText();
			
			//string int int string string
			Doctor doc = new Doctor(fName, lName, yearsExperience, age, department, phoneNumber);
			doctor[count1] = doc;
			count1++;
			
			docConsoleTextField.append(fName + " has been added!\n");
		
		} else if (callingBtn.equals("Clear Doctors")) {
			docConsoleTextField.setText("");
		} else if (callingBtn.equals("List Patients")) {
			String allPatients = "";
			
			for(int i = 0; i < count2; i++) {
				allPatients += patient[i].toString() + "\n";
			}
			pacConsoleTextField.append(allPatients + "\n");
			
		} else if (callingBtn.equals("Add Patient")) {
			String name = pacNameTextField.getText();
			int age = Integer.parseInt(pacAgeTextField.getText());
			String DOB = DOBTextField.getText();
			String address = addressTextField.getText();
			String pNumber = pacPhoneTextField.getText();
			String name1 = presNameTextField.getText();
			
			Patient pat = new Patient(name, age, DOB, address, pNumber, billing, prescription);
			patient[count2] = pat;
			count2++;
			
			pacConsoleTextField.append(name + " has been added!\n");
			
		}else if (callingBtn.equals("Clear Patients")) {
			pacConsoleTextField.setText("");
		}
		
		
	}
	
}
	
	public HospitalGUI(String title) {
		super(title);
		
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(8, 1));
		
		addBtn1.addActionListener(new AddBtnListener());
		addBtn2.addActionListener(new AddBtnListener());
		addBtn3.addActionListener(new AddBtnListener());
		addBtn4.addActionListener(new AddBtnListener());
		addBtn5.addActionListener(new AddBtnListener());
		addBtn6.addActionListener(new AddBtnListener());


		
		createDocTopPanel();
		createDocMiddlePanel();
		createDocBottomPanel();
		
		createPacTopPanel();
		createPacMiddlePanel();
		createPacBottomPanel();
		
		add(docTopPanel);
		add(docMiddlePanel);
		add(docBottomPanel);
		
		add(pacTopPanel);
		add(pacMiddlePanel);
		add(pacBottomPanel);
	}
	
	//Create Doc panels
	private void createDocTopPanel() {
		docTopPanel.add(docFNameLabel);
		docTopPanel.add(docLNameLabel);
		docTopPanel.add(experienceLabel); 
		docTopPanel.add(docAgeLabel);
		docTopPanel.add(departmentLabel);
		docTopPanel.add(docPhoneLabel);
		
		docTopPanel.add(docFNameTextField);
		docTopPanel.add(docLNameTextField);
		docTopPanel.add(experienceTextField);
		docTopPanel.add(docAgeTextField);
		docTopPanel.add(departmentTextField);
		docTopPanel.add(docPhoneTextField);
	}
	private void createDocMiddlePanel() {
		docMiddlePanel.add(addBtn1);
		docMiddlePanel.add(addBtn2);
		docMiddlePanel.add(addBtn3);
	}
	private void createDocBottomPanel() {
		docBottomPanel.add(docConsoleLabel, BorderLayout.NORTH);
		JScrollPane txtAreaView = new JScrollPane(docConsoleTextField);
		docBottomPanel.add(txtAreaView, BorderLayout.CENTER);
	}
	
	//Create Patient panels
	private void createPacTopPanel() {
		pacTopPanel.add(pacNameLabel);
		pacTopPanel.add(pacAgeLabel);
		pacTopPanel.add(DOBLabel);
		pacTopPanel.add(addressLabel);
		pacTopPanel.add(pacPhoneLabel);
		pacTopPanel.add(presNameLabel);
		
		pacTopPanel.add(pacNameTextField);
		pacTopPanel.add(pacAgeTextField);
		pacTopPanel.add(DOBTextField);
		pacTopPanel.add(addressTextField);
		pacTopPanel.add(pacPhoneTextField);
		pacTopPanel.add(presNameTextField);
	}
	private void createPacMiddlePanel() {
		docMiddlePanel.add(addBtn4);
		docMiddlePanel.add(addBtn5);
		docMiddlePanel.add(addBtn6);
	}
	private void createPacBottomPanel() {
		pacBottomPanel.add(pacConsoleLabel, BorderLayout.NORTH);
		JScrollPane txtAreaView = new JScrollPane(pacConsoleTextField);
		pacBottomPanel.add(txtAreaView, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		HospitalGUI frame = new HospitalGUI("Hospital Management");
		frame.setVisible(true);
		
	}



}


