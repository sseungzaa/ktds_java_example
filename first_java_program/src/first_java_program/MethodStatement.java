package first_java_program;

// add 메소드 정의
/*public class MethodStatement {
	public static void hello() {
		// add 메소드가 하는 일
		System.out.println("안녕하세요?");
	}
	public static void main(String[] args) {
		hello();
		hello();
	}*/
/*public class MethodStatement {
	public static void result() {
		// add 메소드가 하는 일
		System.out.println(1+1);
	}
	public static void main(String[] args) {
		result();
		result();
	}*/
public class MethodStatement {
	public static void printHello(String name) {
		System.out.println(name + ", How are you?");
	}
	public static void main(String[] args) {
		printHello("Tony");
		printHello("Cap");
	}
}
