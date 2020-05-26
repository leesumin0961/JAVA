public class DoWhileSample {

	//do-while문을 이용해 a부터z까지 출력하는 프로그램
	public static void main(String[] args) {
		char c= 'a';

		do {
			System.out.println(c);
			c = (char) (c+1);	//영문의 경우 1을 더하면 다음 문자의 코드 값
		} while (c <= 'z');
	}

}
