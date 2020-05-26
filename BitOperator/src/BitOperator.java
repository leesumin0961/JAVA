public class BitOperator {

	public static void main(String[] args) {
		
		//비트연산자
/*		<<연산자는 왼쪽 시프트 연산자로서 각 비트를 왼쪽으로 이동시키며 오른쪽 끝에는 항상 0비트이 삽입된다.
		다음코드는 a의 각 비트를 왼쪽으로 2번 이동시킨 결과를 변수 b에 저장하며, 그 결과b의 값은 20이 된다. 
*/
		byte a1 = 5;
		byte b1 = (byte) (a1<<2);
		
/*		>>>연산자는 비트를 오른쪽으로 이동시키며, 왼쪽 끝에는 항상 비트 0이 삽입된다. 다음코드는 변수c의
		각 비트들을 2번 오른쪽으로 이동시킨 결과를 변수d에 저장한다. 그 결과 d값은 5가 된다. 
*/
		byte c1 = 20;
		byte d1 = (byte) (c1>>>2);
		
		
/*		>>연산자는 오른쪽 시프트 연산자이지만 >>>와 달리 왼쪽 끝의 최상위 비트에는 시프트 이전이 최상의 비트가
 		그래도 삽입된다.
*/
		byte e = 20;	
		byte f = (byte) (e>>2);	//변수 e 값을 오른쪽으로 2비트 이동 f값은 5.
		byte g = (byte) 0xf8;	//0xf8는 -8을 16진수로 표현한 값.
		byte h = (byte) (g>>2);	//변수g를 오른쪽으로 2비트 이동. h값은 0xfe가 된다.0xfe는 십진수 -2
		
		
		
		//비트논리연산과 비트 시프트 연산
		
		short a = (short)0x55ff;
		short b = (short)0x00ff; 
		
		//비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b));	//비트 AND
		System.out.printf("%04x\n", (short)(a | b));	//비트 OR
		System.out.printf("%04x\n", (short)(a ^ b));	//비트 XOR
		System.out.printf("%04x\n", (short)(~a));		//비트 NOT
		
		byte c = 20;	//0x14
		byte d = -8;	//0xf8
		
		//비프 시트트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println((c << 2));			//c를 2비트 왼쪽 시프트
		System.out.println((c >> 2));			//c를 2비트 오른쪽 시프트. 0삽입
		System.out.println((d >> 2));			//d를 2비트 오른쪽 시프트. 1삽입	
		System.out.printf("%x\n",(d >>> 2));	//d를 2비트 오른쪽 시프트. 0삽입
	}

}
