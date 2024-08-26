package Mission_11;

import java.util.Objects;

public class Account{
/**
 * 통장 정보
 * - 계좌번호
 * - 예금주명
 * - 통장잔액
 * - 비밀번호
 */
	private String account;
	private String name;
	private int money;
	private int password;
	
	
	
	public Account() {
		this("계좌없음","예금주 없음",0,0000);
		
	}


	public Account(String account, int password, int money) {
		this.account = account;
		this.password = password;
		this.money = money;
	}


	public Account(String account, String name, int money, int password) {
		this.account = account;
		this.name = name;
		this.money = money;
		this.password = password;
		
		
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public Object setMoney(int money) {
		
		return this.money = money;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int ps) {
		this.password = ps;
	}
	
	public Object deposit(int dep) {
		
		
		
			this.money += dep;
		
		return dep;
	}
	 
	public Object withraw(int wit) {
			this.money -= wit;
			return wit;
	}


	@Override
	public String toString() {
		return "계좌정보 [계좌번호=" + account + ", 예금주명=" + name + ", 예금액=" + money + "]";
	}


	}

	



	
