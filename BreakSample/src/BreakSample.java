import java.util.Scanner;

public class BreakSample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료됩니다/");
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();	//한 라인 띄우기
			if(text.equals("exit"))	//exit이 입력되면 반복종료
				break;
		}
		System.out.println("종료합니다...");

	}

}
