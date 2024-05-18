// 배열에 문자열을 담아 파일에 작성

import java.io.FileWriter;
import java.io.Writer;

public class WriteCharExample3 {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("text.txt");
		
		char[] data = "이주은".toCharArray();
		
		writer.write(data, 1, 2); // 메서드를 통해 작성 (1번째부터 2개 - 주은)
		
		writer.flush();
		writer.close();
	}

}
