

import java.util.Scanner;	//Scanner �� ����ϱ� ���ؼ��� import�� �ʿ��ϴ�.

public class ScannerEx {

	public static void main(String[] args) {

		//nextLine()�� next() ����      
		Scanner scanner = new Scanner(System.in);	
		System.out.println("���ڿ��Է�: ");
		String str1 = scanner.nextLine();
		System.out.println(str1);

		System.out.println("���ڿ��Է�: ");
		String str2 = scanner.next();
		System.out.println(str2);

/*		next() �޼ҵ�� �ȳ��ϼ��丸 �����Ѱ� �˼� �ִ�. nextLine()�� next()�޼ҵ��� ���̴� nextLine()�޼ҵ�� 
        Enter�� ġ�� ������ ���ڿ��� ��� �����Ѵٴ� ���̰� next() �޼ҵ�� ���� ������ �Է¹��� ���ڿ��� �����Ѵٴ� ���̴�. 
                 �׷��� ������ �ִ� ���ڿ� ������ ���Ϲް� ������ nextLine() �޼ҵ带 ����ϰ� �׳� �� �ܾ ���� �ʹٸ� next()�� ���°����� 
        nextLine()�� �ᵵ �������. ������ �̰� ������ ġ������ ���� ������ �߻��Ѵ�
*/
		
		
/* 		Scanner ��ü �ݱ�
		scanner.close();
		Scanner scanner = new Scanner(System.in);	//scanner�� ���� �� �ٽ� scanner�� Ű �Է� ���� �� ����.
		
*/
		ScannerEx();

	}
	
	//scanner Ŭ������ �̸�,����,����,ü��,���� ���θ� �Է¹ް� �ٽ� ����ϴ� ���α׷�
	
	public static void ScannerEx() {
		System.out.println("�̸�,����,����,ü��,���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);	
		
		String name = scanner.next();	//���ڿ��б�
		System.out.println("�̸��� : " + name + ",");
		
		String city = scanner.next();	//���ڿ��б�
		System.out.println("���ô� : " + city + ",");

		int age = scanner.nextInt();	//�����б�
		System.out.println("���̴� : " + age + ",");
		
		double weight = scanner.nextDouble();	//�Ǽ��б�
		System.out.println("ü���� : " + weight + ",");
		
		boolean isSingle = scanner.nextBoolean();	//�����б�
		System.out.println("���� ���δ� : " + isSingle + "�Դϴ�.");
		
	}




}
