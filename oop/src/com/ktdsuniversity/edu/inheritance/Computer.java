package com.ktdsuniversity.edu.inheritance;

public class Computer {
	
	public static void calculateAndDraw(Cpu cpu) {
		System.out.println("====================");
		cpu.calculate();
		if (cpu instanceof Apu apu) {
			apu.draw();
		}
	}
	
	public static void main(String[] args) {
		
		Cpu intelChip = new Cpu("Intel", "i9");
	//	intelChip.calculate();
		calculateAndDraw(intelChip);
		
		// Cpu 클래스를 확장한 Apu 클래스
		// Cpu 클래스의 멤버변수와 메소드에 접근이 가능 (마치 내 것처럼)
		// Apu is a Cpu
		// Cpu is not a Apu
		// Cpu is a Apu -> (Apu) Cpu
		Cpu amdChip = new Apu("AMD", "Rizen7");
	//	amdChip.calculate();
		calculateAndDraw(amdChip);
		
		// Cpu is not a Apu
	//	Apu tempChip = amdChip;
	//	Apu tempChip = (Apu) amdChip;
	//	tempChip.draw();
		
		if (amdChip instanceof Apu tempAmdChip) {
			tempAmdChip.draw();
		}
		
	//	amdChip.draw();
		
		String tempString = "asdfasdf";
	//	((Apu)((Object) tempString)).draw();
		
		// is a 관계를 확인하는 코드
		// A instanceof B = A가 B의 인스턴스냐를 물어봄
		System.out.println("amdChip is a Apu: " + (amdChip instanceof Apu));
		System.out.println("tempString is a Apu: " + ((Object)tempString instanceof Apu));
		
		
		/*
		Cpu amdChip = new Apu("AMD", "Rizen7");
		amdChip.calculate();
		amdChip.draw(); // Cpu는 draw를 모름
		*/
		
		// is a
		// SubClass is a SuperClass
		// SuperClass is not a SubClass
		// -> SuperClass is a SubClass (Type Casting)
		/*
		 * 정수 -> 정수
		 * int -> long (int is a long)
		 * long -> int ((int) longvalue: overflow)
		 * 
		 * Type Casting -> is a 관계가 성립할 때만 사용 가능
		 * String -> ing (X)
		 * int -> String (X)
		 */
		
		System.out.println("amdChip");
	}

}
