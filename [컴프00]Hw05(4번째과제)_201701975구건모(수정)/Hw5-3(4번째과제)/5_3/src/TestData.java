
//��ǻ�Ͱ��а� 201701975 ���Ǹ� 

import java.util.Scanner;

public class TestData {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		Data.year = input.next();
		System.out.print("�� �Է�: ");
		Data.month = input.nextInt();
		System.out.print("�� �Է�: ");
		Data.day = input.next();
		Data.printEastern();
		Data.printWestern();
		input.close();
	}

}
