// �������
package hw2;

import java.util.Scanner;

public class HW01_2 {

	public static void main(String[] args) {
int a;
Scanner k = new Scanner(System.in);
System.out.print("������ �Է��� �ּ���:  ");
a = k.nextInt();
if(a % 4 == 0)
{if(a % 400 == 0) 
	System.out.print("�����Դϴ�."); else
{if(a%100 == 0) System.out.print("������ �ƴմϴ�."); else System.out.print("�����Դϴ�.");}
	}
else System.out.print("������ �ƴմϴ�.");
k.close();


	}

}
