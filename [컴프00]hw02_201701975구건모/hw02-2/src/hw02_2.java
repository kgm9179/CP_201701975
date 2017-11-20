//요일 구하기 과제

import java.util.Scanner;
public class hw02_2 {

	public static void main(String[] args) {
	Scanner a= new Scanner(System.in);
	int year=0; int month=0; int day=0;  int dday;
	dday = 0;
	
	System.out.println("년도를 입력해주세요.");
	year = a.nextInt();
	System.out.println("월을 입력해주세요.");
	month = a.nextInt();
	System.out.println("일을 입력해주세요.");
	day = a.nextInt();
	dday += (year - 1900)*360;
	dday += (year - 1900)/4;
if(((year%4==0)&&(year%100!=0)||(year%400==0)))
		{if((month==1)||(month==2)) dday +=-1;}
switch(month) {
case 1:
dday += day; break;

case 2:
dday += 31+day; break;
case 3:
	dday += 31+28+day; break;
case 4:
	dday += 31+28+31+day; break;
case 5:
	dday += 31+28+31+30+day; break;
case 6:
	dday += 31+28+31+30+31+day; break;
case 7: 
	dday += 31+28+31+30+31+30+day; break;
case 8:
	dday += 31+28+31+30+31+30+31+day; break;
case 9:
	dday += 31+28+31+30+31+30+31+31+day; break;
case 10: 
	dday += 31+28+31+30+31+30+31+31+30+day; break;
case 11:
	dday += 31+28+31+30+31+30+31+31+30+31+day; break;
case 12: 
	dday += 31+28+31+30+31+30+31+31+30+31+30+day; break;
}//switch 끝
System.out.print("해당 날짜의 요일은 ");
switch(dday%7) {
case 0: System.out.print("목요일입니다");break;
case 1: System.out.print("금요일입니다");break;
case 2: System.out.print("토요일입니다");break;
case 3: System.out.print("일요일입니다");break;
case 4: System.out.print("월요일입니다");break;
case 5: System.out.print("화요일입니다");break;
case 6: System.out.print("수요일입니다");
break;

}
a.close();
}
    	}
 //어디서 잘못된거지몰라서 하다가 못했습니다...

    	
 	