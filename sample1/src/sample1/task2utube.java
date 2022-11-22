package sample1;

import java.util.Scanner;

public class task2utube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    int a,b,c,d,f;
	    double e;
	    String g;
	    
	    System.out.println("enter the name");
	    g=sc.nextLine();
	    
	    System.out.println("enter the second number");
	    b=sc.nextInt();
	    
	    System.out.println("enter the first number");
	    a=sc.nextInt();
	    
	    d=a*b;
	    e=(double)a/b;
	    f=a%b;
	    
	    System.out.println("arthemetic operation addition::"+(a+b+g));
	    System.out.println("arthemetic operation multiplication::"+d);
	    System.out.println("arthemetic operation diuvide::"+e);
	    System.out.println("arthemetic operation module::"+f);
	    
	    

	}

}
