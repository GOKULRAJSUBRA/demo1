package methods;

import java.util.ArrayList;

public class Arraylistgetset {

	public static void main(String[] args) {
		 ArrayList<String> list=new ArrayList<String>();
	       list.add("mango");
	       list.add("banana");
	       list.add("apple");
	       list.add("orange");
	       list.add("grapes");
	       
	     System.out.println("Returning elements"+list.get(1));
	     
	     list.set(1, "dates");
	     
	     for(String fruit:list) {
	    	 System.out.println(fruit);
	     }
	      

	}

}
