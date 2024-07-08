import java.io.FileInputStream;

// 파일 읽기
public class FileInputStreamExample {

	public static void main(String[] args) {
		
		try {
			// 소스파일 절대경로 (\\로 경로구분) + 파일명
			FileInputStream fis = new FileInputStream("FileInputStreamExample.java");
			int data;
			
			while((data = fis.read()) != -1) { // 파일 다읽음 == -1
				System.out.write(data); // 출력
			}
			fis.close();	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
