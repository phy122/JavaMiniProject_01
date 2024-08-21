package Mission_11;

public class Account{
/**
 * 통장 정보
 * - 계좌번호
 * - 예금주명
 * - 통장잔액
 * - 비밀번호
 */
	
	private int Account;
	private String name;
	private int money;
	private int password;
	
	public Account() {
		this(0000-0000,"예금주 없음",0,0000);
	}


	public Account(int account, String name, int money, int password) {
		this.Account = account;
		this.name = name;
		this.money = money;
		this.password = password;
		
		
	}


	public int getAccount() {
		return Account;
	}


	public void setAccount(int account) {
		Account = account;
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


	public void setMoney(int money) {
		this.money = money;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Account [계좌번호=" + Account + ", 예금주명 =" + name + ", 예금액=" + money + "]";
	}
	
}
