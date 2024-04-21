import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("D:/2470348_workspace/text.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3); // 2부터 3개 읽음
		
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
//			System.out.println((char)readBytes[i]);
		}// 65 66 67 = a b c
		
		is.close();

	}

}
