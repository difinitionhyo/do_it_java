package exercise;

public class P_123_Q5 {

	public static void main(String[] args) {
		/*
		 * 	반복문,조건문 사용하여 다음모양 출력
		 * 
		 *    *
		 *   *** 
		 * 	*****
		 * *******
		 *  *****
		 *   ***
		 *    *
		 * 
		 *         반복문으로 피라미드만들고
		 *         조건문으로 그이후로 감소하는거 만들면될듯?
		 *        
		 *  변수선언 뭐가필요하냐       
		 * 행 1~4    
		 * 1)스페4번
		 * 2)별1개
		 * 
		 * 
		 * 
		 * 
		 */
		
//		int space = 4;
//		int star = 1;
//		
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < space; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j < star; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			space -= 1;
//			star += 2;
//		}
		
		//까지 4행까지 피라미드
		
		int space = 3;
		int star = 1;
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			
			if(i >= 3) {         
				System.out.println();
				space += 1;
				star -= 2;
			}else {
				System.out.println();
				space -= 1;
				star += 2;
				}
			
		}
			
			
		
		/* 
		 * 밑에 3개 내려가면서 합치려했는데
		 * 조건문 써라넹
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}

}
