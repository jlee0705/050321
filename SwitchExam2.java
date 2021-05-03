import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		//-----------------------
		//담배자판기 프로그램 v1.0
		//-----------------------
		//원하는 담배를 메뉴에서 선택하세요.
		//1. 에쎄 골드 리프	:6,000원
		//2. 에쎄 스페셜 골드	:5,000원
		//3. 더원 블루		:4,500원
		//4. 더원 오렌지 		:4,500원
		//5. 더원 화이트		:4,500원
		//-----------------------
		//담배를 선택하세요:5
		//더원 화이트를 선택했다.
		//-----------------------
		//금액을 투입하세요
		//더원 화이트를 구입했습니다.
		//거스름돈 5500원을 받으세요.
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("-----------------------");
		System.out.println("담배자판기 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("1. 에쎄 골드 리프	:6,000원");
		System.out.println("2. 에쎄 스페셜 골드	:5,000원");
		System.out.println("3. 더원 블루		:4,500원");
		System.out.println("4. 더원 오렌지 	:4,500원");
		System.out.println("5. 더원 화이트		:4,500원");
		System.out.println("담배를 선택하세요: ");
		String cig = sc.nextLine();
		switch(cig)
		{
		case "1":
			System.out.println("에쎄 골드 리프를 선택했다.");
			System.out.println("금액을 투입하세요: ");
			int dambae = sc.nextInt();
			if (dambae == 6000)
				System.out.println("에쎄 골드 리프를 구입했다.");
			else if (dambae > 6000)
				System.out.printf("거스름돈 %d원을 받으라", 6000-dambae);
			else
				System.out.println("돈이 모자라다");
			break;
		case "2":
			System.out.println("에쎄 스페셜 골드를 선택했다.");
			System.out.println("금액을 투입하세요: ");
			int dambae2 = sc.nextInt();
			if (dambae2 == 5000)
				System.out.println("에쎄 골드 리프를 구입했다.");
			else if (dambae2 > 5000)
				System.out.printf("거스름돈 %d원을 받으라", dambae2-5000);
			else
				System.out.println("돈이 모자라다");
			break;
		case "3":
			System.out.println("더원 블루를 선택했다.");
			System.out.println("금액을 투입하세요: ");
			int dambae3 = sc.nextInt();
			if (dambae3 == 4500)
				System.out.println("에쎄 골드 리프를 구입했다.");
			else if (dambae3 > 4500)
				System.out.printf("거스름돈 %d원을 받으라", dambae3-4500);
			else
				System.out.println("돈이 모자라다");
			break;
		case "4":
			System.out.println("더원 오렌지를 선택했다.");
			System.out.println("금액을 투입하세요: ");
			int dambae4 = sc.nextInt();
			if (dambae4 == 4500)
				System.out.println("에쎄 골드 리프를 구입했다.");
			else if (dambae4 > 4500)
				System.out.printf("거스름돈 %d원을 받으라", dambae4-4500);
			else
				System.out.println("돈이 모자라다");
			break;
		case "5":
			System.out.println("더원 화이트를 선택했다.");
			System.out.println("금액을 투입하세요: ");
			int dambae5 = sc.nextInt();
			if (dambae5 == 4500)
				System.out.println("에쎄 골드 리프를 구입했다.");
			else if (dambae5 > 4500)
				System.out.printf("거스름돈 %d원을 받으라", dambae5-4500);
			else
				System.out.println("돈이 모자라다");
			break;
		}
		sc.close();
	}

}
