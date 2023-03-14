package alone;

public class Order {
	String orderNum;
	String id;
	String data;
	String name;
	String giftNum;
	String adress;
	
	public void orderInfo() {
		System.out.println("주문 번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + id);
		System.out.println("주문 날짜 : " + data);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + giftNum);
		System.out.println("배송 주소 : " + adress);
	}
	
}
