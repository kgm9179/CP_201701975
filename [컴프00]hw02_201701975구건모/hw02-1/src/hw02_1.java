import java.util.Scanner;

public class hw02_1 {

	public static void main(String[] args) {
		System.out.println("201701975학번 구건모. Hw02_1: 가위바위보게임 과제");
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
			System.out.println(i + "번째 Stage 시작!");
			System.out.print("가위 바위 보 중 하나를 입력해 주세요:  ");
			user = input.next();
			System.out.println("(난수출력값: "+com+")");
			switch (com) {
			case 1: // 컴퓨터 가위
			case 4:
			case 7:
				System.out.println("컴퓨터가 가위를 냈습니다.");
				if (user.equals("가위")) {
					System.out.println("비겼습니다.");
					userscore = userscore + 1;
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				} else if (user.equals("바위")) {
					System.out.println("이겼다!");
					userscore = userscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				} else if (user.equals("보")) {
					System.out.println("졌다!");
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");

				}
				break;

			case 2: // 컴퓨터 바위
			case 5:
			case 8:
				System.out.println("컴퓨터가 바위를 냈습니다.");
				if (user.equals("바위")) {
					System.out.println("비겼습니다.");
					userscore = userscore + 1;
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				} else if (user.equals("보")) {
					System.out.println("이겼다!");
					userscore = userscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				} else if (user.equals("가위")) {
					System.out.println("졌다 !");
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				}
				break;
			case 3: // 컴퓨터 보
			case 6:
			case 9:
				System.out.println("컴퓨터가 보자기를 냈습니다.");
				if (user.equals("보")) {
					System.out.println("비겼습니다.");
					userscore = userscore + 1;
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				} else if (user.equals("가위")) {
					System.out.println("이겼다!");
					userscore = userscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				} else if (user.equals("바위")) {
					System.out.println("졌다!");
					comscore = comscore + 1;
					System.out.println("[Stage " + i + ">User" + userscore + "점 vs computer " + comscore + "점]");
				}
				break;
			}
		}
			if (userscore > comscore) {
				System.out.println("유저 " + userscore + "점 vs " + "컴퓨터 " + comscore + "점 으로 유저가 승리!");
			} else if (userscore < comscore) {
				System.out.println("유저 " + userscore + "점 vs " + "컴퓨터 " + comscore + "점 으로 컴퓨터가 승리!");
			} else if (userscore < comscore) {
				System.out.println("유저 " + userscore + "점 vs " + "컴퓨터 " + comscore + "점 으로 무승부!");
		}
			input.close();
		}
		
		}


