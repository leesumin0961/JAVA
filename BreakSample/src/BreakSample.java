import java.util.Scanner;

public class BreakSample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� ����˴ϴ�/");
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();	//�� ���� ����
			if(text.equals("exit"))	//exit�� �ԷµǸ� �ݺ�����
				break;
		}
		System.out.println("�����մϴ�...");

	}

}
