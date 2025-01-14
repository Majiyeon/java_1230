package day02;

public class Ex13_SwitchSeason {

	public static void main(String[] args) {
		/* 월이 주어졌을 때 월에 맞는 계절을 출력하세요.
		 * 봄 : 3,4,5
		 * 여름 : 6,7,8
		 * 가을 : 9, 10, 11
		 * 겨울 : 12, 1, 2
		 * 잘못된 월 : 그 외
		 * 
		 * month가 3이거나 month가 4이거나 month가 5이면 봄이라고 출력하고
		 * month가 6이거나 month가 7이거나 month가 8이면 여름이라고 출력하고
		 * month가 9이거나 month가 10이거나 month가 11이면 가을이라고 출력하고
		 * month가 12이거나 month가 1이거나 month가 2이면 겨울이라고 출력하고
		 * month가 1보다 작고 12보다 크면 잘못된 월이라고 출력
		 * */

		int month = 12;
		// A==a, A == b, A == c
		switch(month) {
		case 3, 4, 5:
			System.out.println(month + "월은 봄");
			break;
		case 6, 7, 8:
			System.out.println(month + "월은 여름");
			break;
		case 9, 10, 11:
			System.out.println(month + "월은 가을");
			break;
		case 12, 1, 2:
			System.out.println(month + "월은 겨울");
			break;
		default:
			System.out.println(month + "월은 잘못된 월");
		}
	}

}




