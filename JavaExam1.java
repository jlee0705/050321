import java.util.Scanner;

public class JavaExam1 {

	public static void main(String[] args) {
		// ----------------------------------
		// 간단한 계산기 프로그램 v1.0
		// ----------------------------------
		//1. 숫자 1 입력:
		//2. 숫자 2 입력:
		//3. 연산자 입력(+,-,*,/): 
		//출려 형태 : 20 + 10 = 30
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력:");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력:");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/): ");
		String op = sc.next();
		
		if (op.equals("+"))
		{
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			
		}
		else if (op.equals("-"))
		{
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			
		}
		else if (op.equals("*"))
		{
			System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
			
		}
		else
		{
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			
		}
		sc.close();
		
	}

}
