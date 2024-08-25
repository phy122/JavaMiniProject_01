package Mission_11;

import java.util.List;
import java.util.Scanner;
/*
 * Account 클래스 생성
 * 	 계좌는 최대 1000개까지 생성가는하고 금액은 최대 1조까지 저장가능
 * 1. 계좌등록
 * 	 계좌번호 숫자 8개 입력, 예금주 입력, 최초예금액 입력, 비밀번호 입력
 * 		배열에 저장 arr[계좌번호] = {예금주이름, 최초예금액, 비밀번호}
 *			*추후에 계좌번호 int로 생성 후 String으로 변환해서  
 *
 * 2. 입금
 * 	 계좌번호 arr[계좌번호] 입력
 * 	입금액 money = sc.nextint(); 입력
 * 	이후 1번 예, 2번 아니오
 *  if문써서 1번 누르면 arr[계좌번호} ={예금주이름, 최초예금액 + money, 비밀번호}
 *   2번 누르면 null로 리턴
 * 3. 출금
 * 	계좌번호 입력 > 비밀번호 입력
 * 	계좌번호 입력시 반복문으로 입력과 배열속 숫자 비교 비밀번호도 if문 사용해서 비교
 * 	틀리면 비밀번호가 다릅니다 출력 이후 null로 리턴
 *  둘다 맞으면 출금액 입력 이후
 *  
 *  result = 기존 예금액 - money사용
 *  하지만 그전에 기존예금액 < money 작으면 err 메시지 금액이 부족합니다 출력 이후 null로 리턴
 *  
 *  4.계좌조회
 *  계좌번호, 비밀번호 입력 이후 기존에 있는 이름과 게좌잔액 출력
 *  틀리면 null로 리턴
 *  syso { "'" +name+"'" + "계좌잔액은" + 예금액 +"원 입니다")
 *   
 *  5. 계좌목록
 *  	AccountList 출력
 *
 */
public class bank {
public static void main(String[] args) {
	AccountAccess ds = new AccountAccess();
	Account ss = new Account();
	// create를 케이스 내부에 집어넣어서 사용해볼것
	Scanner sc = new Scanner(System.in);
			int b;
	do {
		System.out.println("===================");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("0. 종료");
		System.out.println("===================");
		System.out.print("입력 >>> ");
		b = sc.nextInt();
		if(b == 0) break;
		// break: 제어문을 탈출하는 키워드 * 가장 가까운 제어문만 탈출한다.
		
		// 메뉴 번호 입력
		// 메뉴 선택}

		switch (b) {
		case 1:
				System.out.print("계좌번호 >>");
				sc.nextLine();
				String account  = sc.nextLine();
				ss.setAccount(account);
				System.out.print("예금주명 >>");
				String name = sc.nextLine();
				ss.setName(name);
				System.out.println("비밀번호 >>");
				int ps = sc.nextInt();
				ss.setPassword(ps);
				System.out.println("예금액");
				int money = sc.nextInt();
				if(money > 1000000) {
					System.err.println("최대 입금액은 100만원을 넘을 수 없습니다.");
					break;
				}
				System.out.print("");
				ss.setMoney(money);
			
				Account newAC = new Account(account, name, money, ps);
				ds.create(newAC);
			break;
			
		case 2:
			System.out.println("계좌번호 >>");
			sc.nextLine();
			String account1 = sc.nextLine();
			System.out.println("비밀번호 >>");
			int ps1 = sc.nextInt();
			System.out.println("입금할 금액을 입력해주세요.");
			//계좌 및 비밀번호 조건
			int money1 = sc.nextInt();
			if(money1 > 1000000) {
				System.err.println("최대 입금액은 100만원을 넘을 수 없습니다.");
				break;
			}
			
			Account dep = new Account(account1, ps1, money1);
			ss.deposit(money1);
			
			break;
			
		case 3:
			System.out.println("계좌번호 >>");
			sc.nextLine();
			String account2 = sc.nextLine();
			System.out.println("비밀번호 >>");
			int ps2 = sc.nextInt();
			// 계좌 및 비밀번호 조건
			System.out.println("출금할 금액을 입력해주세요.");
			int money2 = sc.nextInt();
			Account with = new Account(account2, ps2, money2);
			ss.withraw(money2);
			
			break;
		case 4:
			System.out.println();
			int w = sc.nextInt();
			ds.read(w);
			break;
		case 5:
			System.out.println();
			ds.list();
			break;
		default:
			break;
		}} while(b != 0);
	
}

}