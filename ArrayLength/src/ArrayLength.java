import java.util.Scanner;

public class ArrayLength {

	//�迭�� length �ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������ �Է¹ް� ����� ���ϴ� ���α׷�
	public static void main(String[] args) {
		int intArray[] = new int[5];	//�迭�� ����� ����
		int sum =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(intArray.length + "���� ������ �Է��ϼ���.>>");
		for (int i = 0; i <intArray.length ; i++) 
			intArray[i] = scanner.nextInt();	//Ű���忡�� �Է¹��� ���� ����
			
		for (int i = 0; i <intArray.length; i++) 
			sum += intArray[i];	//�迭�� ����� ���� �� ���ϱ�
			
			System.out.println("�����" + (double)sum/intArray.length);
	}

}
