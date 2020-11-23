package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorClass_Practice1 {
	public static void main(String[] args) {
		Set<Integer> cityName = new HashSet<>();
		cityName.add(1);
		cityName.add(2);
		cityName.add(4);
		cityName.add(3);
		cityName.add(5);
		
		Iterator<Integer> itr = cityName.iterator();
		
		while (itr.hasNext()) {
			Integer strValue = (Integer) itr.next();
			System.out.println(strValue);
		}

	}

}
