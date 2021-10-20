package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Fname = "Aman";
		String Lname = "Sharma";
		
		String FullName = Fname + " " + Lname;
		System.out.println("Full Name is "+FullName);
		System.out.println("Full Name Length is "+FullName.length());
		System.out.println("Full Name Uppercase is "+FullName.toUpperCase());
		
		String Newname = FullName.replace(" ", ".");
		System.out.println("New Name is "+Newname);
	}

}
