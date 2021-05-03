import java.util.Scanner;

public class JavaExam4 {

	public static void main(String[] args) {
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
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		}
		else if (op.equals("-"))
		{
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			System.out.printf("%d+%d=%d\n", num1, num2, num1-num2);
		}
		else if (op.equals("*"))
		{
			System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
			System.out.printf("%d+%d=%d\n", num1, num2, num1*num2);
		}
		else
		{
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			System.out.printf("%d+%d=%d\n", num1, num2, num1/num2);
		}
		sc.close();
	}

}
