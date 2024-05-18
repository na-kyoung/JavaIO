// 변수에 문자열을 담아 파일에 작성

import java.io.FileWriter;
import java.io.Writer;

public class WriteCharExample4 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("text.txt");
		
		String data = "Hello World";
		
		writer.write(data, 3, 2); // 메서드를 통해 작성 (3번째부터 2개 - lo)
		
		writer.flush();
		writer.close();
	}
}
