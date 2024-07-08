import java.io.File;
import java.io.FileWriter;

// 파일에 글 작성
public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		File file = new File("text.txt"); // 작성할 파일경로 + 파일명
//		FileWriter fw = new FileWriter(file, true); // 덮어쓰기 X (기존내용에 추가됨)
		FileWriter fw = new FileWriter(file, false); // 덮어쓰기 O (기존내용 리셋 후 작성)
		
		// 작성
		fw.write("FileWriter는 한글로 된" + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}

}
