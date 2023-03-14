package classpart;

public class Student {             // class : 클래스를 만드는 예약어 Stduent : 클래스이름
	int studentId;			//학번						멤
	String studentName;		//학생이름             		버
	int grade;				//학년						변  == 필드
	String address;			//사는곳 					수  == 인스턴스변수

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	
}
