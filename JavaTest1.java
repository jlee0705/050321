import java.util.Scanner;

public class JavaTest1 {

	public static void main(String[] args) {
		//주석: /* */
	System.out.println("111");
	System.out.print("222"+"\n");
	System.out.println("333");
	System.out.printf("%d\n", 100);
	
	// 출력 입력
	Scanner sc = new Scanner(System.in);
//	System.out.print("나이 입력: ");
//	int age = sc.nextInt();
//	System.out.print("이름 입력: ");
//	String name = sc.next();
//	System.out.println("나이: " + age);
//	System.out.println("이름: " + name);
	
	
	//국어, 영어, 수학 점수를 입력받고
	//총점과 평균을 구하는 프로그램 작성.
	System.out.print("국어 점수 입력: ");
	int kor = sc.nextInt();
	System.out.print("영어 점수 입력: ");
	int eng = sc.nextInt();
	System.out.print("수학 점수 입력: ");
	int math = sc.nextInt();
	
	System.out.println("국어: "+ kor);
	System.out.println("영어: "+ eng);
	System.out.println("수학: "+ math);
	System.out.printf("총점 : %d",kor+eng+math,"     ");
	System.out.printf("평균 : %d \n",(kor+eng+math)/3);
	
	int money1=0;
	int money2=0;
	int money3=0;
	int money4=0;
	System.out.println("교환할 돈:");
	int money = sc.nextInt();
	
	int money500=(int)(money/500);
	System.out.printf("500원 개수: ");
	money1 = money-money500*500;
	System.out.printf("%d\n",money1);
	
	int money100 = (int)(money/100);
	System.out.printf("100원 개수: ");
	money2 = money-money100*100;
	System.out.printf("%d\n", money2);
			
	int money50 = (int)(money/50);
	System.out.printf("50원 개수: ");
	money3 = money- money50*50;
	System.out.printf("%d\n", money3);
	
	int money10 = (int)(money/10);
	System.out.printf("10원 개수: ");
	money4 = money-money10*10;
	}

	
}