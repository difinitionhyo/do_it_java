package alone;

public class P_152_ {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 40;
		p1.name = "James";
		p1.isMarried = true;
		p1.children = 3;
		
		p1.personInfo();
		
		System.out.println("------------------------------");
		
		Order od = new Order();
		od.orderNum = "201803120001";
		od.id = "abc123";
		od.data = "2018년 3월 12일";
		od.name = "홍길순";
		od.giftNum = "PD0345-12";
		od.adress = "서울시 영등포구 여의도동 20번지";
		
		od.orderInfo();
		
		
		
	}

}
