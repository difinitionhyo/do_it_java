package exercise;

public class P_123_Q1 {

	public static void main(String[] args) {
		/*
		 * 1) ifelse if 하나만들기
		 * 2) swich case 문 마늗ㄹ기
		 */
		
//		int num1 = 10;
//		int num2 = 2;
//		char operator = '+';
//		int result = 0;;
//		
//		if(operator == '+') {
//			result = num1 + num2;
//		} else if(operator == '-') {
//			result = num1 - num2;
//		} else if(operator == '*') {
//			result = num1 * num2;
//		} else if(operator == '/') {
//			result = num1 / num2;
//		}
//		System.out.println("num1 " + operator + " num2" + " = " + result);
		

		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;
		
		switch (operator) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		}
		System.out.println(result);
		
	}

}