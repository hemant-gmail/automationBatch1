package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Hemant");
		list.add("Amruta");
		list.add("Rekha");
		list.add("Prajyot");
		list.add("Vikas");
		list.add("Hemant");
		
		System.out.println("===Print using For loop===");
		System.out.println();		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Print all using list " + list);
		
		System.out.println();		
		System.out.println("===Print using For each loop===");
		System.out.println();
		
		for (String string : list) {
			System.out.println(string);			
		}
		
		System.out.println();		
		System.out.println("===Print using itarate===");
		System.out.println();
	
		

		System.out.println();		
		System.out.println("===Object type collection===");
		System.out.println();
		List list1= new ArrayList<>();
		list1.add("hemnt");
		list1.add(12);
		list1.add("OP");

		for (Object str : list1) {
			System.out.println(str);
		}
		
		//ArrayList: 
		//Implemetes dynamic array  
		//Its better in accessing and storing the data
		
		//LinkedList   
		//Doubly linkedlist
		//its better in manipulate
		
		
		//Vector:
		//Synchronized//Legacy class//Thread safe
		//ArrayList (grows by 50%) and Vector grows by 100%
		//Dynamic array
	}
}
