package arraylist;

public class Student {
    //	1. java 프로젝트 생성하여(이름은 자유) arraylist package를 생성한다.(10)
	//	2. arraylist package안에 Student 클래스, main 메서드를 포함하고있는 클래스(이름은 자유)를 생성한다.(10)
	//	3. Student class에, 학생관리를 위한 학생이름, 휴대폰번호, 주소를 담을 접근제어 private 전역변수 3개만 생성한다.(10)
	//	4. 3개의 파라미터(매개변수)를 받아서  각각의 전역변수에 값을 할당해주는 생성자를 생성한다.(10)
	//	5. 3번에서 선언한 3개의 전역변수의 getter, setter를 만든다.(10)
	//	6. toString() 메서드를 override해서 해당 클래스명, 각각의 전역변수를 출력해주는 메서드를 생성한다(어노테이션 필수).(10)
	
	// 전역변수
	private String studentName;
	private String phoneNum;
	private String address;
	
	// 생성자
	public Student(String studentName, String phoneNum, String address) {
		super();
		this.studentName = studentName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// getter, setter
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", phoneNum=" + phoneNum + ", address=" + address + "]";
	}
	

}
