package first_java_program;

public class VariableScope {

	public static void main(String[] args) {
		
		int age = 28;
		
		{
			System.out.println(age);
			
			int limit = 30;
			System.out.println(limit);
		}
		
		System.out.println("실행이 종료되었습니다.");
		
	}
}
