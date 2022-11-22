package methods;

import java.io.FileReader;

public class Filereader {
	public static void main(String[] args) throws Exception {
		FileReader obj=new FileReader("D:\\Test\\gokul\\new4.txt");
		int i=0;
		while((i=obj.read())!=-1) {
			System.out.println((char)i);
			obj.close();
			
		}
	}

}