// Console 클래스
// 콘솔에서 실행 X, 터미널에서 실행 O

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("아이디 : ");
		String id = console.readLine();
		
		System.out.print("패스워드 : ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("-----------------------");
		System.out.println(id);
		System.out.println(strPassword);

	}

}
