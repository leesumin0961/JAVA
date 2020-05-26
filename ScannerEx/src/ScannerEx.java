

import java.util.Scanner;	//Scanner 를 사용하기 위해서는 import가 필요하다.

public class ScannerEx {

	public static void main(String[] args) {

		//nextLine()과 next() 차이      
		Scanner scanner = new Scanner(System.in);	
		System.out.println("문자열입력: ");
		String str1 = scanner.nextLine();
		System.out.println(str1);

		System.out.println("문자열입력: ");
		String str2 = scanner.next();
		System.out.println(str2);

/*		next() 메소드는 안녕하세요만 리턴한걸 알수 있다. nextLine()과 next()메소드의 차이는 nextLine()메소드는 
        Enter를 치기 전까지 문자열을 모두 리턴한다는 것이고 next() 메소드는 공백 전까지 입력받은 문자열만 리턴한다는 것이다. 
                 그래서 공백이 있는 문자열 한줄을 리턴받고 싶으면 nextLine() 메소드를 사용하고 그냥 한 단어만 쓰고 싶다면 next()를 쓰는거지만 
        nextLine()을 써도 상관없다. 하지만 이것 때문에 치명적인 논리적 오류가 발생한다
*/
		
		
/* 		Scanner 객체 닫기
		scanner.close();
		Scanner scanner = new Scanner(System.in);	//scanner를 닫은 후 다시 scanner로 키 입력 받을 수 없음.
		
*/
		ScannerEx();

	}
	
	//scanner 클래스로 이름,도시,나이,체중,독신 여부를 입력받고 다시 출력하는 프로그램
	
	public static void ScannerEx() {
		System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);	
		
		String name = scanner.next();	//문자열읽기
		System.out.println("이름은 : " + name + ",");
		
		String city = scanner.next();	//문자열읽기
		System.out.println("도시는 : " + city + ",");

		int age = scanner.nextInt();	//정수읽기
		System.out.println("나이는 : " + age + ",");
		
		double weight = scanner.nextDouble();	//실수읽기
		System.out.println("체중은 : " + weight + ",");
		
		boolean isSingle = scanner.nextBoolean();	//논리값읽기
		System.out.println("독신 여부는 : " + isSingle + "입니다.");
		
	}




}
