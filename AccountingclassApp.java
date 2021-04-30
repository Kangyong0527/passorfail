

class Accounting{
	public double valueofsupply;
	public double vATlate;
	public double expenceRate;
	
	    void print() {
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend1 : "+ getDividend1() );
		System.out.println("Dividend2 : "+ getDividend2() );
		System.out.println("Dividend3 : "+ getDividend3() );
	}

	private double getDividend3() {
		return getIncome() * 0.2;
	}

	private double getDividend2() {
		return getIncome() * 0.3;
	}

	private double getDividend1() {
		return getIncome() * 0.5;
	}

	private double getIncome() {
		return valueofsupply - getExpense();
	}

	private double getExpense() {
		return valueofsupply*expenceRate;
	}

	private double getTotal() {
		return valueofsupply + getVAT();
	}

	private double getVAT() {
		return valueofsupply*vATlate;
		
	}
}

public class AccountingclassApp {
	
	public static void main(String[] args) {
			
		
		Accounting a1 = new Accounting();
		a1.valueofsupply = 10000.0;
		a1.vATlate = 0.1;
		a1.expenceRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueofsupply = 20000.0;
		a2.vATlate = 0.05;
		a2.expenceRate = 0.2;
		a2.print();
		
	  
		

	}

}


