package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ListsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList <String> ();
		
		list.add("Aman");
		list.add("Nisha");
		list.add("Aditya");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		
		for(int i=0; i<list.size(); i++) {
		
			System.out.println(list.get(i));
		}
		
		Iterator <String> itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}
			
	}

}
