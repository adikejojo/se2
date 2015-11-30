package Presentation;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class BussinessUI extends GeneralUI{
	public BussinessUI(){
		init();
	}
	
	GeneralPanel entruckingPanel = new GeneralPanel();
	GeneralPanel pickupPanel = new GeneralPanel();
	GeneralPanel distributePanel = new GeneralPanel();
	GeneralPanel collectionOrderPanel = new GeneralPanel();
	GeneralPanel carInfoPanel = new GeneralPanel();
	GeneralPanel driverInfoPanel = new GeneralPanel();
	
	void init(){
		this.changeSymbol("src/picture/loadIcon.png");
		this.changeState("营业厅业务员", "车辆装车管理");
		this.add(carInfoPanel);
		this.add(collectionOrderPanel);
		this.add(distributePanel);
		this.add(driverInfoPanel);
		this.add(entruckingPanel);
		this.add(pickupPanel);
		
		entruckingPaint();
		pickupPaint();
		distributePaint();
		collectionOrderPaint();
		carInfoPaint();
		driverInfoPaint();
		
		
		entruckingPanel.setVisible(true);
		carInfoPanel.setVisible(false);
		collectionOrderPanel.setVisible(false);
		distributePanel.setVisible(false);
		driverInfoPanel.setVisible(false);
		pickupPanel.setVisible(false);
		

		entruckingButton();
		pickupButton();
		distributeButton();
		collectionOrderButton();
		carInfoButton();
		driverInfoButton();
		
		this.leftLabel();
	}
	
	void entruckingPaint(){
		//选择之后的表单实际尚未实现
		JLabel title=new JLabel("尚未发货的货物订单");
		JLabel fee=new JLabel("运费:             元");
		JTextField count=new JTextField();
		SimpleButton submit=new SimpleButton("确认处理并提交",36,503,820,48);
		SimpleButton check=new SimpleButton("查看装车单",36,577,400,48);
		SimpleButton modify=new SimpleButton("修改装车单",456,577,400,48);
		
		
		Vector<String> content =new Vector<String>();
		content.add("快递编号");
		content.add("始发地");
		content.add("目的地");
		content.add("申请日期");
		MyTable items =new MyTable(36,59,777,237,content);
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		
		title.setBounds(36, 21, 222, 30);
		title.setForeground(Color.black);
		title.setFont(new Font("微软雅黑",Font.BOLD,24));
		fee.setBounds(666, 468, 200, 24);
		fee.setForeground(Color.black);
		fee.setFont(new Font("微软雅黑",Font.BOLD,20));
		count.setBounds(715, 468, 70, 25);
		count.setFont(new Font("微软雅黑",Font.BOLD,20));
		
		entruckingPanel.add(title);
		entruckingPanel.add(items);
		entruckingPanel.add(fee);
		entruckingPanel.add(count);
		entruckingPanel.add(submit);
		entruckingPanel.add(modify);
		entruckingPanel.add(check);
		
//		entruckingPanel.repaint();
	}
	
	void pickupPaint(){
		JLabel number =new JLabel("快递编号：");
		JTextField input=new JTextField();
		SimpleButton verify =new SimpleButton("确认接收",36,130,777,48);
		SimpleButton submit =new SimpleButton("提交接收单",36,600,777,48);
		Vector<String> item =new Vector<String>();
		Vector<String> content =new Vector<String>();
		
		item.add("出发地");
		item.add("中转单编号");
		item.add("到达状态");
		content.add("快递编号");
		content.add("到达日期");
		content.add("本营业厅编号");
		content.add("出发地");
		content.add("中转单编号");
		content.add("到达状态");
		
		MyTable items =new MyTable(36,59,777,60,item);
		MyTable contents =new MyTable(36,190,777,400,content);
		
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		contents.setTitleColor(new Color(113,113,113));
		contents.setContentColor(new Color(174,174,174));
		
		number.setBounds(36, 21, 120, 30);
		number.setForeground(Color.black);
		number.setFont(new Font("微软雅黑",Font.BOLD,24));
		input.setBounds(156, 21, 600, 30);
		input.setFont(new Font("微软雅黑",Font.BOLD,20));
		
		pickupPanel.add(number);
		pickupPanel.add(items);
		pickupPanel.add(input);
		pickupPanel.add(contents);
		pickupPanel.add(verify);
		pickupPanel.add(submit);
	}
	
	void distributePaint(){
		Vector<String> item =new Vector<String>();
		Vector<String> content =new Vector<String>();
		SimpleButton add =new SimpleButton("加入派件单",36,350,777,48);
		SimpleButton submit =new SimpleButton("提交派件单",36,600,777,48);
		
		item.add("到达日期");
		item.add("快递编号");
		item.add("目的地");
		item.add("是否选择派发");
		content.add("到达日期");
		content.add("快递编号");
		content.add("详细地址");
		content.add("选择快递员");
		
		MyTable items =new MyTable(36,19,777,320,item);
		MyTable contents =new MyTable(36,410,777,180,content);
		
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		contents.setTitleColor(new Color(113,113,113));
		contents.setContentColor(new Color(174,174,174));
		
		distributePanel.add(contents);
		distributePanel.add(items);
		distributePanel.add(add);
		distributePanel.add(submit);
	}
	
	void collectionOrderPaint(){
		Vector<String> item =new Vector<String>();
		Vector<String> content =new Vector<String>();
		SimpleButton more =new SimpleButton("确认接收",36,220,777,48);
		SimpleButton submit =new SimpleButton("提交接收单",36,590,777,48);
		
		item.add("快递员编号");
		item.add("快递员姓名");
		item.add("快递数目");
		item.add("快递总价");
		content.add("快递员");
		content.add("快递价格");
		content.add("快递类型");
		content.add("快递重量");
		content.add("快递体积");
		content.add("核对情况");
		content.add("总数");
		content.add("总价");
		
		MyTable items =new MyTable(36,10,777,200,item);
		MyTable contents =new MyTable(36,280,777,300,item);
		
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		contents.setTitleColor(new Color(113,113,113));
		contents.setContentColor(new Color(174,174,174));
		
		collectionOrderPanel.add(contents);
		collectionOrderPanel.add(items);
		collectionOrderPanel.add(more);
		collectionOrderPanel.add(submit);
	}
	
	void carInfoPaint(){
		JLabel number =new JLabel("车辆编号：");
		JTextField input=new JTextField();
		SimpleButton add =new SimpleButton("新增",36,450,200,48);
		SimpleButton modify =new SimpleButton("修改",320,450,200,48);
		SimpleButton delete =new SimpleButton("删除",612,450,200,48);
		SimpleButton verify =new SimpleButton("确认",36,590,777,48);
		Vector<String> item =new Vector<String>();
		Vector<String> content =new Vector<String>();
		
		item.add("车辆列表");
		content.add("车辆代号");
		content.add("发动机号");
		content.add("车牌号");
		content.add("底盘号");
		content.add("购买时间");
		content.add("服役时间");
		
		MyTable items =new MyTable(36,60,777,380,item);
		MyTable contents =new MyTable(36,510,777,70,content);
		
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		contents.setTitleColor(new Color(113,113,113));
		contents.setContentColor(new Color(174,174,174));
		
		number.setBounds(36, 21, 120, 30);
		number.setForeground(Color.black);
		number.setFont(new Font("微软雅黑",Font.BOLD,24));
		input.setBounds(156, 21, 655, 30);
		input.setFont(new Font("微软雅黑",Font.BOLD,20));
		
		carInfoPanel.add(number);
		carInfoPanel.add(items);
		carInfoPanel.add(input);
		carInfoPanel.add(contents);
		carInfoPanel.add(add);
		carInfoPanel.add(delete);
		carInfoPanel.add(modify);
		carInfoPanel.add(verify);
	}
	
	void driverInfoPaint(){
		JLabel number =new JLabel("司机编号：");
		JTextField input=new JTextField();
		SimpleButton add =new SimpleButton("新增",36,450,200,48);
		SimpleButton modify =new SimpleButton("修改",320,450,200,48);
		SimpleButton delete =new SimpleButton("删除",612,450,200,48);
		SimpleButton verify =new SimpleButton("确认",36,590,777,48);
		Vector<String> item =new Vector<String>();
		Vector<String> content =new Vector<String>();
		
		item.add("司机列表");
		content.add("司机代号");
		content.add("姓名");
		content.add("出生日期");
		content.add("身份证号");
		content.add("手机");
		content.add("车辆单位");
		content.add("性别");
		content.add("行驶证期限");
		
		MyTable items =new MyTable(36,60,777,380,item);
		MyTable contents =new MyTable(36,510,777,70,content);
		
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		contents.setTitleColor(new Color(113,113,113));
		contents.setContentColor(new Color(174,174,174));
		
		number.setBounds(36, 21, 120, 30);
		number.setForeground(Color.black);
		number.setFont(new Font("微软雅黑",Font.BOLD,24));
		input.setBounds(156, 21, 655, 30);
		input.setFont(new Font("微软雅黑",Font.BOLD,20));
		
		
		driverInfoPanel.add(number);
		driverInfoPanel.add(items);
		driverInfoPanel.add(input);
		driverInfoPanel.add(contents);
		driverInfoPanel.add(add);
		driverInfoPanel.add(delete);
		driverInfoPanel.add(modify);
		driverInfoPanel.add(verify);
	}
	
	void entruckingButton(){
		Button entruckingBtn = new Button(250,"src/picture/load.png","src/picture/loadHL.png");
		this.getContentPane().add(entruckingBtn);
		entruckingBtn.addMouseListener(new MouseListener() {
			
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
				click("entrucking");
				changeState("营业厅业务员", "车辆装车管理");
				changeSymbol("src/picture/loadIcon.png");
			}
		});
	}
	
	void pickupButton(){
		Button pickupBtn = new Button(300,"src/picture/arrive.png","src/picture/arriveHL.png");
		this.getContentPane().add(pickupBtn);
		pickupBtn.addMouseListener(new MouseListener() {
			
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
				click("pickup");
				changeState("营业厅业务员", "收件");
				changeSymbol("src/picture/arriveIcon.png");
			}
		});
	}
	
	void distributeButton(){
		Button distributeBtn = new Button(350,"src/picture/distribute.png","src/picture/distributeHL.png");
		this.getContentPane().add(distributeBtn);
		distributeBtn.addMouseListener(new MouseListener() {
			
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
				click("distribute");
				changeState("营业厅业务员", "派发");
				changeSymbol("src/picture/distributeIcon.png");
			}
		});
	}
	
	void collectionOrderButton(){
		Button collectionOrderBtn = new Button(400,"src/picture/receipt.png","src/picture/receiptHL.png");
		this.getContentPane().add(collectionOrderBtn);
		collectionOrderBtn.addMouseListener(new MouseListener() {
			
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
				click("collection");
				changeState("营业厅业务员", "收款单记录");
				changeSymbol("src/picture/receiptIcon.png");
			}
		});
	}
	
	void carInfoButton(){
		Button carInfoBtn = new Button(450,"src/picture/VM.png","src/picture/VMHL.png");
		this.getContentPane().add(carInfoBtn);
		carInfoBtn.addMouseListener(new MouseListener() {
			
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
				click("carInfo");
				changeState("营业厅业务员", "车辆信息管理");
				changeSymbol("src/picture/VMIcon.png");
			}
		});
	}
	
	void driverInfoButton(){
		Button driverInfoBtn = new Button(500,"src/picture/DM.png","src/picture/DMHL.png");
		this.getContentPane().add(driverInfoBtn);
		driverInfoBtn.addMouseListener(new MouseListener() {
			
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
				click("driverInfo");
				changeState("营业厅业务员", "司机信息管理");
				changeSymbol("src/picture/DMIcon.png");
			}
		});
	}
	
	
	void click(String str){
		entruckingPanel.setVisible(false);
		pickupPanel.setVisible(false);
		collectionOrderPanel.setVisible(false);
		distributePanel.setVisible(false);
		carInfoPanel.setVisible(false);
		driverInfoPanel.setVisible(false);
		switch(str){
		case"entrucking":
			entruckingPanel.setVisible(true);
			break;
		case"pickup":
			pickupPanel.setVisible(true);
			break;
		case"collection":
			collectionOrderPanel.setVisible(true);
			break;
		case"distribute":
			distributePanel.setVisible(true);
			break;
		case"carInfo":
			carInfoPanel.setVisible(true);
			break;
		case"driverInfo":
			driverInfoPanel.setVisible(true);
			break;
			default:System.out.println("choice error");
		}
		
	}
}
