// �ð�������ȯ ����
package hw;

import java.util.Scanner;

public class Hw01_1 {

	public static void main(String[] args) {
		int inputdata, hour, minute, second;
		Scanner k = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ���:  ");
		inputdata = k.nextInt();
		hour = inputdata / 3600 ;
		minute = inputdata % 3600 / 60;
		second = inputdata % 3600 % 60 ;
		System.out.print(hour+"�ð�"+ minute +"��"+second +"�� �Դϴ�.");
		k.close();
	}

}
