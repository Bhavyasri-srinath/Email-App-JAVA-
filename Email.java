package emailapp;

import java.util.*;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String emailSyntax;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private String companySuffix="abcTech.com";
	
	//constructor to receive first name and last name
	public Email(String firstName,String lastName,int passwordLength) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		//call a method asking for department-return the department
		this.department = setDepartment();
		//System.out.println("Department : "+this.department);
		//call a method calling a random password
		this.password=setPassword(passwordLength);
		//System.out.println("Random password is: "+this.password);
		emailSyntax=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+companySuffix;
		//System.out.println("Email Id: "+emailSyntax);
	}
	//ask for the department
	private String setDepartment() {
		System.out.print("New Worker "+firstName+"\nEnter DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accountants\n0 for None\nEnter Department code");
		Scanner sc=new Scanner(System.in);
		int deptcod=sc.nextInt();
		sc.close();
		if(deptcod==1) {return "sales.";}
		else if(deptcod==2) {return "Development.";}
		else if(deptcod==3) {return "Accountant.";}
		else {return "";}
	}
	//ask for the random password
	private String setPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char Password[]=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			Password[i]=passwordSet.charAt(rand);
		}
		return new String(Password);
	}
	//set the mail box capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	//set the alternative email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailboxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	public String showInfo() {
		return "NAME : "+firstName+" "+lastName+
			   "\nEMAIL : "+emailSyntax+
			   "\nMail box Capacity : "+mailBoxCapacity+"mb";
				
	}
}
