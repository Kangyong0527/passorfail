
public class Accountingifunder10000App {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]);
		double VATlate = 0.1;
		double expenceRate = 0.3;
		double vat = valueofsupply*VATlate;
		double total = valueofsupply + vat;
		double expence = valueofsupply*expenceRate;
		double income = valueofsupply - expence;
		double diviend1 = income * 1;
		double diviend2 = income * 0;
		double diviend3 = income * 0;
		
		
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ vat);
		System.out.println("Total : "+ total);
		System.out.println("Expense : "+ expence);
		System.out.println("Income : "+ income);
		System.out.println("Dividend1 : "+ diviend1 );
		System.out.println("Dividend2 : "+ diviend2 );
		System.out.println("Dividend3 : "+ diviend3 );




	}

}
