import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("text.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break; // 다 읽으면 -1 반환 
			data += new String(readBytes, 0, readByteNo); // 바이트 배열 -> 문자열
		}
		System.out.println(data);
		is.close();

	}

}
