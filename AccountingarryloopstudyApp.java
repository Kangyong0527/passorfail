
public class AccountingarryloopstudyApp {

	public static void main(String[] args) {
		
		double �����޿� = Double.parseDouble(args[0]);
		double ������ = �����޿� * 0.1;
		double ��� = 400000;
		double ��뺸�� = �����޿� * 0.0898;
		double �Ǳ޿� = �����޿� - ��뺸�� - ������ - ���;
		double ����û�� = 200000.0;
		double ����û���� = ����û��;
		double ��Ȱ�� = �Ǳ޿� - ����û����;
		double ��Ÿ = 300000.0;
		double income = ��Ȱ�� - ��Ÿ;
	
		
		System.out.println("�����޿� : "+�����޿�);
		System.out.println("4�뺸�� : "+ ��뺸��);
		System.out.println("�Ǳ޿� : "+ �Ǳ޿�);
		System.out.println("����û�� : "+ ����û����);
		System.out.println("��Ȱ�� : "+ ��Ȱ��);
		System.out.println("��Ÿ : "+ ��Ÿ);
		System.out.println("���� �� : "+ income);
		System.out.println("������ : " + ������);
		

		double[] �뵷 = new double[3];
		�뵷[0] = 0.5;
		�뵷[1] = 0.3;
		�뵷[2] = 0.2;
		
		
		double ���մԵ� = income * �뵷[0];
		double ģ���뵷 = income * �뵷[1];
		double �ܰ��뵷 = income * �뵷[2];
		double �뵷���� = ���մԵ� + ģ���뵷 + �ܰ��뵷;
		double ������ = �뵷���� - income;
		
		System.out.println("���մԵ� : " +���մԵ�);
		System.out.println("ģ���뵷 : " +ģ���뵷);
		System.out.println("�ܰ��뵷 : " +�ܰ��뵷);
		System.out.println("��Ÿ��� : " + ������);




	}
	
	}
	


