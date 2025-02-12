package com.ktdsuniversity.edu.errorhandle.assignment.exceptions;

// 상품 소비 기한이 지난 예외

public class ExpiredProductException extends RuntimeException {
	
	public ExpiredProductException(String message) {
		super(message);
	}

}
