package methods;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

class book{
	int id,quantity;
	String name,author,publisher;

 public book(int id,String name,String author,String publisher,int quantity) {
	 this.id=id;
	 this.name=name;
	 this.author=author;
	 this.publisher=publisher;
	 this.quantity=quantity;
 }}

public class bookexample {

	public static void main(String[] args) {
		List<book> list=new ArrayList<book>();
		book b1=new book(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    book b2=new book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
	    book b3=new book(103,"Operating System","Galvin","Wiley",6);
        //list.add(b1);
        //list.add(b2);
        //list.add(b3);
        list.add(0,b1);
        list.add(1,b2);
        list.add(2,b3);
        
        book obj=list.get(0);
        System.out.println(obj.id+obj.name+obj.author+obj.quantity);
       // for(book B:list) {
        	//System.out.println(B.id+B.name+B.author+B.publisher+B.quantity);
        }

		

	

}
