//���� ���ϱ� ����

import java.util.Scanner;
public class hw02_2 {

	public static void main(String[] args) {
	Scanner a= new Scanner(System.in);
	int year=0; int month=0; int day=0;  int dday;
	dday = 0;
	
	System.out.println("�⵵�� �Է����ּ���.");
	year = a.nextInt();
	System.out.println("���� �Է����ּ���.");
	month = a.nextInt();
	System.out.println("���� �Է����ּ���.");
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
}//switch ��
System.out.print("�ش� ��¥�� ������ ");
switch(dday%7) {
case 0: System.out.print("������Դϴ�");break;
case 1: System.out.print("�ݿ����Դϴ�");break;
case 2: System.out.print("������Դϴ�");break;
case 3: System.out.print("�Ͽ����Դϴ�");break;
case 4: System.out.print("�������Դϴ�");break;
case 5: System.out.print("ȭ�����Դϴ�");break;
case 6: System.out.print("�������Դϴ�");
break;

}
a.close();
}
    	}
 //��� �߸��Ȱ������� �ϴٰ� ���߽��ϴ�...

    	
 	