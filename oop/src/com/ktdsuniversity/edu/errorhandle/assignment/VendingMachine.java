package com.ktdsuniversity.edu.errorhandle.assignment;

import com.ktdsuniversity.edu.errorhandle.assignment.exceptions.ExpiredProductException;
import com.ktdsuniversity.edu.errorhandle.assignment.exceptions.SoldOutException;
import com.ktdsuniversity.edu.errorhandle.assignment.exceptions.NeedMoreMoneyException;

/* 자판기 설계
--생성자(상품[])
--멤버변수
	-상품[]
	-돈통
	-상품을 구매하기 위해 고객이 넣은 돈
	판매가 완료되거나 환불할 때마다 0으로 초기화 되어야 합니다.
--기능
	-판매하기(상품번호, 자판기에 넣을 돈, 고객)
	고객이 구매하려는 상품의 소비기한이 0미만인 경우 고객에게 돈을 돌려주고 ExpiredProductException 예외를 던집니다.
	고객이 구매하려는 상품의 재고가 0 이하일 경우 고객에게 돈을 돌려주고 SoldOutException 예외를 던집니다.
	고객이 구매하려는 상품의 가격이 자판기에 넣은 돈보다 비쌀 경우 고객에게 돈을 돌려주고 NeedMoreMoneyException 예외를 던집니다.
	거스름돈이 남을 경우 고객에게 돌려주어야 합니다.
	판매가 완전히 완료되었을 때 상품의 가격만큼 돈통에 추가해야하고 상품의 수도 1개가 줄어야 합니다.
	-환불하기(고객)
	고객이 넣은 돈을 돌려줍니다.
	-자판기 재고 출력하기()
	자판기 재고와 돈통의 돈을 출력합니다.
*/

public class VendingMachine {
	
	private Item[] items;
	private int moneyStorage;
	private int insertedMoney;
	
	public VendingMachine(Item[] items) {
		this.items = items;
	}
	
	public void sellItem(int itemNumber, int insertedMoney, Customer customer) {
		
	}

}
