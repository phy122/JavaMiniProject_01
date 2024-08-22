package Mission_11;

public class AccountAccess {
	Account as = new Account();
	static int Ac = 1000;
	int count = 0;
	
	Account[] accountList = new Account[Ac];

	public Object create(Account newAC) {
		if(count >= 1000) {
			System.out.println("계좌가 가득 찼습니다.");
			return null;
		}
		
		int AcNo = ++count;
		accountList[count -1] = newAC;
		System.out.println(newAC);
		System.out.println("계좌가 등록되었습니다.");
		return newAC;
	}
	
	//계좌 불러오기
	public Account read(int no) {
		if(count < no) {
			System.out.println("해당번호는 존재하지 않습니다.");
			return null;
		}
		else {
			System.out.println(accountList[no-1]);
			return accountList[no-1];
		}
	}
	
	//계좌 목록 조회
	public void list() {
		if(count ==0) {
			System.out.println("계좌가 존재하지 않습니다.");
		}
		for (int i = 0; i < accountList.length; i++) {
			if(accountList[i] == null) {
				break;
			}
			System.out.println(accountList[i]);
		}
	}
	
	
	
			
	}


	

	
		
		
	
	
	
