import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

// 디렉토리 및 파일 생성 & 출력
public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if(dir.exists() == false) { dir.mkdirs(); } // 디렉토리가 존재하지 않을 경우, 디렉토리 생성
		if(file1.exists() == false) { file1.createNewFile(); } // 파일이 존재하지 않을 경우, 빈 파일 생성
		if(file2.exists() == false) { file2.createNewFile(); } // 파일이 존재하지 않을 경우, 빈 파일 생성
		if(file3.exists() == false) { file3.createNewFile(); } // 파일이 존재하지 않을 경우, 빈 파일 생성
		
		File temp = new File("c:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles(); // 디렉토리에 있는 파일 목록 배열에 저장 (하위 디렉토리 폴더 파일 포함 X)
		
		System.out.println("날짜			시간	형태	크기	이름");
		System.out.println("--------------------------------------------------------");
		
		// 하위 디렉토리 및 파일 출력
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified()))); // 최근 수정 날짜 출력
			if(file.isDirectory()) { // 하위 디렉토리 확인
				System.out.print("\t<DIR>\t\t\t" + file.getName()); // 하위 디렉토리 폴더명
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // 파일 (파일크기/파일명)
			}
			System.out.println();
		}

	}

}
