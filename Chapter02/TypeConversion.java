/*
 * Example 2-3 타입 변환
 */
public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); // b가 int 타입으로 자동 변환
		System.out.println(10/4); // 소수점이 사라진다.
		System.out.println(10.0/4); // 실수 나누기로 되어 2.5
		System.out.println((char)0x12340041); // 유니코드로 \u0041인 문자 'A'
		System.out.println((byte)(b+i)); // 227 - 256(byte는 0 ~ 255)로 -29
		System.out.println((int)2.9+1.8); // 3.8
		System.out.println((int)(2.9+1.8)); // 4
		System.out.println((int)2.9 + (int)1.8); // 3
	}
}
