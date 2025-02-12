package com.ktdsuniversity.edu.errorhandle.assignment.exceptions;

// 고객이 넣은 돈보다 비싼 상품을 구매하려 할 때의 예외

public class NeedMoreMoneyException extends RuntimeException {
	
	public NeedMoreMoneyException(String message) {
		super(message);
	}

}
