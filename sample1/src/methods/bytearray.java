package methods;

import java.io.FileInputStream;

public class bytearray {

	public static void main(String[] args) {
		try {
			
		FileInputStream fin=new FileInputStream("D:\\Test\\gokul\\new4.txt");
		int i;
		
		byte[] b=new byte[120];
		fin.read(b);
		for(byte a:b)
			System.out.print((char)a);
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
	

	}

}
