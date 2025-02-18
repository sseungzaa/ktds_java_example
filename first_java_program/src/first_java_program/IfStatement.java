package first_java_program;

public class IfStatement {

	public static void main(String[] args) {
		
		// 커피 가격
		int coffee = 1500;
		
		// 내가 가진 돈
		int myWallet = (int) (Math.random() * 10000); // 0 ~ 9999
		
		// 친구가 가진 돈
		int friendsWallet = (int) (Math.random() * 5000); // 0 ~ 4999
		
		// 내가 커피 5잔을 사먹을 수 있을까?
		boolean canBuy = coffee * 5 <= myWallet;
		boolean needLoan = friendsWallet >= ( coffee * 5 ) - myWallet;
		System.out.println("내가 가진 돈 " + myWallet);
		System.out.println("커피 살 수 있나요? " + canBuy);
		System.out.println("친구가 가진 돈 " + friendsWallet);
		
		// 내가 커피를 사먹을 수 있으면, "커피 주문했습니다" 라고 출력하고, 내가 가진 돈에서 커피 가격을 뺀다
		// 내가 커피를 사먹을 수 없으면, "커피 주문할 돈이 부족합니다" 라고 출력하고 모자란 금액을 출력한다
		// 내가 커피를 사먹을 수 없는데, 모자란 금액을 친구가 가지고 있으면 친구에게 돈을 빌려서 커피를 주문한다
		
		// 그런데, 4잔까지는 사먹을 수 있는 돈이 친구에게 있다면
		// "친구에게 모자란 금액만큼 빌려서 4잔을 주문했습니다" 라고 출력한다
		if ( canBuy ) {
			System.out.println("커피 주문했습니다 ");
			myWallet = myWallet - coffee * 5;
		}
		else if ( needLoan ) {
			// 나는 커피를 주문할 돈이 없는 상황이고
			// 친구가 내가 모자란 돈만큼 가지고 있을 때 실행되는 영역
			System.out.println("친구에게 돈을 빌려서 주문했습니다 ");
			
			int loan = ( coffee * 5 ) - myWallet;
			System.out.println("빌린 돈 " + loan);
		}
		else if ( friendsWallet >= ( coffee * 4 ) - myWallet ) {
			System.out.println("친구에게 모자란 금액만큼 빌려서 4잔을 주문했습니다 ");
			
			int loan = Math.abs(( coffee * 4 ) - myWallet);
			System.out.println("빌린 돈 " + loan);
		}
		else {
			// if ( canBuy )가 false이고 친구의 돈도 부족할 때만 실행되는 영역
			System.out.println("커피 주문할 돈이 부족합니다 ");
			int needMoney = myWallet - (coffee * 5);
			System.out.println(-needMoney + "만큼 부족합니다 ");
		}
		
		System.out.println("내가 가진 돈 " + myWallet);
		
	}
}
