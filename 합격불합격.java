package 월급분배기;

public class 합격불합격 {

	public static void main(String[] args) {

		double cutline=70;
		double[] students = new double[10];
		String[] 학생 = new String[10];
		학생[0] = "학생1 100";
		학생[1] = "학생2 80";
		학생[2] = "학생3 90";
		학생[3] = "학생4 20";
		학생[4] = "학생5 30";
		학생[5] = "학생6 40";
		학생[6] = "학생7 50";
		학생[7] = "학생8 10";
		학생[8] = "학생9 50";
		학생[9] = "학생10 40";

		students[0] = Double.parseDouble(args[0]);
		students[1] = Double.parseDouble(args[1]);
		students[2] = Double.parseDouble(args[2]);
		students[3] = Double.parseDouble(args[3]);
		students[4] = Double.parseDouble(args[4]);
		students[5] = Double.parseDouble(args[5]);
		students[6] = Double.parseDouble(args[6]);
		students[7] = Double.parseDouble(args[7]);
		students[8] = Double.parseDouble(args[8]);
		students[9] = Double.parseDouble(args[9]);

	
		for(int i=0; i<students.length; i++) {
			System.out.println(학생[i]);
		if(students[i] < cutline) {
			System.out.println("불학격입니다.");
		}else {
		System.out.println("합격입니다.");
		}
		

		
	}
}
}
			
			





