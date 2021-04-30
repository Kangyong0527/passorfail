class Accounting2 {	
	public static double valueofsupply;
	public static double vATlate;
	public static double expenceRate;
	public static void print() {
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend1 : "+ getDividend1() );
		System.out.println("Dividend2 : "+ getDividend2() );
		System.out.println("Dividend3 : "+ getDividend3() );
	}

	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getDividend2() {
		return getIncome() * 0.3;
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}

	public static double getIncome() {
		return valueofsupply - getExpense();
	}

	public static double getExpense() {
		return valueofsupply*expenceRate;
	}

	public static double getTotal() {
		return valueofsupply + getVAT();
	}

	public static double getVAT() {
		return valueofsupply*vATlate;
	}
	 
	}
	



public class AccountingmethodApp {

	public static void main(String[] args) {
		Accounting2.valueofsupply = 10000.0;
		Accounting2.vATlate = 0.1;
		Accounting2.expenceRate = 0.3;
		Accounting2.print();
	}

	
}
