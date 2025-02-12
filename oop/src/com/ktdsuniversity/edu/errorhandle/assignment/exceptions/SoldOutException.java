package com.ktdsuniversity.edu.errorhandle.assignment.exceptions;

// 상품의 재고 수가 없는 (다 떨어진) 예외

public class SoldOutException extends RuntimeException {
	
	public SoldOutException(String message) {
		super(message);
	}

}
