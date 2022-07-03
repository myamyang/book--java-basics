/*
 * Example 2-4 Scanner를 이용한 키 입력 연습
 */
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기 ex) kim seoul 20 65.1 true 입력시 kim만 받고 seoul 20 65.1 true를 return
		System.out.println("이름은 " + name + ", ");
		
		String city = scanner.next(); // 문자열 읽기 ex) seoul 20 65.1 true에서 seoul만 받고 20 65.1 true를 return
		System.out.println("도시는 " + city + ", ");
		
		int age = scanner.nextInt(); // 정수 읽기 ex) 20 65.1 true에서 20만 받고 65.1 true를 return
		System.out.println("나이는 " + age + "살 "); 
		
		double weight = scanner.nextDouble(); // 실수 읽기 ex) 65.1 true에서 65.1만 받고 true를 return
		System.out.println("체중은 " + weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean(); // 논리값 읽기 ex) 남은 true만 받고 close
		System.out.println("독신 여부는 " + isSingle + "입니다.");
		scanner.close(); // scanner 객체 닫기
	}
}
