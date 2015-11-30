package Presentation;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserUI extends TopFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	BussinessUI bu = new BussinessUI();
	boolean idEdit = false;
	boolean passwordEdit = false;
	MyTextField ID=new MyTextField(677, 198, 260, 60);
	MyTextField password=new MyTextField(677, 259, 260, 60);
//	UserVO user;
//	BussinessUI buUI;
	public UserUI(){
		JLabel titleSearch = new JLabel("¿ìµÝÐÅÏ¢²éÑ¯");
		JLabel titleNumber = new JLabel("¿ìµÝ±àºÅ:");
		MyTextField number=new MyTextField(160, 250, 270, 50);

		JButton search =new JButton("²éÑ¯");
		JButton register =new JButton("×¢²á");
		JButton login =new JButton("µÇÂ¼");
		
		titleSearch.setForeground(Color.black);
		titleSearch.setFont(new Font("ËÎÌå",Font.BOLD,30));
		titleSearch.setBounds(138, 198, 200, 30);
		titleNumber.setForeground(Color.black);
		titleNumber.setFont(new Font("ËÎÌå",Font.BOLD,25));
		titleNumber.setBounds(30, 260, 200, 30);

		ID.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,30));
		ID.setForeground(Color.white);
		ID.setText("ÓÃ»§Ãû");
		ID.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(!idEdit){
					ID.setText("");
					ID.setForeground(Color.black);
					ID.setBackground(Color.white);
					idEdit = true;
				}
			}
		});

		password.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,30));
		password.setText("ÃÜÂë");
		password.setForeground(Color.white);
		password.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(!passwordEdit){
					password.setText("");
					password.setBackground(Color.white);
					password.setForeground(Color.black);
					passwordEdit = true;
				}
			}
		});
		search.setBounds(127, 350, 208, 38);
		search.setBackground(new Color(165,194,174));
		search.setForeground(Color.white);
		search.setFont(new Font("ËÎÌå",Font.BOLD,25));
		register.setBounds(515, 350, 126, 38);
		register.setBackground(new Color(165,194,174));
		register.setForeground(Color.white);
		register.setFont(new Font("ËÎÌå",Font.BOLD,25));
		login.setBounds(676, 350, 262, 38);
		login.setBackground(new Color(174,165,194));
		login.setForeground(Color.white);
		login.setFont(new Font("ËÎÌå",Font.BOLD,25));
		login.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
//				user=new UserVO(ID.getText(),password.getText());
//				LoginBL lb=new LoginBL(user);
				
			}
		});
				
		this.add(titleSearch);
		this.add(titleNumber);
		this.add(number);
		this.add(search);
		this.add(register);
		this.add(login);
		this.add(ID);
		this.add(password);
//		this.getContentPane().add(panelTop);
		
//		panelTop.repaint();
		
	}


	

}
