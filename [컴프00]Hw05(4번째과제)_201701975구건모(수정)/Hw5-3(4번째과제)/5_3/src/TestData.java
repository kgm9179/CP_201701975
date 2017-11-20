
//컴퓨터공학과 201701975 구건모 

import java.util.Scanner;

public class TestData {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("연도 입력: ");
		Data.year = input.next();
		System.out.print("달 입력: ");
		Data.month = input.nextInt();
		System.out.print("일 입력: ");
		Data.day = input.next();
		Data.printEastern();
		Data.printWestern();
		input.close();
	}

}
