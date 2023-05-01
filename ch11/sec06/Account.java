package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getValance () {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw (int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException();
		}
		balance -= money;
		System.out.println("남은 잔액은 " + balance +" 원 입니다.");
	}
}
