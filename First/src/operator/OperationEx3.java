package operator;

public class OperationEx3 {

	public static void main(String[] args) {
//		int num1 = 10;
//		int i = 2;
//		
//		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
//		System.out.println(value);
//		System.out.println(num1);
//		System.out.println(i);
//		
//		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
//		System.out.println(value);
//		System.out.println(num1);
//		System.out.println(i);
		
		
		int num = 5;
		int i = 10;
		boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		System.out.println(value); //true
		System.out.println(num); //50
		System.out.println(i); // 10

	}

}
