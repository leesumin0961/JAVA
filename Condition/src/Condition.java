import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//if문
		int n = scanner.nextInt();
		if(n%2 == 0) {
			System.out.println(n + "은 짝수입니다.");
		}
		
		int score = scanner.nextInt();
		if((score >= 80) && (score <= 89)) {
			System.out.println("학점은 B입니다.");
		}
		
		//실행문이 한장문인경우 {}중괄호 삭제가능
		if((score >= 80) && (score <= 89)) 
			System.out.println("학점은 B입니다.");
		
		
		//if-else문
		if (n%2 == 0) 
			System.out.println(n + "은 짝수입니다.");
		else 
			System.out.println(n + "은 홀수입니다.");
		
		
	
		
		
		
		SuccessOrFail();
		MultipleOfThree();
		Grading();
		GradingSwitch();
	}
	
	//시험점수가 80점이상이라면 합격 판별을 하는 프로그램
	public static void SuccessOrFail() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하시오 : ");
		int score = scanner.nextInt();
		if(score >= 80)
			System.out.println("축하합니다! 합격입니다.");
		scanner.close();
	}
	
	
	//입력된 수가 3의 배수인지 판별하는 프로그램
	public static void MultipleOfThree() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수를 입력하시오.");
		int number = scanner.nextInt();	//정수를 입력받는다.
		if(number % 3 == 0)	//3으로 나눈 나머지가 0인지 검사
			System.out.println("3의 배수입니다.");
		else 
			System.out.println("3의 배수가 아닙니다.");
		scanner.close();
			
	}
	
	
	
	
	
	//다중 if-else문을 이용해 입력받은 성적에 대해 학점을 부여하는 프로그램
	public static void Grading() {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		
		System.out.println("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		if(score >= 90)
			grade = 'A';
		if(score >= 90)
			grade = 'B';
		if(score >= 70)
			grade = 'C';
		if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");
		
		scanner.close();
			
			
	}
	
	
	//switch문으로 학점 매기는 코드를 작성
	public static void GradingSwitch() {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		
		System.out.println("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		
		scanner.close();
	}
	
	
	
	
}
