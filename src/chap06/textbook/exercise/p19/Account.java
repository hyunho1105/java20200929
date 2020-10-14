package chap06.textbook.exercise.p19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
			balance += balance;
		} else {
			return;
		}
	}
	public int getBalance() {
		return this.balance;
	}

}
