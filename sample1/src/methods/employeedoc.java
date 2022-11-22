package methods;

import java.util.Scanner;

public class employeedoc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the employee name");
		String empname=sc.nextLine();
		
		System.out.println("enter the employee id number");
		double empidno=sc.nextDouble();
		
		System.out.println("enter the employee age");
		int empage=sc.nextInt();
		
		System.out.println("enter the employee salary");
		double empsalary=sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("enter the employee department");
		String department=sc.nextLine();
		
		Employee doc=new Employee(empname,empidno,empage,empsalary,department);
		
		System.out.println(doc.empname);
		System.out.println(doc.empage);
		System.out.println(doc.empidno);
		System.out.println(doc.department);
		System.out.println(doc.empsalary);
		
		
		

	}

}
