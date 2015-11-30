package Presentation;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;

public class RepertoryUI extends GeneralUI {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	RepertoryUI() {
		init();
	}
	
	
	Choice expressType;
	Choice loadType;
	MyTextField IDInput;
	JSlider js;
	

	GeneralPanel StockinPanel = new GeneralPanel();
	GeneralPanel StockoutPanel = new GeneralPanel();
	GeneralPanel CheckPanel = new GeneralPanel();
	GeneralPanel InventoryPanel = new GeneralPanel();
	
//	ItemLine originPlace = new ItemLine(50);
	MyColor color = new MyColor();

	void init() {

		this.add(StockinPanel);
		this.add(StockoutPanel);
		this.add(CheckPanel);
		this.add(InventoryPanel);
		changeState("��������Ա", "���");
		changeSymbol("src/picture/stockinIcon.png");
		
		paintStockinUI();
		paintStockoutUI();
		paintCheckUI();
		paintInventoryUI();
		
		StockoutPanel.setVisible(false);
		CheckPanel.setVisible(false);
		InventoryPanel.setVisible(false);
		
		StockinButton();
		StockoutButton();
		CheckButton();
		InventoryButton();
		this.leftLabel();
//		System.out.println("done");
	}

	void StockinButton() {
		Button StockinBtn = new Button(250, "src/picture/stockinBtn.png",
				"src/picture/stockinBtnHL.png");
		this.getContentPane().add(StockinBtn);
		StockinBtn.addMouseListener(new MouseListener() {

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
				click("Stockin");
				changeState("��������Ա", "���");
				changeSymbol("src/picture/stockinIcon.png");
			}
		});

	}

	void StockoutButton() {
		Button StockoutBtn = new Button(300, "src/picture/stockoutBtn.png",
				"src/picture/stockoutBtnHL.png");
		this.getContentPane().add(StockoutBtn);
		StockoutBtn.addMouseListener(new MouseListener() {

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
				click("Stockout");
				changeState("��������Ա", "����");
				changeSymbol("src/picture/stockoutIcon.png");
			}
		});

	}

	void CheckButton() {
		Button CheckBtn = new Button(350, "src/picture/lookup.png",
				"src/picture/lookupHL.png");
		this.getContentPane().add(CheckBtn);
		CheckBtn.addMouseListener(new MouseListener() {

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
				click("Check");
				changeState("��������Ա", "�鿴");
				changeSymbol("src/picture/checkIcon.png");
			}
		});
	}

	void InventoryButton() {
		Button InventoryBtn = new Button(400, "src/picture/check.png",
				"src/picture/checkHL.png");
		this.getContentPane().add(InventoryBtn);
		InventoryBtn.addMouseListener(new MouseListener() {

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
				click("Inventory");
				changeState("��������Ա", "�̵�");
				changeSymbol("src/picture/inventoryIcon.png");
			}
		});
	}
	
	void paintStockinUI(){
		SimpleButton submit = new SimpleButton("ȷ����Ⲣ�ύ",25,117,839,30);
		SimpleButton check = new SimpleButton("��ѯ���ɴ��λ��",610,17,253,30);
		Vector<String> SI = new Vector<String>();
		Object[][] si = new Object[1][4];
		MyTextField search = new MyTextField(142, 17, 450, 30);
		SI.add("�������");
		SI.add("Ŀ�ĵ�");
		SI.add("�ļ�����");
		SI.add("λ��");
		MyTable items1 =new MyTable(25,57,840,49,SI);
		items1.setTitleColor(new Color(113,113,113));
		items1.setContentColor(new Color(174,174,174));
		WordLabel siExpressIDInput = new WordLabel("��ݱ��:", 0, 13, 150, 34);
//		siExpressIDInput.setOpaque(true);
//		siExpressIDInput.setBackground(Color.blue);
		siExpressIDInput.setForeground(Color.DARK_GRAY);
		siExpressIDInput.setFont(new Font("΢���ź�",Font.PLAIN,24));
		expressType = new Choice();
		expressType.setBounds(25, 82, 211, 31);
		expressType.setBackground(color.LightGray());
		expressType.add("��ͨ");
		expressType.add("����");
		expressType.add("�ؿ�");
		expressType.add("����");
		si[0][0] = expressType;
		
		Vector<String> showSI = new Vector<String>();
		showSI.add("��ݱ��");
		showSI.add("���ʱ��");
		showSI.add("Ŀ�ĵ�");
		showSI.add("λ��");
		MyTable items2 = new MyTable(25, 158, 840, 450, showSI);
		items2.add(new ScrollPane());
		items2.setTitleColor(new Color(113,113,113));
		items2.setContentColor(new Color(174,174,174));
		StockinPanel.add(expressType);
		StockinPanel.add(search);
		StockinPanel.add(siExpressIDInput);
		StockinPanel.add(submit);
		StockinPanel.add(check);
		StockinPanel.add(items1);
		StockinPanel.add(items2);

		
	}
	
	void paintStockoutUI(){
		WordLabel soExpress = new WordLabel("������Ŀ��:", 25, 7, 180, 34);
		SimpleButton selectAll = new SimpleButton("ȫѡ", 80, 276, 312, 30);
		SimpleButton cancel = new SimpleButton("ȫ��ȡ��", 495, 276, 312, 30);
		SimpleButton confirm = new SimpleButton("ȷ�Ͻ�ѡ����Ŀ����", 25, 319, 840, 30);
		soExpress.setForeground(Color.DARK_GRAY);
		soExpress.setFont(new Font("΢���ź�",Font.PLAIN,24));
		Vector<String> SO = new Vector<String>();
		SO.add("��ݱ��");
		SO.add("λ��");
		MyTable items1 = new MyTable(25,47,840,220,SO);
		items1.setTitleColor(new Color(113,113,113));
		items1.setContentColor(new Color(174,174,174));
		Vector<String> showSO = new Vector<String>();
		showSO.add("��������");
		showSO.add("Ŀ�ĵ�");
		showSO.add("װ����ʽ");
		showSO.add("��ת����");
		MyTable items2 = new MyTable(25,360,840,260,showSO);
		items2.setTitleColor(new Color(113,113,113));
		items2.setContentColor(new Color(174,174,174));
		StockoutPanel.add(soExpress);
		StockoutPanel.add(selectAll);
		StockoutPanel.add(confirm);
		StockoutPanel.add(cancel);
		StockoutPanel.add(items1);
		StockoutPanel.add(items2);
	}
	void paintCheckUI(){
		WordLabel cCheck = new WordLabel("���鿴",0, 5, 170, 34);
		cCheck.setForeground(Color.DARK_GRAY);
		cCheck.setFont(new Font("΢���ź�",Font.PLAIN,30));
		WordLabel cTime1 = new WordLabel("��ʼʱ�䣺", 25,46,120,27);
//		cTime1.setOpaque(true);
//		cTime1.setBackground(Color.blue);
		cTime1.setForeground(Color.DARK_GRAY);
		cTime1.setFont(new Font("΢���ź�",Font.PLAIN,24));
		WordLabel cTime2 = new WordLabel("��ֹʱ�䣺", 445,46,120,27);
		cTime2.setForeground(Color.DARK_GRAY);
		cTime2.setFont(new Font("΢���ź�",Font.PLAIN,24));
		MyTextField time1 = new MyTextField(140,46,260,30);
		MyTextField time2 = new MyTextField(565,46,260,30);
		Vector<String> showC = new Vector<String>();
		showC.add("ʱ��");
		showC.add("�洢λ��");
		showC.add("�������");
		showC.add("��������");
		showC.add("��������ϼ�");
		showC.add("���");
		MyTable items = new MyTable(25,86,840,400,showC);
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		CheckPanel.add(cCheck);
		CheckPanel.add(cTime1);
		CheckPanel.add(cTime2);
		CheckPanel.add(time1);
		CheckPanel.add(time2);
		CheckPanel.add(items);
	}
	void paintInventoryUI(){
		Vector<String> I = new Vector<String>();
		I.add("��ݱ��");
		I.add("ʱ��");
		I.add("�������");
		I.add("�������");
		I.add("Ŀ�ĵ�");
		I.add("λ��");
		MyTable items = new MyTable(25,50,840,400,I);
		items.setTitleColor(new Color(113,113,113));
		items.setContentColor(new Color(174,174,174));
		SimpleButton startInven = new SimpleButton("��ʼ�̵�",25,10,840,30);
		SimpleButton exportInven = new SimpleButton("������Excel",25,457,840,30);
		InventoryPanel.add(items);
		InventoryPanel.add(startInven);
		InventoryPanel.add(exportInven);
	}
	
	BackLabel Stockinback = new BackLabel(30, 40, 820, 150);
	BackLabel Stockoutback = new BackLabel(30, 230, 820, 150);
	BackLabel CheckBack = new BackLabel(30, 420, 820, 150);
	BackLabel InventoryBack = new BackLabel(30, 610, 820, 150);
	void BackGround(){
		StockinPanel.add(Stockinback);
		StockoutPanel.add(Stockoutback);
		CheckPanel.add(CheckBack);
		InventoryPanel.add(InventoryBack);
		
	}

	

	void click(String str) {
		StockinPanel.setVisible(false);
		StockoutPanel.setVisible(false);
		CheckPanel.setVisible(false);
		InventoryPanel.setVisible(false);

		switch (str) {
			case "Stockin":StockinPanel.setVisible(true);break;
			case "Stockout":StockoutPanel.setVisible(true);break;
			case "Check":CheckPanel.setVisible(true);break;
			case "Inventory":InventoryPanel.setVisible(true);break;
			default:System.out.println("choice error");
		}

	}
}
