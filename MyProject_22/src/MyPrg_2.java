import java.util.Scanner;

public class MyPrg_2 {

	public static void main(String[] args) {
		
		//삼각형 밑변과 높이를 입력 받아 삼각형 면적 값을 출력하는 프로그램을 작성하라.
		Scanner scn = new Scanner(System.in);
		
		// FirstValue -> 밑변 / SecondValue -> 높이
			int FirstValue = scn.nextInt();
			int SecondValue = scn.nextInt();
			
		// 밑변, 높이의 자료형을 int로 하면 면적 구할 때 float으로 자료형 선언했을 때 신기한 점
		// 예를 들어 int FirstValue 25 / SecondValue 5 -> float TriangleArea = 62.0 나옴
		// float FirstValue 25 / SecondValue 5 -> float TriangleArea = 62.5 나옴 
			
		// 삼각형 면적: 밑변 * 높이 / 2	
			float TriangleArea = (FirstValue * SecondValue) / 2;
		
		// 출력
			System.out.println(TriangleArea);
	}

}
