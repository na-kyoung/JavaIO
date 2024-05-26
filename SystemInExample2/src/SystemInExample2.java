// 문자열 입력 및 출력
// InputStream 객체로 문자 입력받음
// 입력한 문자를 byte 배열에 저장
// 변수에 Enter키를 제외한 바이트를 읽어 문자열로 변환 및 출력

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		
		System.out.print("이름 : ");
		int nameBytes = is.read(datas); // byte 배열에 저장
		String name = new String(datas, 0, nameBytes-2); // Enter키를 제외한 바이트를 읽어 문자열로 변환
		// byte배열, 시작인덱스, 읽은 바이트수-2
		// -2 하는 이유 : Enter키 제외
		
		System.out.print("하고 싶은 말 : ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("이름 : " + name);
		System.out.println("하고 싶은 말 : " + comment);

	}

}
