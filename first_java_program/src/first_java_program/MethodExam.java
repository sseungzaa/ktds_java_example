package first_java_program;

public class MethodExam {
	
	public static int getSeconds(int minutes,int seconds) {
		return (minutes*60)+seconds;
	}
	
	public static void main(String[] args) {
		int seconds = getSeconds(5,50);
		System.out.println(seconds);
		
		int minutes2 = getSeconds2(145);
		int seconds2 = getSeconds2(145);
		System.out.println(seconds2);
	}

}
public static int getSeconds2(int processTime) {
	return (processTime/60)+(processTime%60);
}