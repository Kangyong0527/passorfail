package ���޺й��;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonThree extends JFrame
{
	JButton b1 = new JButton("���������");

	

	public ButtonThree()
	{
		//���� ����
		super("������ ���⿡!!");
		
		//���̾ƿ� ����
		this.setLayout(new FlowLayout());
		
		//��ư �߰�
		this.add(b1);

		//������ ũ�� ����
		this.setSize(300, 400);
		
		//������ ���̵��� ����
		this.setVisible(true);
		
		//X��ư ������ �� �������� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		//����
		new ButtonThree();
	}

}