import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("text.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3); // 8바이트 중 2번쨰부터 3개 읽어서 배열에 담음
		
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
//			System.out.println((char)readBytes[i]);
		}// 65 66 67 = a b c
		
		is.close();

	}

}
