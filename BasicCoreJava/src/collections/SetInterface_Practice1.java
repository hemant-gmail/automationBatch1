package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface_Practice1 {
	public static void main(String[] args) {
		Set<Integer> ids = new HashSet<>();
		ids.add(4);
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(2);

		for (int i : ids) {
			System.out.println(i);
		}

		System.out.println();
		Set<String> cityName = new HashSet<>();
		cityName.add("Pune");
		cityName.add("Wardha");
		cityName.add("Nagpur");
		cityName.add("Mumbai");
		cityName.add("Indor");
		cityName.add("Nagpur");

		for (String s : cityName) {
			System.out.println(s);
		}

		System.out.println();
		cityName = new LinkedHashSet<>();
		cityName.add("Pune");
		cityName.add("Wardha");
		cityName.add("Nagpur");
		cityName.add("Mumbai");
		cityName.add("Indor");
		cityName.add("Nagpur");

		for (String s : cityName) {
			System.out.println(s);
		}

		System.out.println();
		cityName = new TreeSet<>();
		cityName.add("Pune");
		cityName.add("Wardha");
		cityName.add("Nagpur");
		cityName.add("Mumbai");
		cityName.add("Indor");
		cityName.add("Nagpur");

		for (String s : cityName) {
			System.out.println(s);
		}
		
	}
}
