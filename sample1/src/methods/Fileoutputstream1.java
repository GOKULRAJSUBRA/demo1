package methods;

import java.io.FileOutputStream;
import java.io.IOException;


public class Fileoutputstream1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout=null;
	try
	{
	    fout=new FileOutputStream("D:\\Test\\new6.txt");
		String n="Welcome to java T point";
		byte[] b=n.getBytes();//converting string into byte array
		fout.write(b);
	
		System.out.println("success");
	}
	catch(Exception e) {
		System.out.println(e);
	}finally {
		fout.close();
	}

	}}
