package Presentation;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class GeneralManagerUI extends GeneralUI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	GeneralManagerUI() {

		init();
	}

	// �ܾ���������
	GeneralPanel WageStrategyPanel = new GeneralPanel();
	GeneralPanel ReceiptCheckPanel = new GeneralPanel();
	GeneralPanel StatisticsAnalysisPanel = new GeneralPanel();
	GeneralPanel InstitutionManagementPanel = new GeneralPanel();
	MyColor color = new MyColor();

	ItemLine originPlace = new ItemLine(50,"dd");

	// ��Ա�ͻ����������
	WordLabel InsitutionManagementInput = new WordLabel("��Ա�ͻ����ſ�:", 30, 10,
			200, 25);
	WordLabel institutionL = new WordLabel("�����ſ�",
			30, 50, 410, 35);
	WordLabel personnelL = new WordLabel("��Ա�ſ�", 460,
			50, 410, 35);
	WordLabel institutionID = new WordLabel("����ID:", 30, 400, 410, 25);
	WordLabel rersonnelID = new WordLabel("��ԱID:", 460, 400, 410, 25);
	MyTextField institutionIDText;
	MyTextField rersonnelIDText;

	// �������ݽ���
	WordLabel chooseReceiptType = new WordLabel("ѡ�񵥾�����", 30, 10, 150, 20);
	Choice ReceiptType;
	WordLabel receiptInfo = new WordLabel("������ϸ��Ϣ��", 30, 365, 150, 20);

	// ͳ�Ʊ������
	WordLabel searchType = new WordLabel("ѡ��ʽ", 30, 10, 80, 20);
	WordLabel time = new WordLabel("ʱ��", 130, 10, 50, 20);
	MyTextField startDateText;
	WordLabel row = new WordLabel("��", 380, 10, 40, 20);
	MyTextField endDateText;
	WordLabel type = new WordLabel("����", 610, 10, 55, 20);
	Choice typeChoice;
	WordLabel busineeHall = new WordLabel("Ӫҵ��", 130, 55, 70, 20);
	Choice busineeHallChoice;
	WordLabel transitCenter = new WordLabel("��ת����", 410, 55, 90, 20);
	Choice transitCenterChoice;
	WordLabel tableInfo = new WordLabel("����Ϣ", 30, 125, 80, 20);

	// ���ʲ����ƶ�����
	WordLabel wageStrategyTable = new WordLabel("���ʲ����б�", 30, 10, 150, 20);
	WordLabel strategyDetails = new WordLabel("��������", 30, 340, 80, 20);

	private void init() {
		// TODO Auto-generated method stub
		this.add(WageStrategyPanel);
		this.add(ReceiptCheckPanel);
		this.add(StatisticsAnalysisPanel);
		this.add(InstitutionManagementPanel);
		changeState("�ܾ���", "���ʲ����ƶ�");
		WageStrategyPanel.setVisible(false);
		StatisticsAnalysisPanel.setVisible(false);
		InstitutionManagementPanel.setVisible(false);

		background();
		wordsLabel();
		inputField();

		WageStrategyButton();
		StatisticsAnalysisButton();
		ReceiptCheckButton();
		InstitutionManagementButton();

		this.leftLabel();
		System.out.println("done");
	}

	// ��Ա����������
	BackLabel Institutionback = new BackLabel(30, 85, 410, 300);
	BackLabel Personnelback = new BackLabel(460, 85, 410, 300);
	// �������ݱ���
	BackLabel ReceiptCheckback = new BackLabel(30, 50, 650, 300);
	BackLabel ReceiptInfoback = new BackLabel(30, 400, 830, 200);
	// ��ѯͳ�Ʒ�������
	BackLabel tableInfoback = new BackLabel(130, 125, 650, 450);
	// ���ʲ����ƶ�����
	BackLabel wageStrategyTableback = new BackLabel(30, 40, 800, 280);
	BackLabel strategyDetailsback = new BackLabel(30, 370, 800, 200);

	void inputField() {// ���������
		// ��Ա�����������
		institutionIDText = new MyTextField(30, 430, 410, 30);
		rersonnelIDText = new MyTextField(460, 430, 410, 30);
		InstitutionManagementPanel.add(rersonnelIDText);
		InstitutionManagementPanel.add(institutionIDText);

		// �������ݽ���
		ReceiptType = new Choice();
		ReceiptType.setBounds(180, 10, 90, 25);
		ReceiptType.setBackground(color.LightGray());
		ReceiptType.add("�ļ���");
		ReceiptType.add("�տ");
		ReceiptType.add("��ⵥ");
		ReceiptType.add("���ⵥ");
		ReceiptCheckPanel.add(ReceiptType);

		// ͳ�Ʊ������
		startDateText = new MyTextField(190, 10, 180, 30);
		endDateText = new MyTextField(420, 10, 180, 30);
		typeChoice = new Choice();
		typeChoice.setBounds(680, 10, 90, 30);
		typeChoice.setBackground(color.LightGray());
		typeChoice.add("����ʲô����");
		typeChoice.add("no strings on me");
		busineeHallChoice = new Choice();
		busineeHallChoice.setBounds(210, 55, 180, 30);
		busineeHallChoice.setBackground(color.LightGray());
		busineeHallChoice.add("���");
		busineeHallChoice.add("�˹�");
		busineeHallChoice.add("����");
		transitCenterChoice = new Choice();
		transitCenterChoice.setBounds(510, 55, 180, 30);
		transitCenterChoice.setBackground(color.LightGray());
		transitCenterChoice.add("����");
		transitCenterChoice.add("�캣");
		transitCenterChoice.add("�ش�");
		transitCenterChoice.add("����");
		transitCenterChoice.add("����");
		transitCenterChoice.add("����");
		transitCenterChoice.add("�Ƶ�");
		transitCenterChoice.add("����");
		transitCenterChoice.add("����");
		transitCenterChoice.add("�Ż�");
		transitCenterChoice.add("����");
		transitCenterChoice.add("��Խ");
		StatisticsAnalysisPanel.add(startDateText);
		StatisticsAnalysisPanel.add(endDateText);
		StatisticsAnalysisPanel.add(typeChoice);
		StatisticsAnalysisPanel.add(busineeHallChoice);
		StatisticsAnalysisPanel.add(transitCenterChoice);
	}

	void wordsLabel() {// ��ǩ����
		// ��Ա������������ʼ��
		InstitutionManagementPanel.add(InsitutionManagementInput);

		InstitutionManagementPanel.add(institutionL);
		institutionL.setOpaque(true);
		institutionL.setBackground(Color.gray);
		InstitutionManagementPanel.add(personnelL);
		personnelL.setOpaque(true);
		personnelL.setBackground(Color.gray);
		InstitutionManagementPanel.add(rersonnelID);
		InstitutionManagementPanel.add(institutionID);

		// �������ݽ����ʼ��
		ReceiptCheckPanel.add(chooseReceiptType);
		ReceiptCheckPanel.add(receiptInfo);

		// ͳ�Ʊ���
		StatisticsAnalysisPanel.add(searchType);
		StatisticsAnalysisPanel.add(time);
		StatisticsAnalysisPanel.add(row);
		StatisticsAnalysisPanel.add(type);
		StatisticsAnalysisPanel.add(busineeHall);
		StatisticsAnalysisPanel.add(transitCenter);
		StatisticsAnalysisPanel.add(tableInfo);
		// ���ʲ����ƶ�
		WageStrategyPanel.add(wageStrategyTable);
		WageStrategyPanel.add(strategyDetails);
	}

	void background() {// ��������
		// ��Ա����������汳������
		InstitutionManagementPanel.add(Institutionback);
		InstitutionManagementPanel.add(Personnelback);
		// �������ݱ�������
		ReceiptCheckPanel.add(ReceiptCheckback);
		ReceiptCheckPanel.add(ReceiptInfoback);
		// ��ѯͳ�Ʒ�����������
		StatisticsAnalysisPanel.add(tableInfoback);
		// ���ʲ����ƶ���������
		WageStrategyPanel.add(wageStrategyTableback);
		WageStrategyPanel.add(strategyDetailsback);
	}

	// ��Ա����������水ť����
	void institutionSearchButton() {
		SimpleButton institutionSearchButton = new SimpleButton(
				"��ѯ����", 30, 480, 410, 35);
		InstitutionManagementPanel.add(institutionSearchButton);
	}

	void personnelSearchButton() {
		SimpleButton personnelSearchButton = new SimpleButton(
				"��ѯ��Ա", 460, 480, 410, 35);
		InstitutionManagementPanel.add(personnelSearchButton);
	}

	void addInstitutionButton() {
		SimpleButton addInstitutionButton = new SimpleButton("��ӻ���",
				30, 545, 200, 35);
		InstitutionManagementPanel.add(addInstitutionButton);
	}

	void modifyInstitutionButton() {
		SimpleButton modifyInstitutionButton = new SimpleButton(
				"�޸Ļ�����Ϣ", 240, 545, 200, 35);
		InstitutionManagementPanel.add(modifyInstitutionButton);
	}

	void addPersonnelButton() {
		SimpleButton addPersonnelButton = new SimpleButton("�����Ա",
				460, 545, 200, 35);
		InstitutionManagementPanel.add(addPersonnelButton);
	}

	void modifyPersonnelButton() {
		SimpleButton modifyPersonnelButton = new SimpleButton("�޸���Ա��Ϣ",
				670, 545, 200, 35);
		InstitutionManagementPanel.add(modifyPersonnelButton);
	}

	// �������ݽ��水ť����
	void ReceiptPassButton() {
		SimpleButton ReceiptPassButton = new SimpleButton("����ͨ��", 710,
				265, 150, 35);
		ReceiptCheckPanel.add(ReceiptPassButton);
	}

	void ReceiptCancelButton() {
		SimpleButton ReceiptCancelButton = new SimpleButton("ȡ������", 710,
				315, 150, 35);
		ReceiptCheckPanel.add(ReceiptCancelButton);
	}

	// ���˵���ť����
	void WageStrategyButton() {
		Button WageStrategyButton = new Button(250, "src/picture/RSS.png",
				"src/picture/RSSHL.png");
		this.getContentPane().add(WageStrategyButton);
		WageStrategyButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click("WageStrategy");
				changeState("�ܾ���", "���ʲ����ƶ�");
				changeSymbol("src/picture/RSSIcon.png");
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

	void StatisticsAnalysisButton() {
		Button StatisticsAnalysisButton = new Button(300, "src/picture/RS.png",
				"src/picture/RSHL.png");
		this.getContentPane().add(StatisticsAnalysisButton);
		StatisticsAnalysisButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click("StatisticsAnalysis");
				changeState("�ܾ���", "��ѯͳ�Ʒ���");
				changeSymbol("src/picture/RSIcon.png");
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

	void ReceiptCheckButton() {
		ReceiptPassButton();
		ReceiptCancelButton();
		Button ReceiptCheckButton = new Button(350, "src/picture/Approval.png",
				"src/picture/ApprovalHL.png");
		this.getContentPane().add(ReceiptCheckButton);
		ReceiptCheckButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click("ReceiptCheck");
				changeState("�ܾ���", "��������");
				changeSymbol("src/picture/ApprovalIcon.png");
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

	void InstitutionManagementButton() {
		institutionSearchButton();
		personnelSearchButton();
		addInstitutionButton();
		modifyInstitutionButton();
		addPersonnelButton();
		modifyPersonnelButton();
		Button InstitutionManagementButton = new Button(400,
				"src/picture/Som.png", "src/picture/SomHL.png");
		this.getContentPane().add(InstitutionManagementButton);
		InstitutionManagementButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click("InstitutionManagement");
				changeState("�ܾ���", "��Ա��������");
				changeSymbol("src/picture/SomIcon.png");
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

	// ������ת
	void click(String str) {
		WageStrategyPanel.setVisible(false);
		ReceiptCheckPanel.setVisible(false);
		StatisticsAnalysisPanel.setVisible(false);
		InstitutionManagementPanel.setVisible(false);
		switch (str) {
		case "WageStrategy":
			WageStrategyPanel.setVisible(true);
			break;
		case "ReceiptCheck":
			ReceiptCheckPanel.setVisible(true);
			break;
		case "StatisticsAnalysis":
			StatisticsAnalysisPanel.setVisible(true);
			break;
		case "InstitutionManagement":
			InstitutionManagementPanel.setVisible(true);
			break;
		default:
			System.out.println("choice error");
		}

	}

}
