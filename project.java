import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class project{

  public static void main(String[] args){

	 Menu menu = new Menu();
		

	}

}


	class Menu extends JFrame implements ActionListener{
	

	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;

	JLabel label;

	  Menu(){
	setTitle("Menu");
	
	setExtendedState(JFrame.MAXIMIZED_BOTH);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Window");
	setLayout(null);

	btn1 = new JButton("Add Patient");
	btn2 = new JButton("Add Doctor");
	btn3 = new JButton("Remove Patient");
	btn4 = new JButton("Remove Doctor");
	btn5 = new JButton("Display Patients");
	btn6 = new JButton("Display Doctors");

	label = new JLabel("Hospital Managemnet System");

	btn1.setBounds(550, 150, 150, 50);
	btn2.setBounds(550, 230, 150, 50);
	btn3.setBounds(550, 310, 150, 50);
	btn4.setBounds(550, 390, 150, 50);
	btn5.setBounds(550, 470, 150, 50);
	btn6.setBounds(550, 550, 150, 50);

	label.setBounds(445, 15, 800, 120);

	Font font = new Font("Verdana", Font.PLAIN, 28);

	label.setFont(font);

	add(btn1);
	add(btn2);
	add(btn3);
	add(btn4);
	add(btn5);
	add(btn6);

	add(label);
	setVisible(true);
	

	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
	btn4.addActionListener(this);
	btn5.addActionListener(this);
	btn6.addActionListener(this);
	

	
		}

public void actionPerformed(ActionEvent ae) {

	if(ae.getSource() == btn1){

	//dispose();
	    
	 new Myframe();

		}
	else if(ae.getSource() == btn2){
		
	new Myframe2();
	}
	else if(ae.getSource() == btn3){
		
		new Myframe3();
	}
	else if(ae.getSource() == btn4){
		
		new Myframe4();
	}
	else if(ae.getSource() == btn5){
		try{
			Database.initSetup();
			Database.displayPatients();
		new DispalyPatient();
		} catch(Exception e){
		System.out.println(e.getMessage());
     }
	}
	else if(ae.getSource() == btn6){
		try{
			Database.initSetup();
			Database.DispalyDoctors();
			new DisplayDoctors();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}

	}



class Myframe extends JFrame implements ActionListener{

	JTextField txt1;
	JTextField txt2;
	JTextField txt3;
	JTextField txt4;
	JTextField txt5;
	JTextField txt6;
	JTextField txt7;
	JTextField txt8;
	JTextField txt9;
	
	
	JLabel txt10;
	JLabel txt11;
	JLabel txt12;
	JLabel txt13;
	JLabel txt14;
	JLabel txt15;
	JLabel txt16;
	JLabel txt17;
	JLabel txt18;

	JLabel label;
	JButton button;
	

	Myframe(){
	

		setExtendedState(JFrame.MAXIMIZED_BOTH);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Add Patient");
	setLayout(null);

	
	txt1 = new JTextField();
	txt2 = new JTextField();
	txt3 = new JTextField();
	txt4 = new JTextField();
	txt5 = new JTextField();
	txt6 = new JTextField();
	txt7 = new JTextField();
	txt8 = new JTextField();
	txt9 = new JTextField();

	txt10 = new JLabel("Patient_Name");
	txt11 = new JLabel("Symptoms");
	txt12 = new JLabel("Diagnosis");
	txt13 = new JLabel("Treatment_Given");
	txt14 = new JLabel("Doctor_Assigned");
	txt15 = new JLabel("Date_of_Admission");
	txt16 = new JLabel("Date_of_Discharge");
	txt17 = new JLabel("Age");
	txt18 = new JLabel("Gender");

	txt1.setBounds(550, 150, 150, 40);
	txt2.setBounds(550, 200, 150, 40);
	txt3.setBounds(550, 250, 150, 40);
	txt4.setBounds(550, 300, 150, 40);
	txt5.setBounds(550, 350, 150, 40);
	txt6.setBounds(550, 400, 150, 40);
	txt7.setBounds(550, 450, 150, 40);
	txt8.setBounds(550, 500, 150, 40);
	txt9.setBounds(550, 550, 150, 40);

	txt10.setBounds(420, 150, 100, 40);
	txt11.setBounds(435, 200, 100, 40);
	txt12.setBounds(435, 250, 60, 40);
	txt13.setBounds(415, 300, 100, 40);
	txt14.setBounds(415, 350, 100, 40);
	txt15.setBounds(405, 400, 120, 40);
	txt16.setBounds(405, 450, 120, 40);
	txt17.setBounds(445, 500, 60, 40);
	txt18.setBounds(437, 550, 60, 40);

	label = new JLabel("Add a Patient in Database");

	label.setBounds(460, 20, 800, 120);

	Font font = new Font("Verdana", Font.PLAIN, 28);

	label.setFont(font);

	button = new JButton("Save");
	button.setBounds(580, 600, 80, 60);
	
	button.addActionListener(this);


	add(txt1);
	add(txt2);
	add(txt3);
	add(txt4);
	add(txt5);
	add(txt6);
	add(txt7);
	add(txt8);
	add(txt9);
	add(txt10);
	add(txt11);
	add(txt12);
	add(txt13);
	add(txt14);
	add(txt15);
	add(txt16);
	add(txt17);
	add(txt18);
	add(button);
	add(label);
	setVisible(true);

	
	}


	
	public void actionPerformed(ActionEvent ae){

	String text1, text2,text3,text4, text5, text6, text7, text8, text9;

	
	text1 = txt1.getText();
	text2 = txt2.getText();
	text3 = txt3.getText();
	text4 = txt4.getText();
	text5 = txt5.getText();
	text6 = txt6.getText();
	text7 = txt7.getText();
	text8 = txt8.getText();
	text9 = txt9.getText();

	 if(text1.length() > 0 ){
	
	try{
		Database.initSetup();
	Database.insertPatient(text1, text2, text3, text4, text5, text6, text7, text8 , text9);
         }
	catch(Exception e){
		System.out.println(e.getMessage());

	}
	}
	else
	
	JOptionPane.showMessageDialog(null,"Fill all fields.");


	}

}



class Myframe2 extends JFrame implements ActionListener{

	JTextField txt1;
	JTextField txt2;
	JTextField txt3;
	JTextField txt4;
	JTextField txt5;
	JTextField txt6;
	
	
	JLabel txt7;
	JLabel txt8;
	JLabel txt9;
	JLabel txt10;
	JLabel txt11;
	JLabel txt12;
	JButton button;

	JLabel label;

	Myframe2(){
	

	setExtendedState(JFrame.MAXIMIZED_BOTH);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Window");
	setLayout(null);

	
	txt1 = new JTextField();
	txt2 = new JTextField();
	txt3 = new JTextField();
	txt4 = new JTextField();
	txt5 = new JTextField();
	txt6 = new JTextField();

	txt7 = new JLabel("Doctor_Name");
	txt8 = new JLabel("Specialization");
	txt9 = new JLabel("Qualification");
	txt10 = new JLabel("Contact_Number");
	txt11 = new JLabel("Years_of_Experience");
	txt12 = new JLabel("Consultation_Fee");

	txt1.setBounds(540, 150, 150, 40);
	txt2.setBounds(540, 200, 150, 40);
	txt3.setBounds(540, 250, 150, 40);
	txt4.setBounds(540, 300, 150, 40);
	txt5.setBounds(540, 350, 150, 40);
	txt6.setBounds(540, 400, 150, 40);
	

	txt7.setBounds(420, 150, 100, 40);
	txt8.setBounds(420, 200, 80, 40);
	txt9.setBounds(420, 250, 80, 40);
	txt10.setBounds(410, 300, 130, 40);
	txt11.setBounds(400, 350, 130, 40);
	txt12.setBounds(410, 400, 130, 40);

	button = new JButton("Save");
	button.setBounds(570, 460, 80, 60);

	label = new JLabel("Add a Doctor in Database");

	label.setBounds(460, 20, 800, 120);

	Font font = new Font("Verdana", Font.PLAIN, 28);

	label.setFont(font);
	
	button.addActionListener(this);


	add(txt1);
	add(txt2);
	add(txt3);
	add(txt4);
	add(txt5);
	add(txt6);
	add(txt7);
	add(txt8);
	add(txt9);
	add(txt10);
	add(txt11);
	add(txt12);
	add(button);
	add(label);
	setVisible(true);

	
	}


	
	public void actionPerformed(ActionEvent ae){

	String text1, text2,text3,text4, text5, text6;

	
	text1 = txt1.getText();
	text2 = txt2.getText();
	text3 = txt3.getText();
	text4 = txt4.getText();
	text5 = txt5.getText();
	text6 = txt6.getText();

	if(text1.length() > 0 && text2.length() > 0 && text3.length() > 0 && text4.length() > 0  && text5.length() > 0 && text6.length() > 0 ){
	
	try{
		Database.initSetup();
	Database.insertDoctor(text1, text2, text3, text4, text5, text6);
         }
	catch(Exception e){
		System.out.println(e.getMessage());

	}
	
	}
	else
	
	JOptionPane.showMessageDialog(null,"Fill all fields.");


	}

}








class Myframe3 extends JFrame implements ActionListener{

	JTextField txt1;
	JTextField txt2;

	JLabel txt3;
	JLabel txt4;

	JButton button;

	Myframe3(){
		setSize(500, 300);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Window");
		setLayout(null);

		txt1 = new JTextField();
		txt2 = new JTextField();

		txt3 = new JLabel("Patient ID");
    	txt4 = new JLabel("Patient Name");

		txt1.setBounds(180, 50, 150, 40);
        txt2.setBounds(180, 100, 150, 40);

		txt3.setBounds(80, 50, 100, 40);
		txt4.setBounds(80, 100, 80, 40);

		button = new JButton("Save");
		button.setBounds(220, 145, 80, 60);

		button.addActionListener(this);

		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(button);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){ 

		String text1, text2;


		text1 = txt1.getText();
		text2 = txt2.getText();

		if(text1.length() > 0 && text2.length() == 0){

			try{
				Database.initSetup();
				Database.removetPatientById(text1); 
				 }
			catch(Exception e){
				System.out.println(e.getMessage());

			}

			}
			else if(text1.length() == 0 && text2.length() > 0){

				try{
					Database.initSetup();
					Database.removePatientByName(text2); 
					 }
				catch(Exception e){
					System.out.println(e.getMessage());

				}

				}
				else
				JOptionPane.showMessageDialog(null,"Fill either Patient ID or Patient Name.");
	}
}






class Myframe4 extends JFrame implements ActionListener{

	JTextField txt1;
	JTextField txt2;

	JLabel txt3;
	JLabel txt4;

	JButton button;

	Myframe4(){
		setSize(500, 300);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Window");
		setLayout(null);

		txt1 = new JTextField();
		txt2 = new JTextField();

		txt3 = new JLabel("Doctor ID");
    	txt4 = new JLabel("Doctor Name");

		txt1.setBounds(180, 50, 150, 40);
        txt2.setBounds(180, 100, 150, 40);

		txt3.setBounds(80, 50, 100, 40);
		txt4.setBounds(80, 100, 80, 40);

		button = new JButton("Save");
		button.setBounds(225, 145, 80, 60);

		button.addActionListener(this);

		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(button);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){ 

		String text1, text2;


		text1 = txt1.getText();
		text2 = txt2.getText();

		if(text1.length() > 0 && text2.length() == 0){

			try{
				Database.initSetup();
				Database.removeDoctorById(text1); 
				 }
			catch(Exception e){
				System.out.println(e.getMessage());

			}

			}
			else if(text1.length() == 0 && text2.length() > 0){

				try{
					Database.initSetup();
					Database.removeDoctorByName(text2); 
					 }
				catch(Exception e){
					System.out.println(e.getMessage());

				}

				}
				else
				JOptionPane.showMessageDialog(null,"Fill either Patient ID or Patient Name.");
	}
}







class Database{


		
	static Connection connection;
	static Statement statement;
	

	static void initSetup() throws Exception {
	
	String url = "jdbc:mysql://localhost:3306/project";
	String name = "root";
	String password = "zohaib123";

	connection = DriverManager.getConnection(url, name, password );

	statement = connection.createStatement();
	
	System.out.println("initsetup executed");
	
	}
	
	 static void insertDoctor(String Full_Name, String Specialization, String Qualification, String Contact_Number, String Years_of_Experience, String Consultation_Fee) throws Exception {

	
        int experience = Integer.parseInt(Years_of_Experience);
	    float fee = Float.parseFloat(Consultation_Fee);

    	String query = "insert into doctor(Full_Name, Specialization, Qualification, Contact_Number, Years_of_Experience, Consultation_Fee ) values( '" + Full_Name + "','" + Specialization + "','" + Qualification + "', '" + Contact_Number + "', " + experience + "," + fee + ")";
    	int affected = statement.executeUpdate(query);
    	System.out.println(affected);
    	if (affected  >0)
        JOptionPane.showMessageDialog(null,"Record Inserted.");
		else {
			JOptionPane.showMessageDialog(null, "Record Insertion Failed.");
		}
	}

	


	static void removetPatientById(String text) throws Exception{

		int id = Integer.parseInt(text);

		String query = "DELETE FROM patient WHERE Patient_Id = " + (id) ;
		int affected = statement.executeUpdate(query);
		System.out.println(affected);
    		if (affected  ==1)
		JOptionPane.showMessageDialog(null,"Record Removed.");
		else
		JOptionPane.showMessageDialog(null, "Record Insertion Failed.");
		
	}

	static void removePatientByName(String text) throws Exception{
	
		String query = "DELETE FROM patient WHERE Full_Name = '" + text + "'";
		int affected = statement.executeUpdate(query);
		System.out.println(affected);
			if (affected  ==1)
		JOptionPane.showMessageDialog(null,"Record Removed.");
		else
		JOptionPane.showMessageDialog(null, "Record Insertion Failed.");

	}


	static void insertPatient(String Full_Name, String Symptoms, String Diagnosis, String Treatment_Given, String Doctor_Assigned, String Date_of_Admission, String Date_of_Discharge, String Age, String Gender) throws Exception {

		int age = Integer.parseInt(Age);

		String query = "INSERT INTO patient(Full_Name, Symptoms, Diagnosis, Treatment_Given, Doctor_Assigned, Date_of_Admission, Date_of_Discharge, Age, Gender) VALUES ('"+Full_Name+"', '"+Symptoms+"', '"+Diagnosis+"', '"+Treatment_Given+"', '"+Doctor_Assigned+"', '"+Date_of_Admission+"', '"+Date_of_Discharge+"', "+Age+", '"+Gender+"')";
		int affected = statement.executeUpdate(query);
    	System.out.println(affected);
    	if (affected  > 0)
       JOptionPane.showMessageDialog(null,"Patient record added.");
	}

	static void patientAppointment(String Full_Name,String symptoms,String doctor,String date,String Age,String gender)throws Exception{
		int age = Integer.parseInt(Age);
		String query = "insert into appointment(Full_Name, Symptoms, Doctor_Assigned, DateOfAppointmnet, Age, Gender) values ('"+Full_Name+"', '"+symptoms+"', '"+doctor+"', '"+date+"', '"+age+"', '"+gender+"')";
		int affected = statement.executeUpdate(query);
    	System.out.println(affected);
    	if (affected  > 0)
        JOptionPane.showMessageDialog(null,"Patient record added.");
		
	}

	
	static void removeDoctorById(String text) throws Exception{

		int id = Integer.parseInt(text);

		String query = "DELETE FROM doctor WHERE Doctor_Id = " + (id) ;
		int affected = statement.executeUpdate(query);
		System.out.println(affected);
    		if (affected  ==1)
		JOptionPane.showMessageDialog(null,"Record Removed.");
		else
		JOptionPane.showMessageDialog(null, "Record Insertion Failed.");
		
	}


	
	static void removeDoctorByName(String text) throws Exception{
	
		String query = "DELETE FROM doctor WHERE Full_Name = '" + text + "'";
		int affected = statement.executeUpdate(query);
		System.out.println(affected);
			if (affected  ==1)
		JOptionPane.showMessageDialog(null,"Record Removed.");
		else
		JOptionPane.showMessageDialog(null, "Record Insertion Failed.");
	}

	static void displayPatients() throws SQLException {
    String query = "SELECT Patient_Id, Full_Name, Diagnosis, Treatment_Given, Doctor_Assigned, Age FROM patient";
    ResultSet resourceHandle2 = statement.executeQuery(query);
	int rows=0;
	while(resourceHandle2.next()){
		rows++;
	}
	ResultSet resourceHandle = statement.executeQuery(query);
	int i=0;
	String[][] rowData = new String[rows][6];
	
    while (resourceHandle.next()) {
		rowData[i][0]= String.valueOf(resourceHandle.getInt(1));
        rowData[i][1] = resourceHandle.getString(2);
		rowData[i][2]= resourceHandle.getString(3);
		rowData[i][3]= resourceHandle.getString(4);
		rowData[i][4]= resourceHandle.getString(5);
		rowData[i][5]= String.valueOf(resourceHandle.getInt(6));
        i++;
    }
	DispalyPatient.sendPatientData(rowData);
}


	static void DispalyDoctors() throws Exception{

		String query = "SELECT Doctor_Id, Full_Name, Specialization, Qualification, Years_of_Experience, Consultation_Fee, Gender FROM doctor";
		ResultSet resourceHandle1 = statement.executeQuery(query);
		int rows = 0, i= 0;
		while(resourceHandle1.next()){
			rows++;
		}
		ResultSet resourceHandle2 = statement.executeQuery(query);
		String[][] rowData = new String[rows][7];

		while (resourceHandle2.next()){

			rowData[i][0] = String.valueOf(resourceHandle2.getInt(1));
		    rowData[i][1]= resourceHandle2.getString(2);
		    rowData[i][2]= resourceHandle2.getString(3);
		    rowData[i][3]= resourceHandle2.getString(4);
		    rowData[i][4]= String.valueOf(resourceHandle2.getInt(5));
			rowData[i][5]= String.valueOf(resourceHandle2.getInt(6));
			rowData[i][6]= resourceHandle2.getString(7);
        i++;

		}
		DisplayDoctors.sendDoctorData(rowData);
	}



}

class DispalyPatient {
    static void sendPatientData(String[][] data) {
        JFrame f = new JFrame();
        f.setTitle("Patient Data");
        String[] columns = {"Patient_ID", "Full_Name", "Diagnosis", "Treatment", "Doctor_Assigned", "Age"};
        JTable table = new JTable(data, columns);
        JScrollPane sp = new JScrollPane(table); 
        f.add(sp);
       // f.setSize(600, 300);
	   f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);
    }
}


class DisplayDoctors {
    static void sendDoctorData(String[][] data) {
        JFrame f = new JFrame();
        f.setTitle("Doctor Data");
        String[] columns = {"Doctor_Id", "Full_Name", "Specialization", "Qualification", "Years_of_Experience", "Consultation_Fee", "Gender"};
        JTable table = new JTable(data, columns);
        JScrollPane sp = new JScrollPane(table); 
        f.add(sp);
       // f.setSize(600, 300);
	   f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);
	}
}


