package day0523;
public class StringBuilderStudy {

	public static void main(String[] args) {
		//990925-1012999 에서 - 를 지우고 공백으로 삽입후 출력하는 프로그램 작성
		
		//방법1
		System.out.println("---자가풀이---");
		String num = "990925-1012999";
		System.out.println(num.replace('-', ' '));
		
		//방법2
		System.out.println("---강의풀이---");
		String s1 = "990925-1012999";
		String s2 = s1.substring(0,6) + ' ' + s1.substring(7);
		System.out.println(s2);
		
		//방법3
		System.out.println("\nStringBuilder 객체생성=>");
		
		StringBuilder sb = new StringBuilder();
		sb.append(990925).append('-').append(1012999);
		System.out.println(sb.toString()); //검산
		System.out.println("---지우고 공백으로 채우기---");
		sb.replace(6, 7, " ");				//1. replace 사용 ≒ setCharAt()
//		sb.deleteCharAt(6).insert(6, ' ');	//2. delete , insert 사용
		System.out.println(sb.toString());
		
		
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		System.out.println(box);
		
		//자바의 모든 클래스는 toString() 을 가지고 있다.(Invisible)
	}
}

class Box{
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts; //문자열 반환

	}

}
