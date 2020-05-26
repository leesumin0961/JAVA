package Test02;

public class ForSample {

	public static void main(String[] args) {
	
		//for문으로 1에서 100까지의 합 구하기 
		int sum = 0;
		
		for (int i =1; i <= 10; i++) {		//1~10까지 반복
			sum += i;
			System.out.println(i);			//더하는수 출력
			
			if(i<=9)						//1~9까지는 +출력
				System.out.println("+");
			else {							//i가 10인경우
				System.out.println("=");	//=을 출력하고
				System.out.println(sum);	//덧셈 결과 출력
			}
			
		}
		
		
	}

}
