package com.ktdsuniversity.edu.errorhandle;

import com.ktdsuniversity.edu.fruitseller.FruitSeller;

public class HandleExceptionType {
	
	public static void loadClass(String classPath) {
	
		//	Class loadedClass = Class.forName(classPath);
		
		try {
			Class loadedClass = Class.forName(classPath);
			System.out.println(loadedClass);
			System.out.println(FruitSeller.class);
			
		}
		catch (ClassNotFoundException cnfe) {
			// classPath가 존재하지 않는 클래스일 때 던져진 예외
			// 존재하지 않는 클래스를 로딩하려 했을 때 무엇을 해줘야 하는가?를 명시
			System.out.println("Error Message: " + cnfe.getMessage());
			cnfe.printStackTrace(); // 에러가 발생할 때까지 진행된 콜 스택을 출력
			return;
		}
	}
	
	public static void main(String[] args) {
		
		loadClass("com.ktdsuniversity.edu.fruitseller.FruitSeller");
	}

}
