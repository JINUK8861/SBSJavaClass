package Java2Class;

public class day0513 {
	public static void main(String[] args) {
		//����9
		//1000 ���� �ڿ��� �� 3�� 5�� ����� ���
		//�� ��������� �� ���
		//while�� �̿�
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
		//�� ��ǥ, ������ ���ϱ�
		
		Circle c = new Circle(2,2,4);
		c.showCircleInfo();
	}
}

/* class Point { // ����
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
	double radius; //��������
	
	public Circle(int x, int y, double r) { //�Ű����� ������ => ������ �ʱ�ȭ ���� �� ����
		xPos = x;
		yPos = y;
		radius = r;
	}
	
	public void point (int x, int y) { // ��ǥ ���� �޼���
		xPos = x;
		yPos = y;
	}
	
	public void perimeter (double r) { // �ѷ� �޼���
		System.out.println("�ѷ� : " + r * 2 * 3.14);
	}
	
	public void area(double r) { // ���� �޼���
		System.out.println("���� : " + r * r * 3.14);
	}
	
	public void showCircleInfo() { //��� �޼���
		System.out.println("��ǥ " + "[" + xPos + ", " + yPos + "]\n" + "������ : " + radius);
		perimeter(radius);
		area(radius);
	}
}










