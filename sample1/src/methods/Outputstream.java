package methods;

import java.io.FileOutputStream;

public class Outputstream {

	public static void main(String[] args) {
		try {
		FileOutputStream fout=new FileOutputStream("D:\\Test\\new5.txt");
		fout.write(67);
		fout.close();
		System.out.println("success in your life...");

	}catch(Exception e) {
		System.out.println(e);
	}

}
}
