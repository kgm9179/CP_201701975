
//201701975���Ǹ�
import java.util.Scanner;

public class hw5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		char[] arr = new char[100];
		System.out.println("���� ���ڿ��� �Է��ϼ���.");
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
		System.out.println("������ ������ " + b + "�̰� ������ ������" + a + "�̴�. ");

		sc.close();
	}
}