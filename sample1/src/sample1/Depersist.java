package sample1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("f.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			Student s=(Student)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s.id+" "+s.name);  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  
			 }  
			
		

	}

