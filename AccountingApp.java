
public class AccountingApp {

	public static void main(String[] args) {
		
		double 세전급여 = Double.parseDouble(args[0]);
		double 사대보험 = 세전급여 * 0.0898;
		double 실급여 = 세전급여 - 사대보험;
		double 주택청약 = 200000.0;
		double 생활비 = 실급여 - 주택청약;
		double 월세 = 300000.0;
		double income = 생활비 - 월세;
		double 아내용돈 = income * 0.2;
		double 친정용돈 = income * 0.3;
		double 외가용돈 = income * 0.2;
		double 용돈 = 아내용돈 + 친정용돈 + 외가용돈;
		double 내남은먼지 = income - 용돈;
		
		
		System.out.println("세전급여 : "+세전급여);
		System.out.println("4대보험 : "+ 사대보험);
		System.out.println("실급여 : "+ 실급여);
		System.out.println("주택청약 : "+ 주택청약);
		System.out.println("실급여 : "+ 생활비);
		System.out.println("월세 : "+ 월세);
		System.out.println("남은 돈 : "+ income);
		System.out.println("남은 내 먼지들 : "+ 내남은먼지);
		System.out.println("여왕님돈 : "+ 아내용돈 );
		System.out.println("엄마용돈 : "+ 친정용돈 );
		System.out.println("장모님돈 : "+ 외가용돈 );
		




	}
	
	}
	


