/*
 * CheckTime 3
 */
public class CheckTime3 {
	public static void main(String[] args) {
		// CheckTime 3-2
		final short YEAR = 365;
		final byte MONTH = 30;
		final byte WEEK = 7;
		
		// CheckTime 3-4
		char a = '가';
		int b = 012;
		int c = 0x1A;
		char d = "a"; // ""는 기본타입이 아닌 문자열 String의 인용문구, ''는 char의 인용문구
		char e = '\b';
		boolean f = true;
		double g = 0.23E-4;
		
		// CheckTime 3-5
		System.out.println((byte)(128 + 128) + (int)22.9); // 0 + 22가 된다.
	}
}
