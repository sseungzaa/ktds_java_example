package assignment;

/*
Animal 클래스를 만들어보세요.

--멤버변수--
이름
종류 (강아지, 고양이 등등)
울음소리
--메소드--
생성자
소개하기
울기
*/

public class Animal {
	
	// 멤버변수
	private String name;
	private String species;
	private String sound;
		
	// 메소드	
	public Animal(String name, String species, String sound) {
			
		this.name = name;
		this.species = species;
		this.sound = sound;
	}
	
//	public String getName() {
//		return name;
//	}
//	
//	public String getSpecies() {
//		return species;
//	}
//	
//	public String getSound() {
//		return sound;
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
//	public void setSound(String sound) {
//		this.sound = sound;
//	}
	
	public void hello() {
		System.out.println("이름: " + this.name);
		System.out.println("종류: " + this.species);
	}
	
	public void voice() {
		System.out.println("울음소리: " + this.sound);
	}
	
}
