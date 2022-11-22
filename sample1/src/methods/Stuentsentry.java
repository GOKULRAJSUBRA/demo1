package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stuentsentry {
	
	public static List<Student>Ls=new ArrayList<Student>();

	public static void main(String[] args) {
	 Scanner input=new Scanner (System.in);
	 
	 //System.out.println("enter the student id");
	 //int id=input.nextInt();
	 
	 //input.nextLine();
	 
	 //System.out.println("enter the student name");
	 //String name=input.nextLine();
	 
	 
	// System.out.println("enter the student age");
	 //int age=input.nextInt();
	 
	 System.out.println("enter the number of students");
	 int n=input.nextInt();
	 
	 int i=0;
	 while(i<n) {
		 //Student obj=new Student();
		 
		 System.out.println("enter the student id");
		 int id=input.nextInt();
		 
		 input.nextLine();
		 
		 System.out.println("enter the student name");
		 String name=input.nextLine();
		 
		 
		 System.out.println("enter the student age");
		 int age=input.nextInt();
		 
		 Student obj=new Student();
		 
		 
		 obj.setId(id);
		 obj.setName(name);
		 obj.setAge(age);
		 
		 int temp=obj.getId();
		 System.out.println("student id is::"+temp);
		 //System.out.println("student id is::"+obj.getId());
		 
		 String temp1=obj.getName();
		 System.out.println("student name is::"+temp1);
		// System.out.println("student id is::"+obj.getName());

		 
		 int temp2= obj.getAge();
		 System.out.println("student age is::"+temp2);
		// System.out.println("student id is::"+obj.getAge());

		 
		 Ls.add(obj);
		 i++;
		 
		 
	 }

	}

}
