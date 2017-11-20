
public class Hw03_1 {

	public static void main(String[] args) { //commit
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.println("컴퓨터 공학과 201701975학번 구건모");
		System.out.println("fn(n은 양의정수)는 n번째 수열을 의미합니다.");
		System.out.println(n1 + "<- f0");
		System.out.println(n2 + "<- f1");
		for (int i = 1; i < 10; i++) {

			n3 = n1 + n2;
			System.out.println(n3 + "<-f" + (i + 1));
			n1 = n2;
			n2 = n3;

		}
	}

}