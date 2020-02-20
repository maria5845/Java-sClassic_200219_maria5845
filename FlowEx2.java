package flowEx02;

import java.util.*;

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		// INTEGER형 입력받을 변수 하나를 선언
		System.out.print("숫자를 하나 입력하세요.>");
		// 출력문 생성
		Scanner scanner = new Scanner(System.in);
		// Scanner 유틸을 사용하기 위해 scanner 이름
		String tmp = scanner.nextLine();
		// tmp에 문자열 값을 받고 scanner객체는 .nextLine()메서드를 이용해서 받는ㄷ
		// nextLine() => 문자열을 받는 메서드
		input = Integer.parseInt(tmp);
		// pasInt(변화하고자 하는 변수 )

		if (input == 0) {
			// input이 0이면?
			System.out.println("입력하신 숫자는 0 입니당");
			// 출력문
		} else if (input == 1) {
			// input이 1이면? eles if는 if가 아닌 다른 조건을 작성하고 싶을때
			// else if 경우 출력문 문을 작성한다.
			System.out.println("입력하신 숫자는 0이 아닙니다");
			System.out.println("입력하신 숫자는 1입니다");

		} else {
			// 나머지 else 경우 출력문 문을 작성한다.
			System.out.println("입력하신 숫자는 0 도 1도 아닙니다");
			System.out.printf("입력하신 숫자는 %d입니다", input);
		}
	}

}
