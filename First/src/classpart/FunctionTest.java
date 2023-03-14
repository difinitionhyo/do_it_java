package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		
		// 두 정수를 더한후 결과값을 도렬주는 함수 만들고 호출
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");

	}

	
	
	public static  int add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(result);
		return result;
	}
}


