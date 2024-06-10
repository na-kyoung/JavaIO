// OutputStream 클래스
// 데이터 형에 따른 출력

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		
		// 숫자 출력
		for(byte b=48; b<58; b++) {
			os.write(b);
		}
		os.write(10); // Enter (\n)
		
		// 영어 출력
		for(byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(10); // Enter (\n)
		
		// 한글 출력
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}

}
