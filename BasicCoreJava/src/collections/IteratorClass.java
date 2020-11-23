package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorClass {
	public static void main(String[] args) {
		Set<String> name = new HashSet<>();
		name.add("Hemant");
		name.add("Rekha");
		name.add("Anand");
		name.add("Amruta");

		//Iterator is interface
		Iterator<String> itName = name.iterator();
		
//		System.out.println(itName.hasNext());
//		System.out.println(itName.next());
		System.out.println("------------------------");
		while (itName.hasNext()) {
			System.out.println(itName.next());			
		}

/*		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
*/		

	}
}
