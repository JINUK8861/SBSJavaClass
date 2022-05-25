package Java2Class;

public class day0513 {
	public static void main(String[] args) {
		//문제9
		//1000 이하 자연수 중 3과 5의 공배수 출력
		//그 공배수들의 합 출력
		//while문 이용
/*		
		int sum = 0;
		int i = 1;
		
		while(i <= 1000) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
			i++;
		}
		System.out.println();
		System.out.println(sum);
*/		
		//원 좌표, 반지름 구하기
		
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();
	}
}

/* class Point { // 참고
	int xPos, yPos;
	public point (int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointUnfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
} */

class Circle {
	int xPos, yPos;
	double radius; //변수선언
	
	public Circle(int x, int y, double r) { //매개변수 생성자 => 선언후 초기화 없이 값 대입
		xPos = x;
		yPos = y;
		radius = r;
	}
	
	public void point (int x, int y) { // 좌표 변경 메서드
		xPos = x;
		yPos = y;
	}
	
	public void perimeter (double r) { // 둘레 메서드
		System.out.println("둘레 : " + r * 2 * 3.14);
	}
	
	public void area(double r) { // 넓이 메서드
		System.out.println("넓이 : " + r * r * 3.14);
	}
	
	public void showCircleInfo() { //출력 메서드
		System.out.println("좌표 " + "[" + xPos + ", " + yPos + "]\n" + "반지름 : " + radius);
		perimeter(radius);
		area(radius);
	}
}










