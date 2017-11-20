
//컴퓨터공학과 201701975 구건모 
import java.util.Scanner;

public class hw5_2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("문자열입력: ");
		String InputString = k.next();
		String TransChar = "";

		for (int i = 0; i < InputString.length(); i++) {
			char c = InputString.charAt(i);
			if (65 <= c && c <= 90) {// 대문자
				TransChar += String.valueOf(c).toLowerCase();
			} else if (c >= 97 && c <= 122) {// 소문자
				TransChar += String.valueOf(c).toUpperCase();
			} else {
				TransChar += c;
			}
		}

		System.out.println(TransChar);
		k.close();

	}

}