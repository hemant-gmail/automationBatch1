package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
				//Map
//HashMap				//Hashtable
//Newly	Added Class		//Legacy/Synchronized
//allow nul key			//Doesn't allow null key
		
		Map<Integer, String > map = new HashMap<>();
		map.put(1,"Hemant");
		map.put(2,"Prajyot");
		map.put(3,"Anand");
		map.put(4,"Rekha");
		
		//System.out.println(map.get(3));
		
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i+1));			
		}
	}
}
