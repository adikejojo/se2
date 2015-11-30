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

	// 总经理主界面
	GeneralPanel WageStrategyPanel = new GeneralPanel();
	GeneralPanel ReceiptCheckPanel = new GeneralPanel();
	GeneralPanel StatisticsAnalysisPanel = new GeneralPanel();
	GeneralPanel InstitutionManagementPanel = new GeneralPanel();
	MyColor color = new MyColor();

	ItemLine originPlace = new ItemLine(50,"dd");

	// 人员和机构管理界面
	WordLabel InsitutionManagementInput = new WordLabel("人员和机构概况:", 30, 10,
			200, 25);
	WordLabel institutionL = new WordLabel("机构概况",
			30, 50, 410, 35);
	WordLabel personnelL = new WordLabel("人员概况", 460,
			50, 410, 35);
	WordLabel institutionID = new WordLabel("机构ID:", 30, 400, 410, 25);
	WordLabel rersonnelID = new WordLabel("人员ID:", 460, 400, 410, 25);
	MyTextField institutionIDText;
	MyTextField rersonnelIDText;

	// 审批单据界面
	WordLabel chooseReceiptType = new WordLabel("选择单据种类", 30, 10, 150, 20);
	Choice ReceiptType;
	WordLabel receiptInfo = new WordLabel("单据详细信息：", 30, 365, 150, 20);

	// 统计报表界面
	WordLabel searchType = new WordLabel("选择方式", 30, 10, 80, 20);
	WordLabel time = new WordLabel("时间", 130, 10, 50, 20);
	MyTextField startDateText;
	WordLabel row = new WordLabel("—", 380, 10, 40, 20);
	MyTextField endDateText;
	WordLabel type = new WordLabel("类型", 610, 10, 55, 20);
	Choice typeChoice;
	WordLabel busineeHall = new WordLabel("营业厅", 130, 55, 70, 20);
	Choice busineeHallChoice;
	WordLabel transitCenter = new WordLabel("中转中心", 410, 55, 90, 20);
	Choice transitCenterChoice;
	WordLabel tableInfo = new WordLabel("表单信息", 30, 125, 80, 20);

	// 工资策略制定界面
	WordLabel wageStrategyTable = new WordLabel("工资策略列表", 30, 10, 150, 20);
	WordLabel strategyDetails = new WordLabel("策略详情", 30, 340, 80, 20);

	private void init() {
		// TODO Auto-generated method stub
		this.add(WageStrategyPanel);
		this.add(ReceiptCheckPanel);
		this.add(StatisticsAnalysisPanel);
		this.add(InstitutionManagementPanel);
		changeState("总经理", "工资策略制定");
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

	// 人员机构管理背景
	BackLabel Institutionback = new BackLabel(30, 85, 410, 300);
	BackLabel Personnelback = new BackLabel(460, 85, 410, 300);
	// 审批单据背景
	BackLabel ReceiptCheckback = new BackLabel(30, 50, 650, 300);
	BackLabel ReceiptInfoback = new BackLabel(30, 400, 830, 200);
	// 查询统计分析背景
	BackLabel tableInfoback = new BackLabel(130, 125, 650, 450);
	// 工资策略制定背景
	BackLabel wageStrategyTableback = new BackLabel(30, 40, 800, 280);
	BackLabel strategyDetailsback = new BackLabel(30, 370, 800, 200);

	void inputField() {// 输入框设置
		// 人员机构管理界面
		institutionIDText = new MyTextField(30, 430, 410, 30);
		rersonnelIDText = new MyTextField(460, 430, 410, 30);
		InstitutionManagementPanel.add(rersonnelIDText);
		InstitutionManagementPanel.add(institutionIDText);

		// 审批单据界面
		ReceiptType = new Choice();
		ReceiptType.setBounds(180, 10, 90, 25);
		ReceiptType.setBackground(color.LightGray());
		ReceiptType.add("寄件单");
		ReceiptType.add("收款单");
		ReceiptType.add("入库单");
		ReceiptType.add("出库单");
		ReceiptCheckPanel.add(ReceiptType);

		// 统计报表界面
		startDateText = new MyTextField(190, 10, 180, 30);
		endDateText = new MyTextField(420, 10, 180, 30);
		typeChoice = new Choice();
		typeChoice.setBounds(680, 10, 90, 30);
		typeChoice.setBackground(color.LightGray());
		typeChoice.add("这是什么玩意");
		typeChoice.add("no strings on me");
		busineeHallChoice = new Choice();
		busineeHallChoice.setBounds(210, 55, 180, 30);
		busineeHallChoice.setBackground(color.LightGray());
		busineeHallChoice.add("查尔");
		busineeHallChoice.add("克哈");
		busineeHallChoice.add("艾尔");
		transitCenterChoice = new Choice();
		transitCenterChoice.setBounds(510, 55, 180, 30);
		transitCenterChoice.setBackground(color.LightGray());
		transitCenterChoice.add("燕云");
		transitCenterChoice.add("徐海");
		transitCenterChoice.add("秦川");
		transitCenterChoice.add("巴蜀");
		transitCenterChoice.add("开封");
		transitCenterChoice.add("襄州");
		transitCenterChoice.add("云滇");
		transitCenterChoice.add("荆湖");
		transitCenterChoice.add("江南");
		transitCenterChoice.add("九华");
		transitCenterChoice.add("杭州");
		transitCenterChoice.add("东越");
		StatisticsAnalysisPanel.add(startDateText);
		StatisticsAnalysisPanel.add(endDateText);
		StatisticsAnalysisPanel.add(typeChoice);
		StatisticsAnalysisPanel.add(busineeHallChoice);
		StatisticsAnalysisPanel.add(transitCenterChoice);
	}

	void wordsLabel() {// 标签设置
		// 人员机构管理界面初始化
		InstitutionManagementPanel.add(InsitutionManagementInput);

		InstitutionManagementPanel.add(institutionL);
		institutionL.setOpaque(true);
		institutionL.setBackground(Color.gray);
		InstitutionManagementPanel.add(personnelL);
		personnelL.setOpaque(true);
		personnelL.setBackground(Color.gray);
		InstitutionManagementPanel.add(rersonnelID);
		InstitutionManagementPanel.add(institutionID);

		// 审批单据界面初始化
		ReceiptCheckPanel.add(chooseReceiptType);
		ReceiptCheckPanel.add(receiptInfo);

		// 统计报表
		StatisticsAnalysisPanel.add(searchType);
		StatisticsAnalysisPanel.add(time);
		StatisticsAnalysisPanel.add(row);
		StatisticsAnalysisPanel.add(type);
		StatisticsAnalysisPanel.add(busineeHall);
		StatisticsAnalysisPanel.add(transitCenter);
		StatisticsAnalysisPanel.add(tableInfo);
		// 工资策略制定
		WageStrategyPanel.add(wageStrategyTable);
		WageStrategyPanel.add(strategyDetails);
	}

	void background() {// 背景设置
		// 人员机构管理界面背景设置
		InstitutionManagementPanel.add(Institutionback);
		InstitutionManagementPanel.add(Personnelback);
		// 审批单据背景设置
		ReceiptCheckPanel.add(ReceiptCheckback);
		ReceiptCheckPanel.add(ReceiptInfoback);
		// 查询统计分析背景设置
		StatisticsAnalysisPanel.add(tableInfoback);
		// 工资策略制定背景设置
		WageStrategyPanel.add(wageStrategyTableback);
		WageStrategyPanel.add(strategyDetailsback);
	}

	// 人员机构管理界面按钮设置
	void institutionSearchButton() {
		SimpleButton institutionSearchButton = new SimpleButton(
				"查询机构", 30, 480, 410, 35);
		InstitutionManagementPanel.add(institutionSearchButton);
	}

	void personnelSearchButton() {
		SimpleButton personnelSearchButton = new SimpleButton(
				"查询人员", 460, 480, 410, 35);
		InstitutionManagementPanel.add(personnelSearchButton);
	}

	void addInstitutionButton() {
		SimpleButton addInstitutionButton = new SimpleButton("添加机构",
				30, 545, 200, 35);
		InstitutionManagementPanel.add(addInstitutionButton);
	}

	void modifyInstitutionButton() {
		SimpleButton modifyInstitutionButton = new SimpleButton(
				"修改机构信息", 240, 545, 200, 35);
		InstitutionManagementPanel.add(modifyInstitutionButton);
	}

	void addPersonnelButton() {
		SimpleButton addPersonnelButton = new SimpleButton("添加人员",
				460, 545, 200, 35);
		InstitutionManagementPanel.add(addPersonnelButton);
	}

	void modifyPersonnelButton() {
		SimpleButton modifyPersonnelButton = new SimpleButton("修改人员信息",
				670, 545, 200, 35);
		InstitutionManagementPanel.add(modifyPersonnelButton);
	}

	// 审批单据界面按钮设置
	void ReceiptPassButton() {
		SimpleButton ReceiptPassButton = new SimpleButton("审批通过", 710,
				265, 150, 35);
		ReceiptCheckPanel.add(ReceiptPassButton);
	}

	void ReceiptCancelButton() {
		SimpleButton ReceiptCancelButton = new SimpleButton("取消审批", 710,
				315, 150, 35);
		ReceiptCheckPanel.add(ReceiptCancelButton);
	}

	// 左侧菜单按钮设置
	void WageStrategyButton() {
		Button WageStrategyButton = new Button(250, "src/picture/RSS.png",
				"src/picture/RSSHL.png");
		this.getContentPane().add(WageStrategyButton);
		WageStrategyButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				click("WageStrategy");
				changeState("总经理", "工资策略制定");
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
				changeState("总经理", "查询统计分析");
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
				changeState("总经理", "审批单据");
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
				changeState("总经理", "人员机构管理");
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

	// 界面跳转
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
