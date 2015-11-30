package Presentation;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeeperUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -849945444501482139L;
	KeeperUI(){
		init();

		
	}
	//初始化
	void init(){
		this.setLayout(null);
		this.setTitle("物流管理系统");
		this.setBounds(120, 15, 1100, 700);//(x,y,width,height)
//		this.setResizable(false);
		this.setUndecorated(true);
		character_label();
		importButton();
		exportButton();
		lookupButton();
		checkButton();
		settingButton();
		logoutButton();
		picture();
		leftLabel();
		topLabel();
		closeButton();
		inputField();

		
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
		JButton closeBtn = new JButton();
		closeBtn.setBounds(1050, 0, 50, 50);
		Icon closeBtnIcon = new ImageIcon("src/picture/closeBtnIcon.png");
		closeBtn.setIcon(closeBtnIcon);
		closeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);				
			}
		});
	
		this.getContentPane().add(closeBtn);
	}
	
	void importButton(){
		//import button
		JLabel importBtn = new JLabel();
		JLabel arrayLabel = new JLabel();
		arrayLabel.setBounds(190, 400, 36, 50);
		arrayLabel.setVisible(false);
		importBtn.setBounds(0, 400, 200, 50);
		Icon importIcon = new ImageIcon("src/picture/importBtn.png");
		Icon array = new ImageIcon("src/picture/array.png");
		arrayLabel.setIcon(array);
		Icon importEnterIcon = new ImageIcon("src/picture/importBtnHL.png");
		importBtn.setIcon(importIcon);
		
		importBtn.addMouseListener(new MouseListener() {
			
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
				importBtn.setIcon(importIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				importBtn.setIcon(importEnterIcon);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				arrayLabel.setVisible(true);
			}
		});
		this.getContentPane().add(importBtn);
		this.getContentPane().add(arrayLabel);
		
		}
	void exportButton(){
		//出库按钮
		JLabel exportBtn = new JLabel();
		exportBtn.setBounds(0, 450, 200, 50);
		Icon exportIcon = new ImageIcon("src/picture/exportBtn.png");
		Icon exportEnterIcon = new ImageIcon("src/picture/exportBtnHL.png");
		exportBtn.setIcon(exportIcon);
		exportBtn.addMouseListener(new MouseListener() {
			
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
				exportBtn.setIcon(exportIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				exportBtn.setIcon(exportEnterIcon);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.getContentPane().add(exportBtn);
	}
	void checkButton(){
		//盘点按钮
		JLabel checkBtn = new JLabel();
		checkBtn.setBounds(0, 550, 200, 50);

		Icon checkIcon = new ImageIcon("src/picture/check.png");
		Icon checkEnterIcon = new ImageIcon("src/picture/checkHL.png");
		checkBtn.setIcon(checkIcon);
		checkBtn.addMouseListener(new MouseListener() {
			
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
				checkBtn.setIcon(checkIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				checkBtn.setIcon(checkEnterIcon);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.getContentPane().add(checkBtn);
	}
	void lookupButton(){
		//查看按钮
		JLabel lookupBtn = new JLabel();
		lookupBtn.setBounds(0, 500, 200, 50);

		Icon lookupIcon = new ImageIcon("src/picture/lookup.png");
		Icon lookupEnterIcon = new ImageIcon("src/picture/lookupHL.png");
		lookupBtn.setIcon(lookupIcon);
		lookupBtn.addMouseListener(new MouseListener() {
			
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
				lookupBtn.setIcon(lookupIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				lookupBtn.setIcon(lookupEnterIcon);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		this.getContentPane().add(lookupBtn);
	}
	
	void topLabel(){
		JLabel topLabel = new JLabel();
		topLabel.setBounds(200, 0, 850, 50);
		Icon topPanelIcon = new ImageIcon("src/picture/top.png");
		topLabel.setIcon(topPanelIcon);
		topLabel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				setLocation(200, 200);
			}
		});
		this.getContentPane().add(topLabel);
	}
	
	void character_label(){
		//title
		JLabel title = new JLabel("物流管理系统");
		title.setFont(new Font("宋体",Font.BOLD,25));
		title.setBounds(200, 0, 850, 50);
		this.getContentPane().add(title);
		//expressID
		JLabel expressID = new JLabel("快递编号");
		expressID.setBounds(250, 70, 850, 40);
		expressID.setFont(new Font("宋体",Font.BOLD,40));
		this.getContentPane().add(expressID);
		
	}
	
	void picture(){
		JLabel pictureLabel = new JLabel();
		pictureLabel.setBounds(10, 10, 180, 180);
		Icon importPicture = new ImageIcon("src/picture/stockin.jpg");//stockin的格式和大小需要调整
		pictureLabel.setIcon(importPicture);
		this.getContentPane().add(pictureLabel);
	}
	
	void settingButton(){
		JLabel settingBtn = new JLabel();
		settingBtn.setBounds(0, 600, 100, 50);
		Icon settingIcon = new ImageIcon("src/picture/setting.png");
		Icon settingEnterIcon = new ImageIcon("src/picture/settingHL.png");
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
		logoutBtn.setBounds(100, 600, 100, 50);
		Icon logoutIcon = new ImageIcon("src/picture/logout.png");
		Icon logoutEnterIcon = new ImageIcon("src/picture/logoutHL.png");
		logoutBtn.setIcon(logoutIcon);
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
				
			}
		});
		this.getContentPane().add(logoutBtn);
		
	}
	
	void inputField(){
		TextField input = new TextField();
		input.setBounds(250, 120, 800, 80);
		input.setFont(new Font("宋体", Font.BOLD, 80));
		input.setBackground(Color.LIGHT_GRAY);
		this.getContentPane().add(input);
		
		
	}
	
	
}
