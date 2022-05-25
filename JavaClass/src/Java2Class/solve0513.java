package Java2Class;

public class solve0513 { // = Class UseCircle
	public static void main(String[] args) {
		SolveCircle c = new SolveCircle(2,2,4);
		//��ǥ [2,2] ������ 4�� ���� ����
		
		c.showCircleInfo();
		//���� ���� ���
	}

}

class Point { // ����
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
	int rad;		// ������
	Point center;	// ���� �߽� //class Point ��ü center ����~
	
	public SolveCircle (int x, int y, int r) {//�Ű����� ������
		center = new Point (x,y); //~ ��ü center����
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("radius : " + rad);
		center.showPointInfo();
	}
}

