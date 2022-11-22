package methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class nongeneric {

	public static void main(String[] args) {
	  ArrayList list=new ArrayList<>();
	  list.add("mango");
      list.add("banana");
      list.add("apple");
      list.add("orange");
      list.add("grapes");
      
      Collections.sort(list);
      
      for(Object fr:list) {
    	  System.out.println(fr);
      }
      System.out.println("sorting numbers...");
      ArrayList list1=new ArrayList();
      
      list1.add(121);
      list1.add(100);
      list1.add(126);
      list1.add(100);
      list1.add(111);
      list1.add(118);
      
      Collections.sort(list1);
      
      for(Object assending:list1) {
    	  System.out.println(assending);
      }
    

	}

}
