package loopexample;

public class BreakExampl1 {

	public static void main(String[] args) {
		/*
		 * 0부터 시작해 숫자를 1씩늘리면서 합계산
		 * 언제 100넘는가
		 * 반복문, break사용
		 */
		
		int num = 0;
		int sum = 0;
		
		for(num = 0; sum < 100; num++) {
			sum += num;
			num++;
			if(sum > 100) {
				System.out.println("sum 100초과 종료");
				break;
			}
		} 
		System.out.println("num : " + num);
		

	}

}
