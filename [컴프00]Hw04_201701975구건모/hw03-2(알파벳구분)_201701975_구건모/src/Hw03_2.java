import java.util.Scanner;
public class Hw03_2 {
	public static void main(String[] args) {
		System.out.println("��ǻ�� ���а� 201701975�й� ���Ǹ�");
		Scanner input = new Scanner(System.in);
		String s;
		int git;
		System.out.print("���ĺ��� �Է��ϼ���:    ");
		s = input.next().toLowerCase();
		switch (s) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.print("�����Դϴ�.");
			break;
		default:
			System.out.print("�����Դϴ�.");
			break;
			
		}
		input.close();
	}
}
