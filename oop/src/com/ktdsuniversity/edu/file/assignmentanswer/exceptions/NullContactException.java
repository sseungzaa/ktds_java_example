package com.ktdsuniversity.edu.file.assignmentanswer.exceptions;

//	NullContactException 클래스 생성
//		-> contactIndex가 this.size보다 작지만 contactIndex에 저장된 값이 null일 때 throw

public class NullContactException extends RuntimeException {
	
	public NullContactException(String message) {
		super(message);
	}

}
