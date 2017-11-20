package hw5;
//컴퓨터공학과 201701975 구건모 

public class Data {

	static String year;
	static int month;
	static String day;
	static String month2;

	// 메소드

	public static void printEastern() {
		System.out.print("동양식 날짜 표기법: ");
		System.out.println(Data.year + "." + Data.month + "." + Data.day);
	}

	public static void printWestern() {
		switch (Data.month) {
		case 1:
			Data.month2 = "January";
			break;
		case 2:
			Data.month2 = "February";
			break;

		case 3:
			Data.month2 = "March";
			break;

		case 4:
			Data.month2 = "April";
			break;
		case 5:
			Data.month2 = "May";
			break;
		case 6:
			Data.month2 = "Jun";
			break;
		case 7:
			Data.month2 = "July";
			break;
		case 8:
			Data.month2 = "August";
			break;
		case 9:
			Data.month2 = "September";
			break;
		case 10:
			Data.month2 = "Octeober";
			break;
		case 11:
			Data.month2 = "November";

			break;
		case 12:
			Data.month2 = "December";
			break;
		}
		System.out.print("서양식 날짜 표기법: ");

		System.out.print(Data.month2 + " " + Data.day + "," + Data.year);

	}
}
