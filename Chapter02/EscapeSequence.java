/*
 * p.70, Escape sequence Exam
 */
public class EscapeSequence {
	public static void main(String[] args) {
		// Commamnd Prompt, cmd.exe에서 javac 로 compile하면 확인하기 수월하다 😰
		
		// 라면 먹 싶다
		System.out.println("라면 먹고\b 싶다"); // backspace '\b'
		
		// 라면 먹고┃ 싶다
		System.out.println("라면 먹고\f 싶다"); // form feed '\f'
		
		// 라면 먹고 
		// 싶다
		System.out.println("라면 먹고\n 싶다"); // line feed '\n'

		// 싶다 과자먹고싶다
		System.out.println("라면 먹고\r 싶다 과자먹고싶다"); // carriage return '\r'
		
		// 라면 먹고	싶다
		System.out.println("라면 먹고\t 싶다"); // tab '\t'
		
		// 라면 먹고' 싶다
		System.out.println("라면 먹고\' 싶다"); // single quote '\''
		
		// 라면 먹고" 싶다
		System.out.println("라면 먹고\" 싶다"); // double quote '\"'
		
		// 라면 먹고\ 싶다
		System.out.println("라면 먹고\\ 싶다"); // backslash '\\'
	}
}
