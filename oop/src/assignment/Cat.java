package assignment;

/*
Cat 클래스를 만들어보세요.

--속성--
이름
종류 (코리안 숏헤어, 노르웨이 숲, 메인쿤, 렉돌 등등)
크기 (대형, 중형, 소형 등등)
--기능--
생성자
소개하기
울음소리?
*/

public class Cat {
	
	// 멤버변수
	private String name;
	private String species;
	private String scale;
		
	// 메소드	
	public Cat(String name, String species, String scale) {
		this.name = name;
		this.species = species;
		this.scale = scale;
	}
	
//	public String getName() {
//		return name;
//	}
//	
//	public String getSpecies() {
//		return species;
//	}
//	
//	public String getScale() {
//		return scale;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setSpecies(String species) {
//		this.species = species;
//	}
//	
//	public void setScale(String scale) {
//		this.scale = scale;
//	}
	
	public void hello() {
		System.out.println("이름: " + this.name);
		System.out.println("종류: " + this.species);
		System.out.println("크기: " + this.scale);
	}
	
}
