package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for (i=1; i<=10; i++) {
			System.out.println(i);
			
	}
		//===================================
		
		int[] array1 = {11,4,65,77,80,100};

		int a;
		
		for (a=0; a<=array1.length-1; a++) {
			System.out.println(array1[a]);
			
	}
		//===================================
		
		int b;
		
		for (b=array1.length-1; b>=0 ; b--) {
			System.out.println(array1[b]);
			
	}
		//===================================
		
		for (int values:array1) {
			System.out.println(values);
		}
		//===================================

		
		String str1 = "Clean India";
		for (a=0; a<=array1.length-1; a++) {
			System.out.println(str1.charAt(a));
			
	}
		//===================================
		
		String str1_inverted = "";
		for (b=str1.length()-1; b>=0 ; b--) {
			str1_inverted = str1_inverted + str1.charAt(b);
			
	}
		System.out.println(str1_inverted);
		
		//===================================
		
		String[] words = str1.trim().split(" ");
		System.out.println(words.length);
		
		//===================================
		
		int x = 1;
		while(x<=10) {
			System.out.println(x);
			x += 1;
		}
		
		//===================================
		
				int n1 = 167576;
				while(n1>0) {
					int r = n1%10;
					System.out.println(r);
					n1 = n1/10;
				}
				
		//===================================
				
				int n2 = 0;
				do {
					System.out.println(n2);
					n2--;
				}
				while(n2 >= 0);
	}
}