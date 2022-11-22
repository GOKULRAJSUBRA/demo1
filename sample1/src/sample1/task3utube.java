package sample1;

import java.util.Scanner;

public class task3utube {
	public static void main(String args[])
	{
		//compound assignments
		Scanner sc =new Scanner(System.in);
		
		int a,b,c;
		double d,e;
		
		System.out.println("enter the value");
		a=sc.nextInt();
		System.out.println("enter the value");
		b=sc.nextInt();
		System.out.println("enter the value");
		c=sc.nextInt();
		System.out.println("enter the value");
		d=sc.nextDouble();
		System.out.println("enter the value");
		e=sc.nextDouble();
		
		a+=100;
		b-=100;
		c*=100;
		d/=100;
		e%=100;
		
		System.out.println("final value of a::"+a);
		System.out.println("final value of a::"+b);
		System.out.println("final value of a::"+c);
		System.out.println("final value of a::"+d);
		System.out.println("final value of a::"+e);
	}

}
