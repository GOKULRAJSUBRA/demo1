package methods;

// class inchild {
	class inchild extends inparent{
		
	String name1="ravikumar";//global variable// access all the method in the variable

	public static void main(String[] args) {
		String name="gokul";
		inchild c1=new inchild();
		c1.ears(name);
		c1.chin(name);
		c1.nose();
		c1.eyes();
		}
	void ears(String name) { 
		System.out.println("child ears");
		System.out.println(super.name1);
		System.out.println(name1);
		System.out.println(name);
	}
	void chin(String name) {
		System.out.println("child chin");
		System.out.println(name);
	}
	
 
}
