class Passport{

String passortOffice;
String dob;
String givenName;
String surName;
String email;
String password;
String confirmPassword;


public Passport(String office,String db,String gName,String sName,String emails,String passwords,String cPassword){
	passortOffice = office;
	dob = db;
	givenName = gName;
	surName = sName;
	email = emails;
	password = passwords;
	confirmPassword = cPassword;
	
	System.out.println(" Object created by use of constructor");
	
}

public boolean verifyPassword(String password , String confirmPassword){

/*check the length
length of password should be greater than 6 and less than 16*/

  int compare = password.length();
  int compare1 = confirmPassword.length();
  System.out.println("........................................................................... ");
  System.out.println(" The password length :"+compare+"  confirmPassword length :"+compare1);
  
 
 
  if(compare  >=6 && compare <=16 && password==confirmPassword){
	  System.out.println(" Object creation for Passport is successfull"); 
	  System.out.println(" Check the Details: ");
	  displayDetails();
	  return true;
  }else{
	  System.out.println(" Please enter valid password : Mismatch");
	   return false;
  }

}

public void displayDetails(){
	System.out.println("                   The Passport Office for verification  :"+ passortOffice);
	System.out.println("                   The Given Name is "+givenName);
	System.out.println("                   The Sur Name is :"+surName);
	System.out.println("                   The Date Of Birth is :"+ dob);
	System.out.println("                   The email id is :"+email);
	System.out.println("                   The password is :"+password);
	System.out.println("                   The confirmPassword :"+confirmPassword);
	System.out.println("                   ");
	
	
}
}