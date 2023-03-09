package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		for(dan = 2; dan < 10; dan++) {
			System.out.println("< " + dan + " 단 >");
			for(times = 1; times < 10; times++) {
				System.out.println(dan + " * " + times + " = " + dan * times);
			}
			System.out.println();
		}
}

}
