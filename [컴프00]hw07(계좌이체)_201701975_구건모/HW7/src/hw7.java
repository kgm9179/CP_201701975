import java.util.Scanner;

public class hw7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Bankaccount a = new Bankaccount();
		Bankaccount b = new Bankaccount();
		System.out.println("���� 1�� ���� �Է�");
		a.write();
		System.out.println("���� 2�� ���� �Է�");
		b.write();

		System.out.println("���� 1�� ���� 2������ �۱��� �ݾ�:  ");
		int k = input.nextInt();
		a.sendaccount(k, b);

		System.out.println("���� 1�� ����");
		a.print();
		System.out.println("���� 2�� ����");
		b.print();

	}

}
