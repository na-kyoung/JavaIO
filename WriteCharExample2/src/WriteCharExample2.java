// 배열에 문자열을 담아 파일에 작성

import java.io.FileWriter;
import java.io.Writer;

public class WriteCharExample2 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("text.txt");
		
		char[] data = "권나경".toCharArray();
		
		writer.write(data); // 메서드를 통해 작성
		
		writer.flush();
		writer.close();
	}

}
