package first_java_program;

public class ScorePracticeSecond {
	public static void main(String[] args) {
		
		int money = (int) ((Math.random() * 1000000) + 400000 );
		// int money = 1000000;
			
		// int father = 40;
		// int mother = 36;
		// int daughter = 11;
		
		int father = (int) (Math.random() * 100);
		int mother = (int) (Math.random() * 100);
		int daughter = (int) (Math.random() * 100);
		
		int adultFare = 300000;
		int kidFare = 120000;
		
		int adultCount = 0;
		int kidCount = 0;
		
		// 3인 가족이 100만원으로 비행기를 타려고 함
		// 성인 30만원, 아동 12만원, 성인 판단 기준은 19세 이상
		// 비행기를 탈 수 있다면 "여행 가자!"
		// 비행기를 탈 수 없다면 "다음에 가자.."
		
		if ( father >= 19 ) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		if ( mother >= 19 ) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		if ( daughter >= 19 ) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		int oneWayFare = ( adultCount * adultFare ) + ( kidCount * kidFare );
		System.out.println("성인 " + adultCount + "명 ");
		System.out.println("아동 " + kidCount + "명 ");
		System.out.println("필요한 금액 " + oneWayFare + "원 ");
		System.out.println("가진 금액 " + money + "원 ");
		
		if ( money >= oneWayFare ) {
			System.out.println("여행 가자! ");
		}
		else {
			System.out.println("다음에 가자.. ");
		}
	}

}
