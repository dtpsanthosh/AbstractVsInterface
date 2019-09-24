package Abstract;

public class Test {
	public static void main(String[] args) {
		Bank hdfc = new HdfcBank();
		hdfc.deposit();
		hdfc.withdraw();
		hdfc.calculateInterest();
		Bank sbi=new SbiBank();
		sbi.deposit();
		sbi.withdraw();
		sbi.calculateInterest();
	}
}
