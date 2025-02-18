package game;

public class CraneGameShop {
	public static void main(String[] args) {
		CraneGameMachine cgm = new CraneGameMachine();
		cgm.isInsertCoin = false;
		cgm.dolls = 10;
		
		/*
		// while 활용
		int result = 0;
		while (true) {
			cgm.insertCoin();
			result += cgm.doGame();
			System.out.println(result);
			if (cgm.dolls == 0) {
				break;
			}
		}
		*/
		
		cgm.insertCoin();
		int result = cgm.doGame();
		
		System.out.println("isInsertCoin: " + cgm.isInsertCoin);
		System.out.println("남은 인형개수는 " + cgm.dolls);
		System.out.println("뽑은 인형개수는 " + result);
	}

}
