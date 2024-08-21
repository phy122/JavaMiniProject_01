package Mission_11;

public class AccountAccess {
	Account as = new Account();
	static int Ac = 1000;
	int count = 0;
	
	Account[] accountList = new Account[Ac];
	
	public Account create(Account ac) {
		if(count >= 1000) {
			System.out.println("계좌가 가득 찼습니다.");
			return null;
		}
		int AcNo = ++count;
		accountList[count -1] = ac;
		System.out.println(ac);
		System.out.println("계좌가 등록되었습니다.");
		return ac;
	}
	public int deposit(Account dp) {
		System.out.println(accountList[0]);
		for (int i = 0; i < accountList.length; i++) {
			if(accountList[i] != null && accountList[i].equals(dp)) { 
				int sum = accountList[i].getMoney() + dp.getMoney(); 
				accountList[i].setMoney(sum);
				System.out.println(accountList[i].getName()+"님의 계좌로" + dp.getMoney()+ "원 이 입금되었습니다.");
				System.out.println("총잔액 : " + sum);
				return 1;
			}}
	
		System.out.println("계좌를 찾을 수 없습니다.");
		return 0;
		}

	
		
}
		
	
	
	
