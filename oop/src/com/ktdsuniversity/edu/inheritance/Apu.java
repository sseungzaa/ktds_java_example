package com.ktdsuniversity.edu.inheritance;

/**
 * Cpu 클래스를 확장시켜서 새롭게 만든 클래스
 * ClassName extends SuperClass
 * 
 * SuperClass에 생성자가 하나라도 존재한다면
 * SubClass에서는 생성자 중 하나 이상을 반드시 구현해야 함
 * 구현 생성자 내부에서는 SuperClass의 생성자를 반드시 호출해야 함
 */
public class Apu extends Cpu {
	
	public Apu(String menufactor, String seriesNumber) {
	//	super - SuperClass의 instance (SuperClass 원본)
	//	super(); - SuperClass(Cpu)의 기본 생성자를 호출하는 코드
		super(menufactor, seriesNumber);
	}
	
	public void draw() {
		System.out.println("그림을 그립니다..........");
	}
	
	// Cpu.calculate()의 기능을 다시 뜯어고치려면?
	// Cpu.calculate()의 원래 기능은 그대로 실행시키면서
	// -> Method Overriding (메소드 오버라이딩) (줄번호 왼쪽 녹색 세모 모양)
	@Override // SuperClass의 calculate() 메소드를 재정의한다~ 라고 정의하는 것
	public void calculate() {
		
		super.calculate();
		System.out.println("그림을 그리면서 2진수 계산도 합니다.");
	//	super.calculate();
	}
}
