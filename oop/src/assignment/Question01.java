package assignment;

/*
손님이 영화관에 10000원을 가지고 입장했습니다.
손님은 관람비가 18000원인 영화를 관람하려 합니다.
손님은 영화를 관람할 수 있을까요?
관람할 수 있다면, "관람가능"을 출력하고 지불하고 남은 금액을 출력합니다.
관람할 수 없다면, "관람불가능"을 출력하고 모자란 금액을 출력합니다.
*/

public class Question01 {
	public static void main(String[] args) {
		int guestMoney = 10000;
		int movieFee = 18000;
//		int can = guestMoney - movieFee;
//		int cant = movieFee - guestMoney;
		boolean watchMovie = guestMoney >= movieFee;
		
		if(watchMovie) {
			System.out.println("관람 가능");
			System.out.println(guestMoney - movieFee + "원이 남았습니다.");
		}
		else {
			System.out.println("관람 불가능");
			System.out.println(movieFee - guestMoney + "원이 더 필요합니다.");
		}
	}
}
