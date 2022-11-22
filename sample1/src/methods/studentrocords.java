package methods;

public class studentrocords {

	public static void main(String[] args) {
		int m1=90;
		int m2=88;
		int m3=98;
		
		Grade sc=new Grade();
		int total=sc.Total(m1,m2,m3);
		int avg=sc.Average(m1,m2,m3);
		int max=sc.Maximum(m1,m2,m3);
		//sc.maximum(m1,m2,m3);
		
		System.out.println(total);
		System.out.println(avg);
		System.out.println(max);
		

	}

}
