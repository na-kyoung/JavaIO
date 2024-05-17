import java.io.FileReader;
import java.io.Reader;

public class ReadCharExample1 {
	
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("text.txt");
		int readData;

		while(true) {
			readData = reader.read();
			if(readData == -1) break; // 읽을 데이터 없음
			System.out.println((char)readData);
		}
		
		reader.close();
	}

}
