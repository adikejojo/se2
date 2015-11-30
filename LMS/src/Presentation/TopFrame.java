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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TopFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panelTop=new JPanel();

	public TopFrame(){
		MyColor bg=new MyColor();
		Dimension scrSize=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLayout(null);
		this.setTitle("LMS物流管理系统");
		this.setBounds((scrSize.width-980)/2, (scrSize.height-480)/2, 980, 480);//(x,y,width,height)
		this.setUndecorated(true);
		JLabel titleTop = new JLabel("LMS");
		JLabel titleTop2 = new JLabel("物流管理系统");
		JLabel titleAuthor = new JLabel("by:6666组");
		
		titleTop.setForeground(Color.white);
		titleTop.setFont(new Font("宋体",Font.BOLD,56));
		titleTop.setBounds(320, 0, 980, 120);
		titleTop2.setForeground(Color.white);
		titleTop2.setFont(new Font("宋体",Font.BOLD,36));
		titleTop2.setBounds(410, 5, 980, 120);
		titleAuthor.setForeground(Color.white);
		titleAuthor.setFont(new Font("宋体",Font.BOLD,24));
		titleAuthor.setBounds(800, 50, 980, 120);
		
		panelTop.setLayout(null);
		panelTop.setBounds(0, 0, 980, 130);
		panelTop.setBackground(bg.LightGray());
		panelTop.add(titleTop);
		panelTop.add(titleTop2);
		panelTop.add(titleAuthor);
		
		this.add(panelTop);
		minimizeButton();
		closeButton();
		
	}
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(new Color(192,192,192));
		g.drawLine(490, 170, 490, 415);
//		Image image=new ImageIcon("src/picture/DMIcon.png").getImage();
//		g.drawImage(image, 517,197,this);
		
	}
	
	
	void minimizeButton() {
		// minimize button
		JLabel minBtn = new JLabel();
		minBtn.setBounds(910, 0, 50, 35);
		Icon miniIcon = new ImageSetter("src/picture/MiniIcon.png", 25, 25).getNewIcon();
		Icon miniHL = new ImageSetter("src/picture/MiniIconHL.png",25,25).getNewIcon();
		Icon miniPressed = new ImageSetter("src/picture/MiniIconPressed.png",25,25).getNewIcon();
		panelTop.add(minBtn);
		minBtn.setIcon(miniIcon);
		minBtn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				minBtn.setIcon(miniIcon);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				minBtn.setIcon(miniPressed);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				minBtn.setIcon(miniIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				minBtn.setIcon(miniHL);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				minBtn.setIcon(miniIcon);
				setExtendedState(JFrame.ICONIFIED);
			}
		});
	}
	
	void closeButton(){
		//close button
		JLabel closeBtn = new JLabel();
		closeBtn.setBounds(945, 0, 50, 35);
		Icon closeBtnIcon = new ImageSetter("src/picture/closeBtnIcon.png", 25, 25).getNewIcon();
		Icon closeBtnIconHL = new ImageSetter("src/picture/closeBtnIconHL.png",25,25).getNewIcon();
		Icon closeBtnIconPressed = new ImageSetter("src/picture/closeBtnIconPressed.png",25,25).getNewIcon();
		closeBtn.setIcon(closeBtnIcon);
		panelTop.add(closeBtn);
		closeBtn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				closeBtn.setIcon(closeBtnIcon);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				closeBtn.setIcon(closeBtnIconPressed);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				closeBtn.setIcon(closeBtnIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				closeBtn.setIcon(closeBtnIconHL);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(1);
			}
		});
	}
}
