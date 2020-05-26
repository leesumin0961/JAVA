public class NestedLoop {

	public static void main(String[] args) {
		
		//2중 중첩 for문을 사용하여 구구단을 출력하는 프로그램
		
		for (int i = 1; i <10; i++) {	//1단에서 9단 출력
			for (int j = 1; j < 10; j++) {	//각 단의 구구단 출력
				System.out.println(i + "*" + j + "=" + i*j);	//구구셈 출력
				System.out.println('\t');	//하나 씩 탭 이동
				
			}
			System.out.println();	//한 단이 끝나면 다음 줄로 커서 이동
			
		}

	}

}
