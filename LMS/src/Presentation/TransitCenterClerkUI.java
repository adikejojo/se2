package Presentation;
import java.awt.Choice;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TransitCenterClerkUI extends GeneralUI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	TransitCenterClerkUI() {

		init();
	}

	GeneralPanel AcceptReceiptPanel = new GeneralPanel();
	GeneralPanel ShipmentPanel = new GeneralPanel();

	MyColor color = new MyColor();

	ItemLine originPlace = new ItemLine(50,"dd");

	// 中转接收
	WordLabel acceptReceipt = new WordLabel("接收单:", 30, 5, 100, 20);
	WordLabel acceptReceiptNum = new WordLabel("中转单或装车单编号：", 200, 315, 200, 20);
	MyTextField acceptReceiptNumText;
	// 装运管理
	WordLabel transportType = new WordLabel("选择运输方式", 40, 10, 130, 20);
	Choice choosetransportType;
	WordLabel stockoutList = new WordLabel("出库单列表", 550, 10, 120, 20);

	private void init() {
		this.add(AcceptReceiptPanel);
		this.add(ShipmentPanel);
		changeState("中转中心业务员", "中转接收");
		ShipmentPanel.setVisible(false);

		background();
		inputField();
		wordsLabel();
		ShipmentButton();
		AcceptReceiptButton();
		this.leftLabel();
		System.out.println("done");
	}

	void wordsLabel() {
		// 中转接收
		AcceptReceiptPanel.add(acceptReceipt);
		AcceptReceiptPanel.add(acceptReceiptNum);
		// 装运管理
		ShipmentPanel.add(transportType);
		ShipmentPanel.add(stockoutList);
	}

	void inputField() {
		// 中转接收
		acceptReceiptNumText = new MyTextField(410, 312, 240, 30);
		AcceptReceiptPanel.add(acceptReceiptNumText);
		// 装运管理
		choosetransportType = new Choice();
		choosetransportType.setBounds(170, 10, 100, 30);
		choosetransportType.setBackground(color.LightGray());
		choosetransportType.add("擎天柱");
		choosetransportType.add("红蜘蛛");
		choosetransportType.add("铁胆火车侠");
		ShipmentPanel.add(choosetransportType);

	}

	// 中转接收背景
	BackLabel acceptReceiptback = new BackLabel(30, 40, 800, 250);
	BackLabel loadingReceiptback = new BackLabel(30, 350, 800, 160);
	// 装运管理背景
	BackLabel loadingTipsback = new BackLabel(40, 50, 200, 450);
	BackLabel loadingInfoback = new BackLabel(260, 50, 230, 450);
	BackLabel stockoutListback = new BackLabel(550, 50, 280, 450);

	void background() {
		// 中转接收
		AcceptReceiptPanel.add(acceptReceiptback);
		AcceptReceiptPanel.add(loadingReceiptback);
		// 装运管理
		ShipmentPanel.add(loadingTipsback);
		ShipmentPanel.add(loadingInfoback);
		ShipmentPanel.add(stockoutListback);
	}

	// 中转接收界面按钮设置
	void fullAcceptReceiptButton() {

		SimpleButton fullAcceptReceiptButton = new SimpleButton("查看完整接收单",
				30, 310, 160, 35);
		AcceptReceiptPanel.add(fullAcceptReceiptButton);
	}

	void confirmInButton() {

		SimpleButton confirmButton = new SimpleButton("确认录入", 660, 310,
				170, 30);
		AcceptReceiptPanel.add(confirmButton);
	}

	void confirmButton() {

		SimpleButton confirmButton = new SimpleButton("确认",	30, 520, 800, 30);
		AcceptReceiptPanel.add(confirmButton);
	}

	void checkFulltransitReceitButton() {

		SimpleButton checkFulltransitReceitButton = new SimpleButton("查看完整中转单",30, 560, 800, 30);
		AcceptReceiptPanel.add(checkFulltransitReceitButton);
	}

	// 装运管理界面按钮设置
	void confirm2Button() {

		SimpleButton confirm2Button = new SimpleButton(
				"确认",
				40, 520, 790, 35);
		ShipmentPanel.add(confirm2Button);
	}

	void cancelButton() {

		SimpleButton cancelButton = new SimpleButton(
				"取消",
				40, 565, 790, 35);
		ShipmentPanel.add(cancelButton);
	}

	void AcceptReceiptButton() {
		fullAcceptReceiptButton();
		confirmInButton();
		confirmButton();
		checkFulltransitReceitButton();
		Button AcceptReceiptButton = new Button(250, "src/picture/TR.png",
				"src/picture/TRHL.png");
		this.getContentPane().add(AcceptReceiptButton);
		AcceptReceiptButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click("AcceptReceipt");
				changeState("中转中心业务员", "中转接收");
				changeSymbol("src/picture/TRIcon.png");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});
	}

	void ShipmentButton() {
		confirm2Button();
		cancelButton();
		Button ShipmentButton = new Button(300, "src/picture/SM.png",
				"src/picture/SMHL.png");
		this.getContentPane().add(ShipmentButton);
		ShipmentButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click("Shipment");
				changeState("中转中心业务员", "装运管理");
				changeSymbol("src/picture/trainIcon.png");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});
	}

	protected void click(String string) {
		// TODO Auto-generated method stub
		AcceptReceiptPanel.setVisible(false);
		ShipmentPanel.setVisible(false);
		switch (string) {
		case "AcceptReceipt":
			AcceptReceiptPanel.setVisible(true);
			break;
		case "Shipment":
			ShipmentPanel.setVisible(true);
			break;
		/*
		 * case "TrainShipment": TrainShipmentPanel.setVisible(true); break;
		 * case "PlaneShipment": PlaneShipmentPanel.setVisible(true); break;
		 */
		default:
			System.out.println("choice error");
		}
	}

}
