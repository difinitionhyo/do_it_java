package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		// 1~100더할때 홀수일떄만더하기
		
		int total = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) 
				continue;
				total += i;
			    
		}
		System.out.println("1~100까지주 홀수만 더한 값 : " + total);

		                  
		// 1~100까지 수 중 3의배수만 출력
		
		for(int j= 1; j < 101; j++) {
			if (j % 3 != 0)
				continue;
			System.out.println(j);
		}
		
	}

}
