package sample1;

import java.util.Scanner;

public class taskutube1user {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a;
		//double b;
		//String name;
		//short c;
		//byte d;
		//String emp no;
		//long e;
		//boolean j;
		//char f;
		
		System.out.println("enter the value");
		int a=sc.nextInt();
		
		System.out.println("enter the decimal value");
		double b=sc.nextDouble();
		
	    sc.nextLine();
		
        System.out.println("enter the name");
        String name=sc.nextLine();
        
        
        System.out.println("enter the value");
        short c=sc.nextShort();
        
        System.out.println("enter the 8 bit value");
        byte d=sc.nextByte();
        
        sc.nextLine();
        
        System.out.println("enter employee number");
        String k=sc.nextLine();
        
        System.out.println("enter the gender of customer");
        char s=sc.next().charAt(0);
        
        sc.nextLine();
        

        System.out.println("enter the customer location");
        String l=sc.nextLine();
        
        
        
        //process
        a=a++;
        b+=100;
        
        System.out.println(" final value::"+a);
        System.out.println("final decimal value::"+b);
        System.out.println("customer name::"+name+" He is good");
        System.out.println("value::"+c);
        System.out.println("value::"+d);
        System.out.println("empnumber::"+k);
        System.out.println("gender::"+s);
        System.out.println("location::"+l);
        
        
	}

}
