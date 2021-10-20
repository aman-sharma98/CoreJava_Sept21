package test;

public class SwitchExample {
	public static void main(String[] args) {

		int age =10;
		
		switch(age){
		case 18:
		case 19:
			System.out.println("Eligible");
		
		case 17:
			System.out.println("Will be Eligible Next year");
			
		case 15:
			System.out.println("Eligible");
			
		default:
			System.out.println("Default Break");
		}
	}
}