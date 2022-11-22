package methods;

import java.io.FileInputStream;

public class inputstream {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("D:\\Test\\gokul\\new4.txt");
			int i=fin.read();
			System.out.println((char)i);
			
			fin.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
