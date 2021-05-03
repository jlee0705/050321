import java.util.Scanner;

public class JavaExam2 {

	public static void main(String[] args) {
		//---------------------
		//윤년 구하는 프로그램 v1.0
		//---------------------
		//윤년을 구하는 년도입력:2020
		//출력 결과: 해당 년도는 2020 윤년 입니다.
		
		
		//1. 입력한 년도를 4로 나누면 나머지가 0이고,
		//100으로 나누면 0이 아님.
		//2. 입력한 년도를 400으로 나누면 나머지가 0.
		//3. 1번 또는 2번 조건 만족시에 윤년이 구해짐
		
		System.out.print("윤년을 구하는 년도입력:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year%4==0 && year % 100 !=0) || (year%400==0))
		{
			System.out.println(year+"는 윤년입니다.");
		}
		else {
			System.out.println(year+"는 윤년이 아닙니다.");	
		}
		sc.close();
	}

}
