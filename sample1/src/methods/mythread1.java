package methods;

public class mythread1 {
//main method
	public static void main(String[] args) {
		//
		Thread t=new Thread("my first thread");
		t.start();
		
		String str=t.getName();
		System.out.println(str);

	}

}
