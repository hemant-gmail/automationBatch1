package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_Practice1 {
	public static void main(String[] args) {
		Map<Integer, String> city = new HashMap<>();
		city.put(1, "Pune");
		city.put(2, "Mumbai");
		city.put(3, "Thane");
		city.put(4, "Wardha");
		
		System.out.println(city.get(4));
		
	}

}
