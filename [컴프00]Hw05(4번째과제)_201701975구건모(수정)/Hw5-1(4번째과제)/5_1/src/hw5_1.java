
//201701975구건모
import java.util.Scanner;

public class hw5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		char[] arr = new char[100];
		System.out.println("영어 문자열을 입력하세요.");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.trim().charAt(i);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '\0')
				break;
			if (arr[i] != ' ') {
				if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
					a++;
				else
					b++;
			}
		}
		System.out.println("자음의 개수는 " + b + "이고 모음의 개수는" + a + "이다. ");

		sc.close();
	}
}