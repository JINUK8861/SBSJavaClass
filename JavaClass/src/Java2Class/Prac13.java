package Java2Class;

public class Prac13 {
	public static void main(String[] args) {
		System.out.println("---(접근생략)클래스메서드---");
		classArithmetic(1,2);
		System.out.println("---클래스.클래스메서드---");
		Prac13.classArithmetic(2,2);
		
//		Prac13.instanceArithmetic(3,2); // 클래스.인스턴스메서드 접근불가
		System.out.println("---(객체생성)객체.인스턴스메서드---");
		Prac13 p13 = new Prac13(); // 객체생성시 매개변수생성자 (+)
		p13.instanceArithmetic(4,2);
	}
	
	static void classArithmetic(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b + " " + a%b);
	}
	
	void instanceArithmetic(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b + " " + a%b);
	}
}