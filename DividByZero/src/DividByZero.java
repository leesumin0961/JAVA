import java.util.Scanner;

//두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램.
//사용자가 나누는 수에 0을 입력하면 ArithmeticException예외가 발생하여 프로그램 강제종료.
public class DividByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; //나눗셈
		int divisor; //나눗수
		
		System.out.println("나뉨수를 입력하시오:");
		dividend = scanner.nextInt();
		
		System.out.println("나눗수를 입력하시오:");
		divisor = scanner.nextInt();
		
		System.out.println(dividend + "를 " +  divisor + "로 나누면 몫은" + dividend/divisor + "입니다." );
		
		
	}

}
