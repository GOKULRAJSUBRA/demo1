package methods;

public class callbyvalue {
	
	static void run(int x,int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println(x);
		System.out.println(y);

	}
		

	public static void main(String[] args) {
		int x=10;
		int y=20;
		run(x,y);{
		System.out.println(x);
		System.out.println(y);
			
		}
			
		

	}

}
