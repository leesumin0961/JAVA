
public class Calc {
	public static void main(String[] args) {
		//����ڰ� ����࿡ �Է��� �Ǽ����� main() �޼ҵ忡�� ���޹޾� ���� ���ϴ� ���α׷�
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++) {	//���� ������ŭ �ݺ�
			sum += Double.parseDouble(args[i]);	//���ڿ��� ���(doubleŸ��)�� ��ȯ�Ͽ� �ջ�
					
			System.out.println("sum = " + sum);
		}
	}
}
