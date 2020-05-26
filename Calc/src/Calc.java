
public class Calc {
	public static void main(String[] args) {
		//사용자가 명령행에 입력한 실수들을 main() 메소드에서 전달받아 합을 구하는 프로그램
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++) {	//인자 개수만큼 반복
			sum += Double.parseDouble(args[i]);	//문자열을 상수(double타입)로 변환하여 합산
					
			System.out.println("sum = " + sum);
		}
	}
}
