package Presentation;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GeneralUI extends JFrame{
	protected static boolean Draging;
	protected static int x;
	protected static int y;

	public GeneralUI() {
		// TODO Auto-generated constructor stub
		initFrame();

	}
//	public GeneralUI(UserUI userUI) {
//		// TODO Auto-generated constructor stub
//		user = userUI;
//		initFrame();
//	}
	void initFrame(){
		this.setLayout(null);
		this.setTitle("LMS物流管理系统");
		this.setBounds(120, 15, 1100, 700);//(x,y,width,height)
		this.setUndecorated(true);
		JLabel title = new JLabel("LMS物流管理系统");
		title.setForeground(Color.white);
		title.setFont(new Font("微软雅黑",Font.PLAIN,17));
		title.setBounds(210, 0, 850, 40);
		this.getContentPane().add(title);
//		leftLabel();
		symbol();
		State();
		minimizeButton();
		closeButton();
		topLabel();
		logoutButton();
		settingButton();
	}


		WordLabel leftTitle = new WordLabel("State", 0, 190, 200, 25);
		WordLabel identity = new WordLabel("Identity",0,220,200,17);
//		UserUI uerUI = new UserUI();  invalid!
	void State(){
		leftTitle.setForeground(Color.white);
		identity.setForeground(Color.white);
		leftTitle.setFont(new Font("微软雅黑",Font.PLAIN,25));
		identity.setFont(new Font("微软雅黑",Font.PLAIN,17));
		this.getContentPane().add(identity);
		this.getContentPane().add(leftTitle);
	}
	void changeState(String Identity,String state){
		leftTitle.setText(state);
		identity.setText(Identity);
	}
		
		JLabel symbol = new JLabel();
	void symbol(){
		symbol.setBounds(20, 20, 160, 160);
		Icon symbolIcon = new ImageIcon("src/picture/check.jpg");
		symbol.setIcon(symbolIcon);
		symbol.setBackground(Color.white);
		symbol.setOpaque(true);
		this.getContentPane().add(symbol);
	}
	void changeSymbol(String address){
		Icon newIcon = new ImageSetter(address,160,160).getNewIcon();
		symbol.setIcon(newIcon);
	}
	void leftLabel(){
		System.out.println("do");
		JLabel leftLabel = new JLabel();
//		leftPanel.setLocation(0, 0);
		leftLabel.setBounds(0, 0, 200, this.getHeight());
		Icon leftPanelIcon = new ImageIcon("src/picture/left.png");
		leftLabel.setIcon(leftPanelIcon);
		leftLabel.setOpaque(true);
//		leftLabel.setBackground(Color.BLACK);
		
		this.getContentPane().add(leftLabel);
	}	
	void closeButton(){
		//close button
		JLabel closeBtn = new JLabel();
		closeBtn.setBounds(1065, 0, 35, 35);
		Icon closeBtnIcon = new ImageSetter("src/picture/closeBtnIcon.png", 25, 25).getNewIcon();
		Icon closeBtnIconHL = new ImageSetter("src/picture/closeBtnIconHL.png",25,25).getNewIcon();
		Icon closeBtnIconPressed = new ImageSetter("src/picture/closeBtnIconPressed.png",25,25).getNewIcon();
		closeBtn.setIcon(closeBtnIcon);
		this.getContentPane().add(closeBtn);
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
	void topLabel(){
		JLabel topLabel = new JLabel();
		topLabel.setBounds(200, 0, 900, 35);
		Icon topPanelIcon = new ImageIcon("src/picture/top.png");
		topLabel.setIcon(topPanelIcon);
		topLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				Draging = false;
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				Draging = true;
				x = e.getX();
				y = e.getY();
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
				
			}
		});
		topLabel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				if(Draging = true){
					int left = getLocation().x;
					int top = getLocation().y;
					setLocation(left+e.getX()-x, top+e.getY()-y);
				}
			}
		});
		this.getContentPane().add(topLabel);
	}
	
	void settingButton(){
		JLabel settingBtn = new JLabel();
		settingBtn.setBounds(10, 650, 80, 36);
		Icon settingIcon = new ImageSetter("src/picture/setting.png", 80, 36).getNewIcon();
		Icon settingEnterIcon = new ImageSetter("src/picture/settingHL.png", 80, 36).getNewIcon();
		settingBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		settingBtn.setIcon(settingIcon);
		settingBtn.addMouseListener(new MouseListener() {
			
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
				settingBtn.setIcon(settingIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				settingBtn.setIcon(settingEnterIcon);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.getContentPane().add(settingBtn);
		
	}	
	void logoutButton(){
		JLabel logoutBtn = new JLabel();
		logoutBtn.setBounds(107, 650, 80, 36);
		Icon logoutIcon = new ImageSetter("src/picture/logout.png", 80, 36).getNewIcon();
		Icon logoutEnterIcon = new ImageSetter("src/picture/logoutHL.png", 80, 36).getNewIcon();
		logoutBtn.setIcon(logoutIcon);
		logoutBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoutBtn.addMouseListener(new MouseListener() {
			
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
				logoutBtn.setIcon(logoutIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				logoutBtn.setIcon(logoutEnterIcon);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		this.getContentPane().add(logoutBtn);
		
	}
	void minimizeButton(){
		JLabel mini = new JLabel();
		Icon miniIcon = new ImageSetter("src/picture/MiniIcon.png", 25, 25).getNewIcon();
		Icon miniHL = new ImageSetter("src/picture/MiniIconHL.png",25,25).getNewIcon();
		Icon miniPressed = new ImageSetter("src/picture/MiniIconPressed.png",25,25).getNewIcon();
		this.getContentPane().add(mini);
		mini.setIcon(miniIcon);
		mini.setBounds(1030, 0, 35, 35);
		mini.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				mini.setIcon(miniIcon);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				mini.setIcon(miniPressed);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				mini.setIcon(miniIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				mini.setIcon(miniHL);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				mini.setIcon(miniIcon);
				setExtendedState(JFrame.ICONIFIED);
			}
		});
	}
	

}
