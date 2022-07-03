/**
 * Example 2-2 변수(variable), 리터럴(literal), 상수(final) 활용
 */
public class CircleArea {
public static void main(String[] args) {
	final double PI = 3.14;
	
	double radius = 10.0; // 원의 반지름
	double circleArea = radius*radius*PI; //원의 면적계산
	
	// 원의 면적을 화면에 출력
	System.out.println("원의 면적 = " + circleArea);
}
}
