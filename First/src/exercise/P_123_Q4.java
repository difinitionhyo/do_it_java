package exercise;

public class P_123_Q4 {

	public static void main(String[] args) {
		/*
		 * 총 4행 row = 1~4
		 * 스페이스바 3번~ 0번으로 줄어야됨  - row1일때 스페이스바3   row2일때 스페이스바2번
		 * 별은 1행 1 3 5 7
		 * 
		 *    *      1행  스페4   별1
		 *   ***     2행  스페3   별3
		 *  *****    3행  스페2   별5
		 * *******   4행  스페1   별7
		 *   행 4개
		 *   1행  		스페4번  별1개
		 *   2행  	 	스페3번  별3개
		 *   3행  		스페2번  별5개
		 *   4행  	 	스페1번  별7개
		 * 
		 *   row+=1    스페 -=1  2 * row - 1
		 *   
		 * 
		 */
		
		int row = 1;
		int space = 4;
		int spaceCount = 0;
		int star = 2 * row - 1;               // row = 1부터 증가하면 = 1 3 5 7
		
		
		
		
		
		for(row = 1; row < 5; row++) {                          // 제일 바깥 for = row = 행
			for(spaceCount = 0; spaceCount <= space ; spaceCount++) {						// 1행일떄 스페4번 먼저   //이렇게 하면 돌고와도 space가4번임 
				System.out.print(" ");									//1번당 " " 공백           space를 바꿔야됨
			}
			
			for(int star1 = 0; star1 < star; star1++) {                // 별1개
				System.out.print("*");
			}
			System.out.println();															// 1번돌면
			space -= 1;													//  * 	
			star += 2;														 	//  *
																		//  *
																		//  *
			
			
			/*
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
			
		
			
		}
		
		
		
		
	
	}
		
	
	
}
		
		
		
		
		
	


