package methods;

import java.util.Scanner;

public class Studentdoc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//for(int i=1;i<=2;i++) {
		
		//System.out.println("enter the student id");
		//id=sc.nextInt();
	
		//sc.nextLine();
		
		//System.out.println("enter the student name");
		//name=sc.nextLine();
		
		//System.out.println("enter the student age");
		//age=sc.nextInt();

		//}
		
		Student s1=new Student(1001,"gokul",12);
		
		Student s2=new Student(1002,"deepak",21);
		
		System.out.println(s1.id);
		System.out.println(s2.name);
		
		
		

	}

}
