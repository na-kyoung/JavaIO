import java.io.FileInputStream;
import java.io.FileOutputStream;

// 파일 복사 (이미지)
public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// 절대 경로
		String originalFileName = "house.jpg"; // 기존 파일 경로 + 파일명
		String targetFileName = "C:\\Temp\\workspace\\house.jpg"; // 복사할 경로 + 파일명
		
		FileInputStream fis = new FileInputStream(originalFileName); // 경로를 통해 파일 가져옴
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while((readByteNo = fis.read(readBytes)) != -1) { // 파일 다읽음 == -1
			fos.write(readBytes, 0, readByteNo); // 출력
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사 완료!");

	}

}
