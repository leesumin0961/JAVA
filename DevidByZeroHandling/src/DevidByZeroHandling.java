import java.util.Scanner;

//try-catch ����� �̿��Ͽ� ������ ������ ������ 0���� ������ ��쿡 
//"0���� ���� �� �����ϴ�!"�� ����ϰ� �ٽ� �Է¹޴� ���α׷�
public class DevidByZeroHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�������� �Է��Ͻÿ�:");
			int dividend = scanner.nextInt();
			
			System.out.println("�������� �Է��Ͻÿ�:");
			int divisor = scanner.nextInt();	
		try { 
			System.out.println(dividend + "�� " +  divisor + "�� ������ ����" + dividend/divisor + "�Դϴ�." );
			break;		//�������� ������ �Ϸ� �� while�����
		}
		catch (ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
		}
	
		
		}
	}

}
