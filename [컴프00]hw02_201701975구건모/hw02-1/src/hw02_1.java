import java.util.Scanner;

public class hw02_1 {

	public static void main(String[] args) {
		System.out.println("201701975�й� ���Ǹ�. Hw02_1: �������������� ����");
		Scanner input = new Scanner(System.in);
		String user;
		int com;
		int userscore;
		int comscore;
		userscore = 0;
		comscore = 0;
		com = (int) (Math.random() * 10) + 1;
		for (int i = 1; i < 8; i++) {
			System.out.println("");
			System.out.println(i + "��° Stage ����!");
			System.out.print("���� ���� �� �� �ϳ��� �Է��� �ּ���:  ");
			user = input.next();
			System.out.println("(������°�: "+com+")");
			switch (com) {
			case 1: // ��ǻ�� ����
			case 4:
			case 7:
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
				if (user.equals("����")) {
					System.out.println("�����ϴ�.");
					userscore = userscore + 1;
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				} else if (user.equals("����")) {
					System.out.println("�̰��!");
					userscore = userscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				} else if (user.equals("��")) {
					System.out.println("����!");
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");

				}
				break;

			case 2: // ��ǻ�� ����
			case 5:
			case 8:
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
				if (user.equals("����")) {
					System.out.println("�����ϴ�.");
					userscore = userscore + 1;
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				} else if (user.equals("��")) {
					System.out.println("�̰��!");
					userscore = userscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				} else if (user.equals("����")) {
					System.out.println("���� !");
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				}
				break;
			case 3: // ��ǻ�� ��
			case 6:
			case 9:
				System.out.println("��ǻ�Ͱ� ���ڱ⸦ �½��ϴ�.");
				if (user.equals("��")) {
					System.out.println("�����ϴ�.");
					userscore = userscore + 1;
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				} else if (user.equals("����")) {
					System.out.println("�̰��!");
					userscore = userscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				} else if (user.equals("����")) {
					System.out.println("����!");
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "�� vs computer " + comscore + "��]");
				}
				break;
			}
		}
			if (userscore > comscore) {
				System.out.println("���� " + userscore + "�� vs " + "��ǻ�� " + comscore + "�� ���� ������ �¸�!");
			} else if (userscore < comscore) {
				System.out.println("���� " + userscore + "�� vs " + "��ǻ�� " + comscore + "�� ���� ��ǻ�Ͱ� �¸�!");
			} else if (userscore < comscore) {
				System.out.println("���� " + userscore + "�� vs " + "��ǻ�� " + comscore + "�� ���� ���º�!");
		}
			input.close();
		}
		
		}


