public class ScoreAverage {

	public static void main(String[] args) {
		//2���� �迭���� �г⺰�� 1�б�,2�б� �������� �����ϰ� 4�Ⱓ ��ü ���� ����� ����ϴ� ���α׷�

		double score [][]= {{3.3, 3.4}, //1�г�
							{3.5 , 3.6}, //2�г�
							{3.7, 4.0},	//3�г�
							{4.1,4.2}};	//4�г�

		double sum = 0;
		for (int year = 0; year < score.length; year++) 	//���г⺰�� �ݺ�
			for (int term = 0; term < score[year].length; term++) 	//�б⺰�� �ݺ�
				sum += score[year][term];	//���� ���� ��


				int n = score.length;	//�迭�� �� ����, 4(4�г�)
				int m = score[0].length;	//�迭�� �� ����, 2(2�б�)
				System.out.println("4�� ��ü ���� ����� "+ sum/(n*m));	
			

		
	}

}
