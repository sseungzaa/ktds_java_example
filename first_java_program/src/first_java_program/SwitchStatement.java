package first_java_program;

public class SwitchStatement {
	public static void main(String[] args) {
		
		int step = 1;
		
		// 라면 끓이기 절차를 출력
		/* System.out.println("3. 냄비를 세척해야 할 지 판단한다.");
		System.out.println("4. 냄비가 깨끗하다면 가스레인지 위에 올린다.");
		System.out.println("4. 냄비가 깨끗하지 않다면 씻어낸 후 가스레인지 위에 올린다.");
		*/
		
		switch (step) {
		case 1:
			System.out.println("1. 수납장 손잡이를 잡고 문을 연다.");
		case 2:
			System.out.println("2. 수납장 안에 있는 냄비의 손잡이를 잡고 꺼낸다.");
		case 3:
			System.out.println("3. 수납장 안에 있는 냄비의 손잡이를 잡고 꺼낸다.");
		case 4:
			int randomNumber = (int) (Math.random() * 10);
			if ( randomNumber & 2 == 0 ) {
				System.out.println("4. 냄비가 깨끗하다면 가스레인지 위에 올린다.");
			}
			else if ( randomNumber == 9 ) {
				System.out.println("4. 냄비를 꺼내다 떨어뜨려 깨져버렸어요, 라면을 끓일 수 없어요");
				break; // <- swith 흐름을 끊는다
			}
			else {
				System.out.println("4. 냄비가 깨끗하지 않다면 씻어낸 후 가스레인지 위에 올린다.");
			}
		case 5:
			System.out.println("5. 생수가 있는 곳으로 걸어 간 뒤 생수 한 개를 집어 들고 가스레인지 앞으로 온다.");
		case 6:
			System.out.println("6. 생수의 뚜껑을 열어 냄비 안에 550ml 양의 물을 붓는다.");
		case 7:
			System.out.println("7. 가스레인지 불을 켠다.");
		case 8:
			System.out.println("8. 수납장 안에 있는 라면 한 개를 꺼내 든다.");
		case 9:
			System.out.println("9. 라면 봉지를 뜯는다.");
		case 10:
			System.out.println("10. 물이 끓기 시작하면 후레이크 스프와 분말 스프를 꺼내 뜯고 안의 내용물을 냄비 안에 붓는다.");
		case 11:
			System.out.println("11. 면을 꺼내 냄비 안에 넣는다.");
		case 12:
			System.out.println("12. 정해진 시간을 지켜 기다린다.");
		case 13:
			System.out.println("13. 정해진 시간이 다 지나면 가스레인지 불을 끈다.");
		case 14:
			System.out.println("14. 그릇을 찾는다.");
		case 15:
			System.out.println("15. 수저를 찾는다.");
		}
	}

}
