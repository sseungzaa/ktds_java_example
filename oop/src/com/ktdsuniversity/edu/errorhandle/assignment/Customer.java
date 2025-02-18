package com.ktdsuniversity.edu.errorhandle.assignment;

/* 고객 설계
--생성자(지갑의 돈, 구매할 수 있는 상품의 수)
--멤버변수
	-지갑
	-구매한 상품[]
--기능
	-지불하기(지불할 돈)
	자판기에 지불한 돈만큼 지갑에서 돈이 빠져나갑니다.
		지갑에 있는 돈보다 큰 돈을 지불할 수 없습니다.
			지갑에 있는 돈보다 지불할 돈이 더 크다면 고객이 가진 모든 돈을 지불해야 합니다.
	-상품받기(받은 상품)
	자판기가 준 상품을 "구매한 상품[]"에 추가합니다.
		이미 구매했던 상품과 동일한 상품을 구매했다면 "재고 수"만 추가해야합니다.
		이전에 구매했던 상품이 아니라면 새로운 인덱스에 상품을 추가해야합니다.
	-지급받기(지급받을 돈)
	자판기가 돌려준 돈 만큼 지갑에 돈이 추가됩니다.
	자판기가 돌려준 돈 보다 더 많은 돈은 받을 수 없습니다.
	-고객상황 출력하기()
	고객이 구매한 상품목록과 지갑의 돈을 출력합니다.
*/

public class Customer {
	
	private int wallet;
	private Item[] items;
	
	public Customer(int wallet, Item[] items) {
        this.wallet = wallet;
        this.items = items;
    }

}
