package Abstract;

abstract class Bank {
	public void deposit() {
		System.out.println("Common Deposit Method implementation for all banks");
	}
	public void withdraw() {
		System.out.println("Common Withdraw Method implementation for all banks");
		System.out.println("");
	}
	public abstract int calculateInterest();
}
