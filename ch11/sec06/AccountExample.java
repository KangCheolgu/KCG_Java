package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(20000);
		System.out.println("예금액 : " + account.getValance());

		try {
			account.withdraw(30000);
		} catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
