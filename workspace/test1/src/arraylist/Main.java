package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//	7. Student 객체를 담기위한 arraylist 생성.(객체명 자유)(10)
		//	8. 7번에서 생성한 객체에 for문을 사용하여 10명의 학생 데이터를 임의로 각각 다르게 add한다.(5)
		//	9. 7번에서 생성한 arraylist의 크기를 출력한다.(10)
		//	10. 7번에서 생성한 arraylist의 5번째 요소를 출력한다.(5)
		//	11. 7번에서 생성한 arraylist의 5번째 요소를 삭제한다.(5)
		//	12. 7번에서 생성한 arraylist에 담긴 데이터를 for문과 Student 클래스에서 생성한 toString() 메서드를 사용하여 출력한다.(5)

		List<Student> std = new ArrayList<Student>();
		
		for(int i = 0; i < 10; i++ ) {
			Student contents = new Student("학생"+i, "010-1234-567"+i, "주소"+i);
			std.add( contents );
//			System.out.println(std.get(i));
		}
		
		System.out.println( std.size() );
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println( std.get(4) );
		
		System.out.println("---------------------------------------------------------------");
		std.remove(4);
		
		for(int i = 0; i < std.size(); i++ ) {
			Student each_content = std.get(i);
			System.out.println(each_content.toString());
		}
		
		
		
		
		
		
		
		
		
	}

}
