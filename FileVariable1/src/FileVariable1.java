import java.io.File;

// 사용하고 있는 OS가 어떤 문자를 반환하는지 확인
public class FileVariable1 {

	public static void main(String[] args) {
		System.out.println("Path seperator = " + File.pathSeparator); // ;
		System.out.println("Path seperator = " + File.pathSeparatorChar); // ;
		System.out.println("Seperator = " + File.separator); // \
		System.out.println("Seperator = " + File.separatorChar); // \

	}

}
