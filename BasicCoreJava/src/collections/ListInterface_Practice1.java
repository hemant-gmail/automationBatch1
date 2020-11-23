package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface_Practice1 {
	public static void main(String[] args) {
		System.out.println("Array List");
		List<String> aList = new ArrayList<String>();
		aList.add("Hemant");
		aList.add("Prashant");
		aList.add("Prakash");
		aList.add("Vinod");
		aList.add("Abhay");
		
		
		for(String s: aList){
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Linked List");
		List<String> lList = new LinkedList<String>();
		lList.add("Hemant");
		lList.add("Prashant");
		lList.add("Prakash");
		lList.add("Vinod");
		lList.add("Abhay");
		
		for(String lL: lList){
			System.out.println(lL);
		}
		
		
		System.out.println();
		System.out.println("Vector");
		List<String> VList = new Vector<String>();
		VList.add("Hemant");
		VList.add("Prashant");
		VList.add("Prakash");
		VList.add("Vinod");
		VList.add("Abhay");
		
		for(String vL: VList){
			System.out.println(vL);
		}
		
	}

}
