package memo;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import static java.lang.Math.max;

public class Memo {
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int num = 0;
//		static void addNum(int n) {
//			num += n;
//		}
		
		//static �ʱ�ȭ ����
		
		//static import
		
/*		System.out.println(Math.max(2, 3));
		// ==
//		import static java.lang.Math.max; �߰��ϸ�
		System.out.println(max(2, 3)); //Math. ���� ����
		
		System.out.println((char) 99);
*/
		
		String str1 = "STR";
		String str2 = "STR";
		String str3 = new String("STR");
		System.out.println(str1);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		// equals() : ���밪 ��
		// == : �ּҰ�(��������) ��
		
		
		str1 = "STRT";
		System.out.println(str1);
		//String -> Immutable -> final �� �ٸ� ����?
		
		
		String st1 = "Coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2); // st1+st2 �� �����Ϸ��� concat �޼���� �ڵ���ȯ
		System.out.println(st1);
		
		String str = "age : " + 17;
	}
}

