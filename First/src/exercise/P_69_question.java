package exercise;

public class P_69_question {

	public static void main(String[] args) {
		// 	//예 / 아니요 / 부동소수점 방식 / 
		//Q4. 변수 두 개를 선언해서 10, 2.0대입 후 두 변수의 사칙연산 결과를 정수로 출력
		
		var num1 = 10;   //int
		var num2 = 2.0;  //double
		
		System.out.println(num1+(int)num2);
		System.out.println(num1-(int)num2);
		System.out.println(num1*(int)num2);
		System.out.println(num1/(int)num2);
		
		//Q5. '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한뒤 
		//그 변수를 출력하여 확인해보시오
		
		char ch1 = '글';
		var ch2 = (int)ch1;
		System.out.println(ch2);
		char ch3 = (char)ch2;
		System.out.println(ch3);
		
//		char ch = '44544';
		
//		System.out.println('44544');
		
		
		// 글 = \uAE00
		char ch = '\uAE00';
		System.out.println(ch);

	}

}
