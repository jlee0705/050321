import java.util.Scanner;

public class JavaExam3 {
	public static void main(String[] args) {
		//-----------------------
		//학점 관리 프로그램 v 1.0
		//-----------------------
		//100~90:A
		//89~80: B
		//79~70: C
		//69~60: D
		//59이하: F
		//-----------------------
		//국어점수 입력:
		//영어점수 입력:
		//수학점수 입력:
		//[출력형태]
		//총점:xxx, 평균:xx, 학점:x

		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("학점 관리 프로그램 v 1.0");
		System.out.println("-----------------------");
		System.out.println("100~90: A");
		System.out.println("89~80: B");
		System.out.println("79~70: C");
		System.out.println("69~60: D");
		System.out.println("59이하: F");
		System.out.println("-----------------------");
		System.out.println("국어점수 입력:");
		int Kor = sc.nextInt();
		System.out.println("영어점수 입력:");
		int Eng = sc.nextInt();
		System.out.println("수학점수 입력:");
		int Math = sc.nextInt();
		int Avg = ((Kor+Eng+Math)/3);
		if (Avg >= 90)
			System.out.println("학점: A");
		else if((Avg >=80 && Avg < 90))
			System.out.println("학점: B");
		else if((Avg >=70 && Avg < 80))
			System.out.println("학점: C");
		else if((Avg >=60 && Avg <70))
			System.out.println("학점: D");
		else if((Avg <60))
			System.out.println("학점: F");
 
		sc.close();
	}

}
