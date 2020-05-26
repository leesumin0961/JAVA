import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//if��
		int n = scanner.nextInt();
		if(n%2 == 0) {
			System.out.println(n + "�� ¦���Դϴ�.");
		}
		
		int score = scanner.nextInt();
		if((score >= 80) && (score <= 89)) {
			System.out.println("������ B�Դϴ�.");
		}
		
		//���๮�� ���幮�ΰ�� {}�߰�ȣ ��������
		if((score >= 80) && (score <= 89)) 
			System.out.println("������ B�Դϴ�.");
		
		
		//if-else��
		if (n%2 == 0) 
			System.out.println(n + "�� ¦���Դϴ�.");
		else 
			System.out.println(n + "�� Ȧ���Դϴ�.");
		
		
	
		
		
		
		SuccessOrFail();
		MultipleOfThree();
		Grading();
		GradingSwitch();
	}
	
	//���������� 80���̻��̶�� �հ� �Ǻ��� �ϴ� ���α׷�
	public static void SuccessOrFail() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ� : ");
		int score = scanner.nextInt();
		if(score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		scanner.close();
	}
	
	
	//�Էµ� ���� 3�� ������� �Ǻ��ϴ� ���α׷�
	public static void MultipleOfThree() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ�.");
		int number = scanner.nextInt();	//������ �Է¹޴´�.
		if(number % 3 == 0)	//3���� ���� �������� 0���� �˻�
			System.out.println("3�� ����Դϴ�.");
		else 
			System.out.println("3�� ����� �ƴմϴ�.");
		scanner.close();
			
	}
	
	
	
	
	
	//���� if-else���� �̿��� �Է¹��� ������ ���� ������ �ο��ϴ� ���α׷�
	public static void Grading() {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		
		System.out.println("������ �Է��ϼ���(0~100) : ");
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
		
		System.out.println("������ " + grade + "�Դϴ�.");
		
		scanner.close();
			
			
	}
	
	
	//switch������ ���� �ű�� �ڵ带 �ۼ�
	public static void GradingSwitch() {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		
		System.out.println("������ �Է��ϼ���(0~100) : ");
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
		System.out.println("������ " + grade + "�Դϴ�.");
		
		scanner.close();
	}
	
	
	
	
}
