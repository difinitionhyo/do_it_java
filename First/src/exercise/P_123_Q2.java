package exercise;

public class P_123_Q2 {

	public static void main(String[] args) {
		//구구단을 짝수 단만 출력하도록 프로그램 만들어봐라
		
		int dan = 1;
		int num = 1;
		
		for(dan = 1; dan < 10; dan++) {
			if(dan % 2 == 1) {
				continue;
			}
			System.out.println("< " + dan + " >");
			
			for(num =1; num < 10; num++) {
				System.out.println(dan + " * " + num + " = " + dan * num);
			}
			System.out.println();
			
		}
		

	}

}
