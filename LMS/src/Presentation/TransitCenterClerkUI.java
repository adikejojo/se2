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

	// ��ת����
	WordLabel acceptReceipt = new WordLabel("���յ�:", 30, 5, 100, 20);
	WordLabel acceptReceiptNum = new WordLabel("��ת����װ������ţ�", 200, 315, 200, 20);
	MyTextField acceptReceiptNumText;
	// װ�˹���
	WordLabel transportType = new WordLabel("ѡ�����䷽ʽ", 40, 10, 130, 20);
	Choice choosetransportType;
	WordLabel stockoutList = new WordLabel("���ⵥ�б�", 550, 10, 120, 20);

	private void init() {
		this.add(AcceptReceiptPanel);
		this.add(ShipmentPanel);
		changeState("��ת����ҵ��Ա", "��ת����");
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
		// ��ת����
		AcceptReceiptPanel.add(acceptReceipt);
		AcceptReceiptPanel.add(acceptReceiptNum);
		// װ�˹���
		ShipmentPanel.add(transportType);
		ShipmentPanel.add(stockoutList);
	}

	void inputField() {
		// ��ת����
		acceptReceiptNumText = new MyTextField(410, 312, 240, 30);
		AcceptReceiptPanel.add(acceptReceiptNumText);
		// װ�˹���
		choosetransportType = new Choice();
		choosetransportType.setBounds(170, 10, 100, 30);
		choosetransportType.setBackground(color.LightGray());
		choosetransportType.add("������");
		choosetransportType.add("��֩��");
		choosetransportType.add("��������");
		ShipmentPanel.add(choosetransportType);

	}

	// ��ת���ձ���
	BackLabel acceptReceiptback = new BackLabel(30, 40, 800, 250);
	BackLabel loadingReceiptback = new BackLabel(30, 350, 800, 160);
	// װ�˹�����
	BackLabel loadingTipsback = new BackLabel(40, 50, 200, 450);
	BackLabel loadingInfoback = new BackLabel(260, 50, 230, 450);
	BackLabel stockoutListback = new BackLabel(550, 50, 280, 450);

	void background() {
		// ��ת����
		AcceptReceiptPanel.add(acceptReceiptback);
		AcceptReceiptPanel.add(loadingReceiptback);
		// װ�˹���
		ShipmentPanel.add(loadingTipsback);
		ShipmentPanel.add(loadingInfoback);
		ShipmentPanel.add(stockoutListback);
	}

	// ��ת���ս��水ť����
	void fullAcceptReceiptButton() {

		SimpleButton fullAcceptReceiptButton = new SimpleButton("�鿴�������յ�",
				30, 310, 160, 35);
		AcceptReceiptPanel.add(fullAcceptReceiptButton);
	}

	void confirmInButton() {

		SimpleButton confirmButton = new SimpleButton("ȷ��¼��", 660, 310,
				170, 30);
		AcceptReceiptPanel.add(confirmButton);
	}

	void confirmButton() {

		SimpleButton confirmButton = new SimpleButton("ȷ��",	30, 520, 800, 30);
		AcceptReceiptPanel.add(confirmButton);
	}

	void checkFulltransitReceitButton() {

		SimpleButton checkFulltransitReceitButton = new SimpleButton("�鿴������ת��",30, 560, 800, 30);
		AcceptReceiptPanel.add(checkFulltransitReceitButton);
	}

	// װ�˹�����水ť����
	void confirm2Button() {

		SimpleButton confirm2Button = new SimpleButton(
				"ȷ��",
				40, 520, 790, 35);
		ShipmentPanel.add(confirm2Button);
	}

	void cancelButton() {

		SimpleButton cancelButton = new SimpleButton(
				"ȡ��",
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
				changeState("��ת����ҵ��Ա", "��ת����");
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
				changeState("��ת����ҵ��Ա", "װ�˹���");
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
