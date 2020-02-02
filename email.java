package emailApp;
import java.util.*;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int passwordLength = 8;
	private String department;
	private String email;
	private int mailBoxcapacity;
	private String alternateEmail;
	
	public int getPswLength() {
		return passwordLength;
	}
	
	//Create a constructor to receive fname and lname from the user
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Get the department Id
	public void setDepartment(int id) {
		if(id == 1) this.department = "Sales";
		else if(id == 2) this.department = "development";
		else if(id == 3) this.department = "Accounting";
		else System.out.println("Wrong Department ID");
	}
	
	//Generate email
	public void generateEmail(){
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() 
		+ "@" + department.toLowerCase() + "." + "webyservices.com";
	}
	
	//Generate a random password
	public void generatePassword(int len){
		String pswSet = "ABCEDFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345!@#6789$%^&*()";
		this.password = "";
		for(int i = 0; i < len; i++) {
			int index = (int) (Math.random() * pswSet.length());
			password += pswSet.charAt(index);
		}
	}
	
	//Set an alternate email
	public void setAltEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePsw(String newPsw) {
		this.password = newPsw;
	}
	
	public String getInfo() {
		return "FULL NAME: " + firstName + " " + lastName +
				"\nDEPARTMENT: " + department + 
				"\nCOMPANY EMAIL: " + email + 
				"\nPASSWORD: " + password + 
				"\nALTERNATE EMAIL: " + alternateEmail;
	}
}
