package Java2Class;

public class Prac13 {
	public static void main(String[] args) {
		System.out.println("---(���ٻ���)Ŭ�����޼���---");
		classArithmetic(1,2);
		System.out.println("---Ŭ����.Ŭ�����޼���---");
		Prac13.classArithmetic(2,2);
		
//		Prac13.instanceArithmetic(3,2); // Ŭ����.�ν��Ͻ��޼��� ���ٺҰ�
		System.out.println("---(��ü����)��ü.�ν��Ͻ��޼���---");
		Prac13 p13 = new Prac13(); // ��ü������ �Ű����������� (+)
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