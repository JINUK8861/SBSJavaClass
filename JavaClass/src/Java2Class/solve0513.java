package Java2Class;

public class solve0513 { // = Class UseCircle
	public static void main(String[] args) {
		SolveCircle c = new SolveCircle(2,2,4);
		//좌표 [2,2] 반지름 4인 원의 생성
		
		c.showCircleInfo();
		//원의 정보 출력
	}

}

class Point { // 참고
	int xPos, yPos;
	public Point (int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPointInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}

class SolveCircle{ //=Circle
	int rad;		// 반지름
	Point center;	// 원의 중심 //class Point 객체 center 선언~
	
	public SolveCircle (int x, int y, int r) {//매개변수 생성자
		center = new Point (x,y); //~ 객체 center생성
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("radius : " + rad);
		center.showPointInfo();
	}
}

