package flowEx01;

public class FlowEx1 {
 // 문제 : 다음 중 해당 int x에 대한 값을 검사하여 
//  출력 여부를 확인하라 
	public static void main(String[] args) {
		//메인 함수 작성 
		
		int x= 0; 
		// x값을 integer 형으로 설정 초기값을 0으로 지정 
		
		System.out.printf("x= %d 일 때 , 참인 것은 %n ",x);
		//출력문 작성
		
		if(x==0) System.out.println("x==0"); // => 조건 참 : 출력 
		
		/* if 문은 조건문으로서 if(검사하고자 하는 값)
		   이 참/거짓이냐에 따라 출력 여부를 결정한다. 
		*/
		
		if(x!=0) System.out.println("x!=0"); // => 조건 거짓 
		if(!(x==0)) System.out.println("!(x==0)"); // => 조건 거짓 
		if(!(x!=0)) System.out.println("!(x!=0)"); // => 조건 참 : 출력 
		x = 1; 
		System.out.printf("x= %d 일 때 , 참인 것은 %n ",x);
		if(x==0) System.out.println("x==0");  // => 조건 거짓
		if(x!=0) System.out.println("x!=0"); // => 조건 참 : 출력
		if(!(x==0)) System.out.println("!(x==0)"); // => 조건 참 : 출력
		if(!(x!=0)) System.out.println("!(x!=0)");  // => 조건 거짓
		
		
	}

}
