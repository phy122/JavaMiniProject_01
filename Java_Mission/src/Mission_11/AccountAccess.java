package Mission_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountAccess {
	Account as = new Account();
	static int Ac = 1000;
	int count = 0;
	Scanner sc = new Scanner(System.in);
	
	Account[] accountList = new Account[Ac];
	

	public Object create(Account newAC) {
		if(count >= 1000) {
			System.out.println("계좌가 가득 찼습니다.");
			return null;
		}
		++count;
		accountList[count -1] = newAC;
		System.out.println(newAC);
		System.out.println("계좌가 등록되었습니다.");
		return newAC;
	}
	
	
	//계좌 불러오기
	public void read(String ac, int ps1) {
		boolean T = false;
		
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccount().equals(ac) && accountList[i].getPassword() == ps1) {
				System.out.println("'"+accountList[i].getName()+"'" + "님의 잔액은 " + accountList[i].getMoney() + "원 입니다.");
				T = true;
				break;
			}
			
			}
		if(T == false) {
			System.err.println("해당 계좌번호 혹은 비밀번호가 일치하지 않습니다.");
	}
		
	}
	public void dep(String ac, int ps1) {
			int money1 = 0;
	
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccount().equals(ac) && accountList[i].getPassword() == ps1) {
				System.out.println("입금할 금액을 입력해주세요.");
				//계좌 및 비밀번호 조건
				try{
				money1 = sc.nextInt();
					
				}catch(InputMismatchException e) {
					System.err.println("호환할 수 없는 수치입니다..");
					sc.next();
					break;
				}
				if(money1 + accountList[i].getMoney() >= 1000000000) {
					System.err.println("최대 예금액은 10억을 넘을 수 없습니다.");
					return;
				}
				
				accountList[i].deposit(money1);
				System.out.println(money1 + "원 입금이 완료되었습니다.");
				System.out.println(accountList[i]);
				return;
			}
		}
		
				System.err.println("계좌 또는 비밀번호가 일치하지 않습니다.");
			
			
	
		
	}
	public void with(String ac, int ps) {
		boolean w = false;
		int money1 = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccount().equals(ac) && accountList[i].getPassword() == ps) {
				System.out.println("출금할 금액을 입력해주세요.");
				w = true;
				//계좌 및 비밀번호 조건
				try{
					money1 = sc.nextInt();
						
					}catch(InputMismatchException e) {
						System.err.println("호환할 수 없는 수치입니다..");
						sc.next();
						break;
					}
				
				
				if(money1 > 1000000) {
					System.err.println("최대 출금액은 100만원을 넘을 수 없습니다.");
					break;
				}
				else if(money1 > accountList[i].getMoney()) {
					
						System.err.println("잔액이 부족합니다.");
						break;
					
				}
				
				else {
				
				accountList[i].withraw(money1);
				System.out.println(money1 + "원 출금이 완료되었습니다.");
				System.out.println(accountList[i]);
				}
			}
		}
		
			if (w == false)
			{
				System.err.println("계좌 또는 비밀번호가 일치하지 않습니다.");
			
	}
	}
	//계좌 목록 조회
	public void list() {
		if(count ==0) {
			System.err.println("계좌가 존재하지 않습니다.");
			return;
		}
			System.out.println("	  계좌번호           예금주 	       예금액");
		for (int i = 0; i < accountList.length; i++) {
			if(accountList[i] == null) {
				break;
			}
			System.out.println(accountList[i]);
		}
	}
	
	
	
			
	}


	

	
		
		
	
	
	
