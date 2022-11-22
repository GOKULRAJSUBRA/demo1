package methods;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexamples {

	public static void main(String[] args) {
	   ArrayList<String> list=new ArrayList<String>();
       list.add("mango");
       list.add("banana");
       list.add("apple");
       list.add("orange");
       list.add("grapes");
       
      // System.out.println(list);
       
      // Iterator itr=list.iterator();
      // while(itr.hasNext()) {
       //System.out.println(itr.next());
       
       for(String fruit:list) {
       System.out.println(fruit);
       }
      
	}

}
