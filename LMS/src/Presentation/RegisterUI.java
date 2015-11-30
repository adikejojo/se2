package Presentation;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;



public class RegisterUI extends TopFrame{
	
	private static final long serialVersionUID = 1L;

	public RegisterUI(){
		JLabel content =new JLabel("ע�᣺");
		JLabel name =new JLabel("������");
		JLabel password =new JLabel("���룺");
		JLabel verify =new JLabel("ȷ�����룺");
		JLabel work =new JLabel("����������");
		JLabel rule =new JLabel("�����Ȩ�ޣ�");
		MyTextField nameInput=new MyTextField(200, 225, 270, 40);
		MyTextField passwordInput=new MyTextField(200, 275, 270, 40);
		MyTextField passwordVerify=new MyTextField(200, 325, 270, 40);
		MyTextField workInput=new MyTextField(200, 375, 270, 40);

		content.setForeground(Color.black);
		content.setFont(new Font("����",Font.BOLD,36));
		content.setBounds(30, 160, 130, 48);
		name.setForeground(Color.black);
		name.setFont(new Font("����",Font.BOLD,30));
		name.setBounds(55, 225, 200, 40);
		password.setForeground(Color.black);
		password.setFont(new Font("����",Font.BOLD,30));
		password.setBounds(55, 275, 200, 40);
		verify.setForeground(Color.black);
		verify.setFont(new Font("����",Font.BOLD,30));
		verify.setBounds(55, 325, 200, 40);
		work.setForeground(Color.black);
		work.setFont(new Font("����",Font.BOLD,30));
		work.setBounds(55, 375, 200, 40);
		rule.setForeground(Color.black);
		rule.setFont(new Font("����",Font.BOLD,36));
		rule.setBounds(500, 160, 250, 48);
		
		SimpleButton courier=new SimpleButton("���Ա",525, 225, 200,40);
		SimpleButton bs=new SimpleButton("Ӫҵ��ҵ��Ա",765, 225, 200,40);
		SimpleButton ts=new SimpleButton("��ת����ҵ��Ա",525, 275, 200,40);
		SimpleButton tadmin=new SimpleButton("��ת���Ŀ�����Ա",765, 275, 200,40);
		SimpleButton finance=new SimpleButton("������Ա",525, 325, 200,40);
		SimpleButton exfinance=new SimpleButton("�߼�������Ա",765, 325, 200,40);
		SimpleButton manage=new SimpleButton("�ܾ���",525, 375, 200,40);
		SimpleButton admin=new SimpleButton("����Ա",765, 375, 200,40);
		SimpleButton submit=new SimpleButton("�ύ",55, 425, 915,40);

		this.add(content);
		this.add(name);
		this.add(password);
		this.add(verify);
		this.add(work);
		this.add(rule);
		this.add(admin);
		this.add(manage);
		this.add(exfinance);
		this.add(finance);
		this.add(tadmin);
		this.add(ts);
		this.add(bs);
		this.add(courier);
		this.add(nameInput);
		this.add(workInput);
		this.add(passwordInput);
		this.add(passwordVerify);
		this.add(submit);
		
	}
}
