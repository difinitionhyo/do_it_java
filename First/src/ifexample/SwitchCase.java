package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		/*
		 * 등급별 메달
		 */
		int rank = 1;
		char medalColor;
		
		switch(rank) {
		case 1 : medalColor = 'G';
				break;
		case 2 : medalColor = 'S';
				break;
		case 3 : medalColor = 'B';
				break;
		default : medalColor = 'A';
		}
		System.out.println(rank + "등 의 메달 색깔은 : " + medalColor);
		
	}

}
