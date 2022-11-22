package methods;

import java.util.HashMap;
import java.util.Map;

public class Hashmapduplicate {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "mango");//put elements in map
		map.put(2, "apple");
		map.put(3, "orange");
		map.put(1, "grapes");//trying duplicate key
		
		System.out.println("iterating hashmap...");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		


	}

}
