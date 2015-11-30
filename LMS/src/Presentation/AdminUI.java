package Presentation;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdminUI extends GeneralUI{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminUI(){
		init();
	}
	
	void adminButton(){
		Button adminBtn = new Button(250,"src/picture/SAM.png","src/picture/SAMHL.png");
		this.getContentPane().add(adminBtn);
	}
	
	void table(){
		Vector<String> all=new Vector<String>();
		Vector<String> item=new Vector<String>();
		
		all.add("�˺�");
		all.add("����");
		item.add("����");
		item.add("�˺�");
		item.add("ְ��");
		
		MyTable t1=new MyTable(257,189,300,310,all);
		MyTable t2=new MyTable(574,189,490,64,item);
		t1.setTitleColor(new Color(113,113,113));
		t2.setTitleColor(new Color(113,113,113));
		t1.setContentColor(new Color(174,174,174));
		t2.setContentColor(new Color(174,174,174));
		
		this.getContentPane().add(t1);
		this.getContentPane().add(t2);
	}
	
	void init(){
		this.changeSymbol("src/picture/SAMHLIcon.png");
		this.changeState("����Ա", "ϵͳ�˻�����");
		adminButton();
		table();
		this.leftLabel();
		
		JLabel IDsearch =new JLabel("�˻���ѯ");
		JLabel ID =new JLabel("�˻�ID:");
		JTextField IDInput=new JTextField();
		SimpleButton search=new SimpleButton("��ѯ",911, 128, 150, 40);
		SimpleButton modify=new SimpleButton("�޸�Ȩ��",575, 260, 490, 35);
		SimpleButton save=new SimpleButton("ȷ�ϲ�����",575, 460, 490, 35);
		SimpleButton courier=new SimpleButton("���Ա",595, 300, 200,30);
		SimpleButton bs=new SimpleButton("Ӫҵ��ҵ��Ա",835, 300, 200,30);
		SimpleButton ts=new SimpleButton("��ת����ҵ��Ա",595, 340, 200,30);
		SimpleButton tadmin=new SimpleButton("��ת���Ŀ�����Ա",835, 340, 200,30);
		SimpleButton finance=new SimpleButton("������Ա",595, 380, 200,30);
		SimpleButton exfinance=new SimpleButton("�߼�������Ա",835, 380, 200,30);
		SimpleButton manage=new SimpleButton("�ܾ���",595, 420, 200,30);
		SimpleButton admin=new SimpleButton("����Ա",835, 420, 200,30);

		IDsearch.setBounds(257, 78, 200, 40);
		IDsearch.setForeground(Color.black);
		IDsearch.setFont(new Font("����",Font.BOLD,36));
		ID.setBounds(257, 128, 200, 40);
		ID.setForeground(Color.black);
		ID.setFont(new Font("����",Font.BOLD,28));
		IDInput.setBounds(361, 130, 532, 40);
		IDInput.setFont(new Font("����",Font.BOLD,20));
		
		
		this.add(IDsearch);
		this.add(ID);
		this.add(IDInput);
		this.add(search);
		this.add(modify);
		this.add(save);
		this.add(ts);
		this.add(tadmin);
		this.add(admin);
		this.add(manage);
		this.add(bs);
		this.add(courier);
		this.add(finance);
		this.add(exfinance);
		
	}
}
