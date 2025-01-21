package first_java_program;

public class ProblemUnderstand {
	public static int getFlightFare(int age) {
		return 
	}

	public static void main(String[] args) {
		int money = 1000000;
		int father = 40;
		int mother = 36;
		int daughter = 11;
		int flightFare = getFlightFare(father);
		flightFare += getFlightFare(mother);
		flightFare += getFlightFare(daughter);
		if (money>=flightFare) {
			System.out.println("여행 가자");
		}
		else {
			System.out.println("다음에 가자");
		}
	}
}
