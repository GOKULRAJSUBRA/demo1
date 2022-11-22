package methods;

import java.util.HashMap;
import java.util.Map;

public class Hashmapeg1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "mango");
		map.put(2, "apple");
		map.put(3, "orange");
		map.put(4, "grapes");
		
		System.out.println("iterating haspmap");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println("1st key value"+map.get(1));
		System.out.println(map.replace(1, "mango","dates"));
		System.out.println("1st key value"+map.get(1));
	
	}

}
