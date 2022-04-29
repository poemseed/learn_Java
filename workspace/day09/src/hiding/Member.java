package hiding;

public class Member {
	private String name;
	private int age;
	
	/*
	 * param name, age 생성자.
	 * 전역변수.name = name, 전역변수.age = age
	 */
	public Member( String name, int age ) {
		this.name = name;
		this.age = age;
	}

	/*
	 * name, age 전역변수의  getter, setter 생성
	 */
	
	// 자동완성가능
	// 오른쪽 마우스 -> source -> generate getter setter
	
	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge( int age ) {
		this.age = age;
	}
	
	
}
