package ���޺й��;

public class �հݺ��հ� {

	public static void main(String[] args) {

		double cutline=70;
		double[] students = new double[10];
		String[] �л� = new String[10];
		�л�[0] = "�л�1 100";
		�л�[1] = "�л�2 80";
		�л�[2] = "�л�3 90";
		�л�[3] = "�л�4 20";
		�л�[4] = "�л�5 30";
		�л�[5] = "�л�6 40";
		�л�[6] = "�л�7 50";
		�л�[7] = "�л�8 10";
		�л�[8] = "�л�9 50";
		�л�[9] = "�л�10 40";

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
			System.out.println(�л�[i]);
		if(students[i] < cutline) {
			System.out.println("���а��Դϴ�.");
		}else {
		System.out.println("�հ��Դϴ�.");
		}
		

		
	}
}
}
			
			





