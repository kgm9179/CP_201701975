import java.util.Scanner;
public class Bankaccount {
int accountnum; 
String owner; 
int balance ; 
Scanner input = new Scanner(System.in);
public void write() {
	System.out.print("���¹�ȣ �Է�: ");
	accountnum = input.nextInt();

	System.out.print("������ �Է�: ");
	owner = input.next();

	System.out.print("�ʱ��ܾ� �Է�: ");
	balance = input.nextInt();


}
public void deposit(int amount) {
balance += amount;
}
public String toString() {
	String str = "�ܾ���"+balance+"�Դϴ�.";
	return str;

}
public void withdraw(int amount) {
	balance += -amount;
}
public void print() {
	;
	System.out.println("���¹�ȣ:" + accountnum);
	System.out.println("������: "+ owner);
	System.out.println("�ܾ�: " + balance);

}

public int sendaccount(int amount, Bankaccount otherAccount) {

if(balance>=amount) {
	System.out.println(owner + " ���� "+ otherAccount.owner + " ������ " + amount +" ���� �۱��մϴ�. ");
	balance = balance - amount;
otherAccount.balance = otherAccount.balance + amount;

return amount;
}
else
{System.out.println("������ü ����.");
return 0;
}
}

}
