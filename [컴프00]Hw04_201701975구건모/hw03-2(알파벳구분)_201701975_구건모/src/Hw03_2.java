import java.util.Scanner;
public class Hw03_2 {
	public static void main(String[] args) {
		System.out.println("컴퓨터 공학과 201701975학번 구건모");
		Scanner input = new Scanner(System.in);
		String s;
		int git;
		System.out.print("알파벳을 입력하세요:    ");
		s = input.next().toLowerCase();
		switch (s) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.print("모음입니다.");
			break;
		default:
			System.out.print("자음입니다.");
			break;
			
		}
		input.close();
	}
}
