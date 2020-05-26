import java.util.Scanner;

public class ContinumExample {

	//5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램
	//입력된 수가 0이나 음수이면 continue문을 이용하여 합하지않고 다음 반복으로 넘어간다.
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 5개를 입력하세요.");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n =scanner.nextInt();
			if(n <= 0)
				continue;	//양수가 아닌 경우 다음 반복으로진행
			else
				sum += n;	//양수인 경우 덧셈
				
		}
		System.out.println("양수의 합은" +  sum);
		
	}

}
