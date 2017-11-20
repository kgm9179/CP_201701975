// 윤년과제
package hw2;

import java.util.Scanner;

public class HW01_2 {

	public static void main(String[] args) {
int a;
Scanner k = new Scanner(System.in);
System.out.print("연도를 입력해 주세요:  ");
a = k.nextInt();
if(a % 4 == 0)
{if(a % 400 == 0) 
	System.out.print("윤년입니다."); else
{if(a%100 == 0) System.out.print("윤년이 아닙니다."); else System.out.print("윤년입니다.");}
	}
else System.out.print("윤년이 아닙니다.");
k.close();


	}

}
