

public class TypeChange {

	public static void main(String[] args) {

		//타입변환
		//타입변환 이란 변수나 상수 혹은 리터럴의 타입을 다른 타입으로 바꾸는 것을 말한다.

		//자동타입변환

		long m = 25;			//리터럴 25는 int 타입. 25가 long 타입으로 자동변환
		double b = 3.14 * 10;	//실수 연산을 하기 위해 10이 10.0으로 자동 변환

		//강제 타입 변환
		//강제 타입 변환은 개발자가 강제로 타입변환을 지시하는 경우이다. 변수 n에 300을 저장한다.
		int n = 300;

		/*		다음과 같이 n 값을 byte 변수 b에 저장해보자
				byte b = n;	//컴파일 오류. int 타입은 byte타입으로 자동 변환 안됨.

				변수 n에 저장된 값 300은 byte타입 (0~255)의 범위보다 크기 때문에 컴파일러가 자동변환을 하게되면
				b에 300이 저장되지 않고 256을 뺀 나머지 (300-256=44) 값 44가 저장된다.
				이처럼 큰 타입의 값을 작은 타입의 값으로 변환해야 할 때 컴파일러는 자동변환 대신 컴파일 오류를 발생시킨다.

				// ()안에 타입을 명시하여 강제 타입 변환

				byte b = (byte)n; //n을 byte 타입을 강제 변환. b=44

				하지만 강제 변환을 하면 컴파일 오류가 발생하지 않을 뿐 여전히 300에서 256을 초과한만큼 즉 44가 변수 b에
				저장되어 데이터 손실이 발생한다.
				강제 타입 변환의 다른 사례로 다음과 같이 실수를 정수로 강제 변환하면 소수점 이하의 손실이 발생한다.

				double d = 1.9;
				int n = (int)d;	//강제 타입 변환으로 n은 1이 되며 소수점 0.9는 손실이 된다.

		 */		
		
		change();
		
	}

	//자동타입변환과 강제타입변환 예제
	public static void change() {
		byte b =127;
		int i = 100;
		System.out.println(b+i);				//b가 int 타입으로 자동 변환
		System.out.println(10/4);				//정수 나누기이므로 결과는 2
		System.out.println(10.0/4);				//4가 4.0으로 자동변환 실수나누기이므로 결과는 2.5
		System.out.println((char)0*12340041);	//char로 변환된 결과 0*0041로서 문자 'A'
		System.out.println((byte)(b+i));		//b+i는 227. 16진수 0*E3 즉. -29
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);

	}

}
