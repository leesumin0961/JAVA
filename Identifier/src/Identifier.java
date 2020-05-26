

public class Identifier {

	public static void main(String[] args) {

		// 식별자로 사용할 수 있는 예
		
		
		int name;	
		int student_ID;	//'_'사용가능
		class Monster2{}	//숫자 사용 가능
		int whatsYoursNameMyNameIsKitae;	//길이 제한 없음
		int barChart; int barchart;	//대소문자 구분 barChart와 barchart 다른이름
		int 가격;		//한글 사용가능

		
		
		// 식별자로 사용할 수 없는 예
		
/*		
  		int 3Chapter;	//첫번째 문자로 숫자 사용 불가
		class if{}		//자바의 예약어 if 사용 불가
		char false;		//자바의 예약어 false 사용 불가
		void null() {}	//자바의 예약어 null 사용 불가
		class % calc{}	//특수문자 '%' 사용 불가
*/
		
		
		
		//클래스 이름의 예
		
/*		
 		public class HelloWorld {}
 		class AutoVendingMachine {}
  
 */
		
		
		
		//변수와 메소드 이름의 예
		 
		int myAge;
		boolean isSingle;
	  //public int getAge() {return 20;}
		
		//상수의 예
		
		final double PI = 3.141592;
		
		
	}
}