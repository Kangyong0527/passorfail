
public class AccountingApp {

	public static void main(String[] args) {
		
		double �����޿� = Double.parseDouble(args[0]);
		double ��뺸�� = �����޿� * 0.0898;
		double �Ǳ޿� = �����޿� - ��뺸��;
		double ����û�� = 200000.0;
		double ��Ȱ�� = �Ǳ޿� - ����û��;
		double ���� = 300000.0;
		double income = ��Ȱ�� - ����;
		double �Ƴ��뵷 = income * 0.2;
		double ģ���뵷 = income * 0.3;
		double �ܰ��뵷 = income * 0.2;
		double �뵷 = �Ƴ��뵷 + ģ���뵷 + �ܰ��뵷;
		double ���������� = income - �뵷;
		
		
		System.out.println("�����޿� : "+�����޿�);
		System.out.println("4�뺸�� : "+ ��뺸��);
		System.out.println("�Ǳ޿� : "+ �Ǳ޿�);
		System.out.println("����û�� : "+ ����û��);
		System.out.println("�Ǳ޿� : "+ ��Ȱ��);
		System.out.println("���� : "+ ����);
		System.out.println("���� �� : "+ income);
		System.out.println("���� �� ������ : "+ ����������);
		System.out.println("���մԵ� : "+ �Ƴ��뵷 );
		System.out.println("�����뵷 : "+ ģ���뵷 );
		System.out.println("���Ե� : "+ �ܰ��뵷 );
		




	}
	
	}
	


