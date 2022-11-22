package methods;

public class multi2 implements Runnable  {
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		multi2 m1=new multi2();
		Thread t1=new Thread(m1);   //using the constructor thread(runnable r)
        t1.start();
	}

}
