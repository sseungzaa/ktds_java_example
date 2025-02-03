package assignment;

//Cat 클래스로 여러가지 인스턴스를 만들어보세요.

public class Cat29 {
	public static void main(String[] args) {
		Cat cat1 = new Cat("마루", "노르웨이 숲", "대형");
		Cat cat2 = new Cat("네로", "렉돌", "중형");
		Cat cat3 = new Cat("냥이", "메인쿤", "소형");
		
		cat1.hello();
		System.out.println();
		
		cat2.hello();
		System.out.println();
		
		cat3.hello();
		System.out.println();
	}

}
