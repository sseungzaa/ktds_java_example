package com.ktdsuniversity.edu.errorhandle.customexception;

public class Main {
	
	// 회원 가입 메소드
	public static void registNewMember(String id, String pw) {
		if (id == null || id.isEmpty()) {
//			System.out.println("아이디는 필수 입력해야 하는 값입니다. \n올바르게 입력해주세요.");
			throw new InvalidUserIdException("아이디는 필수 입력해야 하는 값입니다. \n올바르게 입력해주세요.");
		}
		else if (id.equals("admin")) {
//			System.out.println("admin은 사용할 수 없는 아이디입니다. 다른 아이디를 입력해주세요.");
			throw new InvalidUserIdException("admin은 사용할 수 없는 아이디입니다. \n다른 아이디를 입력해주세요.");
		}
		else {
			System.out.printf("아이디: %s, 비밀번호: %s, 가입이 완료되었습니다.\n", id, pw);
		}
	}
	
	public static void main(String[] args) {
		
		try {
			registNewMember(null, "asdfgh");
		}
		catch (InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
		try {
			registNewMember("", "asdfgh");
		}
		catch (InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
		try {
			registNewMember("admin", "asdfgh");
		}
		catch (InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
		try {
			registNewMember("asd", "asdfgh");
		}
		catch (InvalidUserIdException iuie) {
			System.out.println("실패 사유: " + iuie.getMessage());
		}
		
//		InvalidUserIdException iuie = new InvalidUserIdException("사용할 수 없는 아이디입니다. \n다른 아이디를 사용해주세요.");
//		
//	//	일반 클래스와 다른 점: RuntimeException을 상속함
//		System.out.println(iuie.getMessage());
//		
//	//	throw new NumberFormatException("For input string: asdfgh")
//	//	Integer.parseInt("asdfgh");
//		
//	//	RuntimeException을 상속했을 때 할 수 있는 것
//	//	iuie 예외를 던져서 애플리케이션을 강제로 종료시킬 수 있음
//	//	throw iuie;
//		throw new InvalidUserIdException("메시지");
//		
//		System.out.println("애플리케이션 종료된 뒤라 수행 절대 안됨~");
	}

}
