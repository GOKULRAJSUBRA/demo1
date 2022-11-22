package methods;

public class callbyref {
	static void run(int[]arr){
		arr[0]=10;
		}

	public static void main(String[] args) {
		int []arr= {3,1,4,3};
		run (arr);{
			System.out.println(arr[0]);
		}

	}

}
