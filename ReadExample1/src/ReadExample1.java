import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("text.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break; // 다 읽으면 -1 반환
			System.out.println((char)readByte); // 문자열 반환 후 출력
		}
		is.close();

	}

}
