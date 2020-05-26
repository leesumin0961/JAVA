public class ScoreAverage {

	public static void main(String[] args) {
		//2차원 배열에서 학년별로 1학기,2학기 성적으로 저장하고 4년간 전체 평점 평균을 출력하는 프로그램

		double score [][]= {{3.3, 3.4}, //1학년
							{3.5 , 3.6}, //2학년
							{3.7, 4.0},	//3학년
							{4.1,4.2}};	//4학년

		double sum = 0;
		for (int year = 0; year < score.length; year++) 	//각학년별로 반복
			for (int term = 0; term < score[year].length; term++) 	//학기별로 반복
				sum += score[year][term];	//전페 평점 합


				int n = score.length;	//배열의 행 개수, 4(4학년)
				int m = score[0].length;	//배열의 열 개수, 2(2학기)
				System.out.println("4년 전체 평점 평균은 "+ sum/(n*m));	
			

		
	}

}
