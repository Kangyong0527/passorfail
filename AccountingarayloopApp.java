
public class AccountingarayloopApp {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]);
		double VATlate = 0.1;
		double expenceRate = 0.3;
		double vat = valueofsupply*VATlate;
		double total = valueofsupply + vat;
		double expence = valueofsupply*expenceRate;
		double income = valueofsupply - expence;
		
		
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ vat);
		System.out.println("Total : "+ total);
		System.out.println("Expense : "+ expence);
		System.out.println("Income : "+ income);
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		
		int i = 0;
		while(i < dividendRates.length) {
		
			System.out.println("Dividend : "+ income * dividendRates[i]);
			i = i + 1;
		}




	}

}
