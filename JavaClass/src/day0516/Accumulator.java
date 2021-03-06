package day0516;

public class Accumulator {
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			Accumulator.add(i);			//인자로 전달되는 값 모두 누적
		
		Accumulator.showResult();	//최종 누적 결과 출력
	}
	
	static int sum = 0;
	
	static void add(int i) {
		sum += i;
	}
	
	static void showResult() {
		System.out.println("sum = " + sum);
	}
}

//문1) main 메서드와 함께 동작하는 Accumulator 클래스 정의
	//+Accumulator 클래스에 main 메서드도 넣어서 컴파일 및 실행
	//showResult 출력 결과로 sum = 45 출력