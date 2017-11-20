import java.util.Scanner;
public class Bankaccount {
int accountnum; 
String owner; 
int balance ; 
Scanner input = new Scanner(System.in);
public void write() {
	System.out.print("계좌번호 입력: ");
	accountnum = input.nextInt();

	System.out.print("예금주 입력: ");
	owner = input.next();

	System.out.print("초기잔액 입력: ");
	balance = input.nextInt();


}
public void deposit(int amount) {
balance += amount;
}
public String toString() {
	String str = "잔액은"+balance+"입니다.";
	return str;

}
public void withdraw(int amount) {
	balance += -amount;
}
public void print() {
	;
	System.out.println("계좌번호:" + accountnum);
	System.out.println("예금주: "+ owner);
	System.out.println("잔액: " + balance);

}

public int sendaccount(int amount, Bankaccount otherAccount) {

if(balance>=amount) {
	System.out.println(owner + " 에서 "+ otherAccount.owner + " 님으로 " + amount +" 원을 송금합니다. ");
	balance = balance - amount;
otherAccount.balance = otherAccount.balance + amount;

return amount;
}
else
{System.out.println("계좌이체 실패.");
return 0;
}
}

}
