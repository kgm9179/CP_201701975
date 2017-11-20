// 시간단위변환 과제
package hw;

import java.util.Scanner;

public class Hw01_1 {

	public static void main(String[] args) {
		int inputdata, hour, minute, second;
		Scanner k = new Scanner(System.in);
		System.out.print("초를 입력하세요:  ");
		inputdata = k.nextInt();
		hour = inputdata / 3600 ;
		minute = inputdata % 3600 / 60;
		second = inputdata % 3600 % 60 ;
		System.out.print(hour+"시간"+ minute +"분"+second +"초 입니다.");
		k.close();
	}

}
