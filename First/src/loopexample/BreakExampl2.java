package loopexample;

public class BreakExampl2 {

	public static void main(String[] args) {

		
		int num = 0;
		int sum = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum > 100) {
				System.out.println("sum 100초과 종료");
				break;
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		
	}

}
