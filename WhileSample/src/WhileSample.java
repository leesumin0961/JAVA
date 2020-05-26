import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		
		//while문은 반복 횟수를 알지 못하는 경우에 이용된다고 했다. while문을 이용하여 -1이 입력될 때 까지 정수를 계속
		//입력받아 합을 구하고 평균을 출력하는 프로그램
		int count = 0;
		int sum = 0;
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt();
		
		while(n !=1) {
			sum += n;
			count ++;
			n = scanner.nextInt();
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}
		else {
			System.out.println("정수의 개수는" + count +"개이며");
			System.out.println("평균은" + (double)sum/count + "입니다.");
			}
		scanner.close();
	}

}
