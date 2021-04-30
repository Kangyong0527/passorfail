
public class AccountingarryloopstudyApp {

	public static void main(String[] args) {
		
		double 세전급여 = Double.parseDouble(args[0]);
		double 십일조 = 세전급여 * 0.1;
		double 헌금 = 400000;
		double 사대보험 = 세전급여 * 0.0898;
		double 실급여 = 세전급여 - 사대보험 - 십일조 - 헌금;
		double 주택청약 = 200000.0;
		double 주택청약비용 = 주택청약;
		double 생활비 = 실급여 - 주택청약비용;
		double 기타 = 300000.0;
		double income = 생활비 - 기타;
	
		
		System.out.println("세전급여 : "+세전급여);
		System.out.println("4대보험 : "+ 사대보험);
		System.out.println("실급여 : "+ 실급여);
		System.out.println("주택청약 : "+ 주택청약비용);
		System.out.println("생활비 : "+ 생활비);
		System.out.println("기타 : "+ 기타);
		System.out.println("남은 돈 : "+ income);
		System.out.println("십일조 : " + 십일조);
		

		double[] 용돈 = new double[3];
		용돈[0] = 0.5;
		용돈[1] = 0.3;
		용돈[2] = 0.2;
		
		
		double 여왕님돈 = income * 용돈[0];
		double 친정용돈 = income * 용돈[1];
		double 외가용돈 = income * 용돈[2];
		double 용돈모음 = 여왕님돈 + 친정용돈 + 외가용돈;
		double 내먼지 = 용돈모음 - income;
		
		System.out.println("여왕님돈 : " +여왕님돈);
		System.out.println("친정용돈 : " +친정용돈);
		System.out.println("외가용돈 : " +외가용돈);
		System.out.println("당신먼지 : " + 내먼지);




	}
	
	}
	


