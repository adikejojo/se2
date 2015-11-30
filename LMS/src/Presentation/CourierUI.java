package Presentation;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class CourierUI extends GeneralUI{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CourierUI(){
//		this.add(SearchPanel);
//		SearchPanel.setLayout(null);
//		SearchPanel.setBounds(200, 50, 900, 650);
//		SearchPanel.setVisible(true);
		init();
	}
	MyTextField inputID;
	MyTextField SaddressText;
	Choice ProvenceType;
	Choice CityType;
	MyTextField SnameText;
	MyTextField SPhoneText;
	
	MyTextField RaddressText;
	Choice RProvenceType;
	Choice RCityType;
	MyTextField RnameText;
	MyTextField RPhoneText;
	
	GeneralPanel SearchPanel = new GeneralPanel();
	GeneralPanel SendReceiptPanel = new GeneralPanel();
	GeneralPanel AcceptReceiptPanel = new GeneralPanel();
	MyColor color = new MyColor();
	
	    ItemLine originPlace = new ItemLine(150,"          始发地");
	    ItemLine destination = new ItemLine(195,"          目的地");
	   ItemLine currentPlace = new ItemLine(240,"      目前所在地");
	 ItemLine whetherSendOut = new ItemLine(285,"        是否发货");
	ItemLine whetherReceived = new ItemLine(330,"      是否被签收");
	ItemLine historicalRoute = new ItemLine(375,"        历史轨迹");
	
	WordLabel expressID = new WordLabel("快递编号:", 30, 33, 190, 40);
	WordLabel SenderInfoInput = new WordLabel("寄件人信息", 30, 10, 150, 20);
	WordLabel ReceiverInfoInput = new WordLabel("收件人信息",30,200,150,20);
	WordLabel CargoInfoInput = new WordLabel("货物信息",30,390,150,20);
	WordLabel SnameLabel = new WordLabel("姓名", 10, 20, 70, 25);
	WordLabel Saddress = new WordLabel("地址", 10, 60, 60, 25);
	WordLabel SPhone = new WordLabel("电话号码", 10, 100, 120, 25);
	WordLabel Provence = new WordLabel("省", 170, 60, 30, 25);
	WordLabel City = new WordLabel("市", 300, 60, 30, 25);
	//
	WordLabel RnameLabel = new WordLabel("姓名", 10, 20, 70, 25);
	WordLabel Raddress = new WordLabel("地址", 10, 60, 60, 25);
	WordLabel RPhone = new WordLabel("电话号码", 10, 100, 120, 25);

	
	void init(){
		
		this.add(SearchPanel);
		this.add(SendReceiptPanel);
		this.add(AcceptReceiptPanel);
		changeState("      快递员", "   物流信息查询");
		SendReceiptPanel.setVisible(false);
		AcceptReceiptPanel.setVisible(false);
		
//		Line();

		initImportListTable();
		SearchInfoItems();
		BackGround();
		wordsLabel();
		inputField();
//		SearchConfirmButton();
		SearchButton();
		SendReceiptButton();
		AcceptReceiptButton();
		this.leftLabel();
		System.out.println("done");
	}
	
	void SearchButton(){
		Button SearchBtn = new Button(250,"src/picture/exprInfoCheck.png","src/picture/exprInfoCheckHL.png");
		this.getContentPane().add(SearchBtn);
		SearchBtn.addMouseListener(new MouseListener() {
			
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
				click("Search");
				changeState("      快递员", "   物流信息查询");
				changeSymbol("src/picture/exprInfoChecksymbol.png");
			}
		});
		
	}
	void SendReceiptButton(){
		Button SendReceiptBtn = new Button(300,"src/picture/send.png","src/picture/sendHL.png");
		this.getContentPane().add(SendReceiptBtn);
		SendReceiptBtn.addMouseListener(new MouseListener() {
			
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
				click("Send");
				changeState("      快递员", "    寄件单输入");
				changeSymbol("src/picture/checksymbol.png");
			}
		});
		
	}
	void AcceptReceiptButton(){
		Button RecieveReceiptBtn = new Button(350,"src/picture/receive.png","src/picture/receiveHL.png");
		this.getContentPane().add(RecieveReceiptBtn);
		RecieveReceiptBtn.addMouseListener(new MouseListener() {
			
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
				click("Accept");
				changeState("      快递员", "    收件单输入");
				changeSymbol("src/picture/stockinsymbol.png");
			}
		});
	}
	
	void inputField(){

		//Search panel
		inputID = new MyTextField(250, 30, 600, 50);
		SearchPanel.add(inputID);
		//SendReceipt Panel
		ProvenceType = new Choice();
		ProvenceType.setBounds(80, 60, 90, 50);
		ProvenceType.setBackground(color.LightGray());
		ProvenceType.add("江苏");
		ProvenceType.add("云南");
		ProvenceType.add("湖南");
		CityType = new Choice();
		CityType.setBounds(200, 60, 100, 50);
		CityType.setBackground(color.LightGray());
		CityType.add("南京");
		CityType.add("一个人的北京");
		SnameText = new MyTextField(80, 20, 150, 30);
		SnameText.setBackground(color.LightGray());
		SPhoneText = new MyTextField(120, 100, 200, 30);
		SPhoneText.setBackground(color.LightGray());
		SaddressText = new MyTextField(330, 60, 200, 30);
		SaddressText.setBackground(color.LightGray());
		//
		RProvenceType = new Choice();
		RProvenceType.setBounds(80, 60, 90, 50);
		RProvenceType.setBackground(color.LightGray());
		RProvenceType.add("江苏");
		RProvenceType.add("云南");
		RProvenceType.add("湖南");
		RCityType = new Choice();
		RCityType.setBounds(200, 60, 100, 50);
		RCityType.setBackground(color.LightGray());
		RCityType.add("南京");
		RCityType.add("一个人的北京");
		RnameText = new MyTextField(80, 20, 150, 30);
		RnameText.setBackground(color.LightGray());
		RPhoneText = new MyTextField(120, 100, 200, 30);
		RPhoneText.setBackground(color.LightGray());
		RaddressText = new MyTextField(330, 60, 200, 30);
		RaddressText.setBackground(color.LightGray());
		Senderback.add(CityType);
		Senderback.add(ProvenceType);
		Senderback.add(SaddressText);
		Senderback.add(SPhoneText);
		Senderback.add(SnameText);
		Receiverback.add(RCityType);
		Receiverback.add(RProvenceType);
		Receiverback.add(RaddressText);
		Receiverback.add(RPhoneText);
		Receiverback.add(RnameText);
	}
	void SearchInfoItems(){
		SearchPanel.add(originPlace);
		originPlace.setText("---------some words--------");
		SearchPanel.add(destination);
		SearchPanel.add(currentPlace);
		SearchPanel.add(whetherReceived);
		SearchPanel.add(whetherSendOut);
		SearchPanel.add(historicalRoute);
		
	}
	void SearchConfirmButton(){
		JLabel searchConfirmBtn = new JLabel();
		searchConfirmBtn.setOpaque(true);
		searchConfirmBtn.setBackground(Color.gray);
		searchConfirmBtn.setBounds(800, 60, 50, 50);
//		searchConfirmBtn.setBounds(0, 0, 50, 50);
		SearchPanel.add(searchConfirmBtn);
		
		//未完成
	}
	void wordsLabel(){

		SearchPanel.add(expressID);

		
		SendReceiptPanel.add(SenderInfoInput);
		SendReceiptPanel.add(ReceiverInfoInput);
		SendReceiptPanel.add(CargoInfoInput);
		Senderback.add(SnameLabel);
		Senderback.add(Saddress);
		Senderback.add(Provence);
		Senderback.add(City);
		Senderback.add(SPhone);
		Receiverback.add(RnameLabel);
		Receiverback.add(Raddress);
		Receiverback.add(RPhone);
	}

	BackLabel Senderback = new BackLabel(30, 40, 820, 150);
	BackLabel Receiverback = new BackLabel(30, 230, 820, 150);
	BackLabel CargoBack = new BackLabel(30, 420, 820, 150);
	void BackGround(){
		
		SendReceiptPanel.add(Senderback);
		SendReceiptPanel.add(Receiverback);
		SendReceiptPanel.add(CargoBack);
	}


	void click(String str){
		SearchPanel.setVisible(false);
		SendReceiptPanel.setVisible(false);
		AcceptReceiptPanel.setVisible(false);
		switch(str){
		case"Search":
			SearchPanel.setVisible(true);
			break;
		case"Send":
			SendReceiptPanel.setVisible(true);
			break;
		case"Accept":
			AcceptReceiptPanel.setVisible(true);
			break;
			default:System.out.println("choice error");
		}
		
	}
	private void initImportListTable(){
		JScrollPane scrollPane = new JScrollPane();
		
		//表头
		Vector<String> vColumns = new Vector<String>();
		vColumns.add("收件编号");
		vColumns.add("收件时间");
		vColumns.add("收件人");
		//数据
		Vector<String> vData = new Vector<String>();
		//模型
		importListModel = new DefaultTableModel(vData, vColumns);
		//表格
		importListTable = new JTable(importListModel){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		importListTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.getViewport().add(importListTable);
		importListTable.setFillsViewportHeight(true);
		importListTable.setBackground(color.MainFrameColor());
		importListTable.setFont(new Font("微软雅黑",Font.BOLD,10));
		importListTable.getTableHeader().setFont(new Font("微软雅黑",Font.BOLD,15));
		scrollPane.setBounds(50, 400, 800, 230);
		
		AcceptReceiptPanel.add(scrollPane);
		
	}
	private DefaultTableModel importListModel;
	private JTable importListTable;
}
