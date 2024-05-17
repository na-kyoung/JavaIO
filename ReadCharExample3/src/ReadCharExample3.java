import java.io.FileReader;
import java.io.Reader;

public class ReadCharExample3 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("text.txt");
		int readCharNo;
		char[] cbuf = new char[4]; // 크기 4
		
		readCharNo = reader.read(cbuf, 1, 2); // 1번째, 2번째만 읽음 / 0번방, 3번방 비어있음
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	}

}
