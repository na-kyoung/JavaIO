import java.io.FileReader;

// 파일 읽기
public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		// 읽을 파일의 절대경로 + 파일명
		FileReader fr = new FileReader("FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf)) != -1) { // 파일 다읽음 == -1
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
