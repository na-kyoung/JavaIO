// Scanner 클래스
// 데이터 입출력

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력 > ");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("정수 입력 > ");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.print("실수 입력 > ");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
		System.out.println();
	}

}
