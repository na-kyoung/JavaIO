import java.io.FileReader;
import java.io.Reader;

public class ReadCharExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("text.txt");
		int readCharNo;
		char[] cbuf = new char[2]; // 크기 2
		String data = "";

		while(true) {
			readCharNo = reader.read(cbuf); // 2글자씩 읽음
			if(readCharNo == -1) break; // 읽을 데이터 없음
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);		
		reader.close();
	}

}
