package day0523;
public class StringBuilderStudy {

	public static void main(String[] args) {
		//990925-1012999 ���� - �� ����� �������� ������ ����ϴ� ���α׷� �ۼ�
		
		//���1
		System.out.println("---�ڰ�Ǯ��---");
		String num = "990925-1012999";
		System.out.println(num.replace('-', ' '));
		
		//���2
		System.out.println("---����Ǯ��---");
		String s1 = "990925-1012999";
		String s2 = s1.substring(0,6) + ' ' + s1.substring(7);
		System.out.println(s2);
		
		//���3
		System.out.println("\nStringBuilder ��ü����=>");
		
		StringBuilder sb = new StringBuilder();
		sb.append(990925).append('-').append(1012999);
		System.out.println(sb.toString()); //�˻�
		System.out.println("---����� �������� ä���---");
		sb.replace(6, 7, " ");				//1. replace ��� �� setCharAt()
//		sb.deleteCharAt(6).insert(6, ' ');	//2. delete , insert ���
		System.out.println(sb.toString());
		
		
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		System.out.println(box);
		
		//�ڹ��� ��� Ŭ������ toString() �� ������ �ִ�.(Invisible)
	}
}

class Box{
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts; //���ڿ� ��ȯ

	}

}