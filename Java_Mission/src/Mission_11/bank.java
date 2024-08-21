package Mission_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Account 클래스 생성
 * 	 계좌는 최대 1000개까지 생성가는하고 금액은 최대 1조까지 저장가능
 * 1. 계좌등록
 * 	 계좌번호 숫자 8개 입력, 예금주 입력, 최초예금액 입력, 비밀번호 입력
 * 		배열에 저장 arr[계좌번호] = {예금주이름, 최초예금액, 비밀번호}
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
	Account ds = new Account();
	
	Scanner sc = new Scanner(System.in);
	String name = " ";
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
		int b = sc.nextInt();
		if(b == 0) break;
		// break: 제어문을 탈출하는 키워드 * 가장 가까운 제어문만 탈출한다.
		
		// 메뉴 번호 입력
		// 메뉴 선택}

		switch (b) {
		case 1:
				System.out.print("계좌번호 >>");
				String  = sc.next();
				System.out.print(" >>");
				String c = sc.next();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}
		
}
}