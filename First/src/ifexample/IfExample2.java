package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		int age = 60;
		int charge;
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학");
		} 
		else if(age < 14) {
			charge = 2000;
			System.out.println("초딩");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("고딩");

	    }
		else if(age >= 60) {
			charge = 0;
			System.out.println("경로우대");
		}
		else {
			charge = 3000;
			System.out.println("나머지");
			}
		System.out.println("요금은 " + charge + "원 입니다");
	}
}