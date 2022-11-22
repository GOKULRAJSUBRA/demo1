package methods;


public class callbyvalue1 {
	int data=50;
	void change(int data) {
		data=data+50;
	}

	public static void main(String[] args) {
		//int data=50;
		callbyvalue1 obj=new callbyvalue1();
		System.out.println(obj.data);
		obj.change(100);
		System.out.println(obj.data);

	}

}
