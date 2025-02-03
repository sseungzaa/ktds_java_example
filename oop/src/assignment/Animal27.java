package assignment;

/*
Animal 클래스로 여러가지 인스턴스를 만들어보세요.
- 강아지 인스턴스 여러개
- 고양이 인스턴스 여러개 등등
*/

public class Animal27 {
	public static void main(String[] args) {
		Animal dog1 = new Animal("밀루", "개", "멍멍");
		Animal dog2 = new Animal("흰둥이", "개", "왈왈");
		Animal cat1 = new Animal("마루", "고양이", "야옹");
		Animal cat2 = new Animal("네로", "고양이", "냐옹");
		
		dog1.hello();
		dog1.voice();
		System.out.println();
		
		dog2.hello();
		dog2.voice();
		System.out.println();
		
		cat1.hello();
		cat1.voice();
		System.out.println();
		
		cat2.hello();
		cat2.voice();
		System.out.println();
	}

}
