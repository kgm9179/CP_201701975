import java.util.Scanner;

public class hw7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Bankaccount a = new Bankaccount();
		Bankaccount b = new Bankaccount();
		System.out.println("계좌 1번 정보 입력");
		a.write();
		System.out.println("계좌 2번 정보 입력");
		b.write();

		System.out.println("계좌 1번 에서 2번으로 송금할 금액:  ");
		int k = input.nextInt();
		a.sendaccount(k, b);

		System.out.println("계좌 1번 정보");
		a.print();
		System.out.println("계좌 2번 정보");
		b.print();

	}

}
