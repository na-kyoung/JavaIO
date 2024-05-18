// 배열에 문자열을 담아 파일에 작성

import java.io.FileWriter;
import java.io.Writer;

public class WriteCharExample1 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("text.txt");
		
		char[] data = "홍길동".toCharArray();
		
		// for문을 통해 배열 인덱스 접근
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}

}
