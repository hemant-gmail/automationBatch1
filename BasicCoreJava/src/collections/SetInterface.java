package collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		
		Set<Integer> ids = new HashSet<>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(2);
		ids.add(6);
		ids.add(7);
		
	/*	System.out.println(ids);
		for (Integer integer : ids) {
			System.out.println(integer);
		}
		System.out.println();
		System.out.println(ids.size());*/

		System.out.println();
		System.out.println("HashSet");
		//Random display
		Set<String> name = new HashSet<>();
		name.add("Hemant");
		name.add("Anand");
		name.add("Amruta");
		name.add("Anand");
		name.add("Prajyot");

		System.out.println(name);
		for (String string : name) {
			System.out.println(string);
		}

		System.out.println();
		System.out.println("LinkedHashSet");
		Set<String> name1 = new LinkedHashSet<>();
		//Display as store (Insertion order)
		name1.add("Hemant");
		name1.add("Anand");
		name1.add("Amruta");
		name1.add("Anand");
		name1.add("Prajyot");

		System.out.println(name1);
		for (String string : name1) {
			System.out.println(string);
		}

		System.out.println();
		System.out.println("Tree Set");
		//Alphabetically display (Default sort in assending order)
		Set<String> name2 = new TreeSet<>();
		name2.add("Hemant");
		name2.add("Anand");
		name2.add("Amruta");
		name2.add("Anand");
		name2.add("Prajyot");

		System.out.println(name2);
		for (String string : name2) {
			System.out.println(string);
		}

		
	}
}
