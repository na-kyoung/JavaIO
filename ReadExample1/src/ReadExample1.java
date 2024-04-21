import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream is = new FileInputStream("D:/2470348_workspace/text.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.println((char)readByte);
		}
		is.close();

	}

}
