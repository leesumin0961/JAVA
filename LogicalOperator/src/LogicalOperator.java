
public class LogicalOperator {
	
	public static void main(String[] args) {
	//비교연산자와 논리연산자
	//비교연산자와 논리 연산자를 복합하여 사용할 수 있다. age, c, x, y가 모두 변수일 때 복잡하여 사용하는 예는 다음과 같다.

	int age = 20;
	char c = 'A';
	int x = 0;
	int y = 50;
	
	System.out.println((age >= 20) && (age < 30));		//나이 (int age)가 20대인경우
	System.out.println((c >= 'A') && (c <= 'Z'));		//문자(char c)가 대문자인 경우
	System.out.println((x>=0) && (y>=0) && (y<=50) && (y<=50)); 	//(x,y)가 (0,0)과 (50,50)의 사각형 내에 있음
		
		
	//오류가 나는경우
	// 20 <= age < 30	//오류가난다.
	
	//비교연산자와 논리 연산자의 사례
	//비교연산
	System.out.println('a'>'b');
	System.out.println(3 >= 2);
	System.out.println(-1 < 0);
	System.out.println(3.45 <= 2);
	System.out.println(3 == 2);
	System.out.println(3 != 2);
	System.out.println(!(3 != 2));
	
	//비교연산과 논리연산 복합
	System.out.println((3 > 2) && (3 > 4));
	System.out.println((3 != 2) || (-1 > 0));
	
	}
}
