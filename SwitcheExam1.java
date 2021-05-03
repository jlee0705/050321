import java.util.Scanner;

public class SwitcheExam1 {

	public static void main(String[] args) {
		//-------------------------------
		//식당메뉴 자동 주문 프로그램 v1.0
		//-------------------------------
		//원하는 식사를 선택학세요
		//1. 김치찌개: 5,000원
		//2. 된장찌개: 5,000원
		//3. 청국장:  5,000원
		//4. 칼국수: 5,000원
		//5. 멸치국수: 4,000원
		//-------------------------------
		//메뉴선택
		//
		System.out.println("-------------------------------");
		System.out.println("식당메뉴 자동 주문 프로그램 v1.0");
		System.out.println("-------------------------------");
		System.out.println("1. 김치찌개: 5,000원");
		System.out.println("2. 된장찌개: 5,000원");
		System.out.println("3. 청국장:  5,000원");
		System.out.println("4. 칼국수: 5,000원");
		System.out.println("5. 멸치국수: 4,000원");
		System.out.println("-------------------------------");
		System.out.println("메뉴 선택: ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.nextLine();
		switch (menu) {
		case "1":
			System.out.println("김치찌개를 선택하였습니다.");
			System.out.println("가격은 5,000원 입니다");
			break;
		case "2":
			System.out.println("된장찌개를 선택하였습니다.");
			System.out.println("가격은 5,000원 입니다");
			break;
		case "3":
			System.out.println("청국장을 선택하였습니다.");
			System.out.println("가격은 5,000원 입니다");
			break;
		case "4":
			System.out.println("칼국수를 선택하였습니다.");
			System.out.println("가격은 5,000원 입니다");
			break;
		case "5":
			System.out.println("멸치국수를 선택하였습니다.");
			System.out.println("가격은 4,000원 입니다");
			break;
		}
		
		sc.close();
	}

}
