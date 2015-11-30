package Presentation;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.Vector;

public class FinancialStuffUI extends GeneralUI{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FinancialStuffUI() {
		changeState("财务人员", "结算管理");
		changeSymbol("src/picture/settlementIcon.png");
		init();
	}
	
//	AccountInit accountInit = new AccountInit();
//	EarningReceiptSearch earningSearch = new EarningReceiptSearch();
	//
	MyColor color = new MyColor();
	GeneralPanel SettlementPanel = new GeneralPanel();
	GeneralPanel CostManagementPanel = new GeneralPanel();
	GeneralPanel StatisticalFormPanel = new GeneralPanel();
	GeneralPanel AccountInitPanel = new GeneralPanel();
	Button settlementBtn = new Button(250,"src/picture/settlement.png","src/picture/settlementHL.png");
	Button costManagementBtn = new Button(300,"src/picture/cost.png","src/picture/costHL.png");
	Button statisticalFormBtn = new Button(350,"src/picture/SF.png","src/picture/SFHL.png");
	Button accountInitBtn = new Button(400,"src/picture/accountInit.png","src/picture/accountInitHL.png");
	WordLabel EarningReceiptFindWord = new WordLabel("收款单查询", 30, 0, 110, 20);
	WordLabel DateWord = new WordLabel("日期", 30, 60, 45, 20);
	WordLabel HallIDWord = new WordLabel("营业厅ID", 30, 110, 87, 20);
	WordLabel CurrentAccountWord = new WordLabel("现有账目",30,0,100,25);
	WordLabel runInfoWord = new WordLabel("经营情况表", 30, 320, 150, 25);
	MyTextField inputDataText = new MyTextField(130, 45, 400, 50);
	MyTextField inputHallIDText = new MyTextField(130, 95, 400, 50);
	infoWindow AccountInfo = new infoWindow("账目详细信息", 30, 320, 820, 280);
	
	infoWindow costInfo = new infoWindow("成本收益表", 30, 0, 830, 300);
	SimpleButton EarningReceiptFindButton = new SimpleButton("收 款 单 信 息 查 询", 550, 97, 300, 50);
	SimpleButton AddUpButton = new SimpleButton("合 计 信 息 表 单",30,550,820,50);
	SimpleButton newAccountButton = new SimpleButton("新建账目", 750, 280, 100, 30);
	SimpleButton exportButton = new SimpleButton("导出", 800, 600, 60, 30);
	void init(){
		this.add(SettlementPanel);
		this.add(StatisticalFormPanel);
		this.add(AccountInitPanel);
		this.add(CostManagementPanel);
		SearchPanel();
		infoWindows();
		table();
		Buttons();
		inputField();
		settlementButton();
		costManagmentButton();
		statisticalFormButton();
		accountInitButton();
		wordLabel();
		leftLabel();
		StatisticalFormPanel.setVisible(false);
		AccountInitPanel.setVisible(false);
		CostManagementPanel.setVisible(false);
		
	}
	void settlementButton(){
		this.getContentPane().add(settlementBtn);
		settlementBtn.addMouseListener(new MouseListener() {
			
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
				click("settlement");
				changeState("财务人员", "结算管理");
				changeSymbol("src/picture/settlementIcon.png");
			}
		});;
	}
	void costManagmentButton(){
		this.getContentPane().add(costManagementBtn);
		costManagementBtn.addMouseListener(new MouseListener() {
			
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
				click("CostManagement");
				changeState("财务人员", "成本管理");
				changeSymbol("src/picture/costIcon.png");
			}
		});
	}
	void statisticalFormButton(){
		this.getContentPane().add(statisticalFormBtn);
		statisticalFormBtn.addMouseListener(new MouseListener() {
			
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
				click("StatisticalForm");
				changeState("财务人员", "统计报表");
				changeSymbol("src/picture/SFHLIcon.png");
			}
		});
	}
	void accountInitButton(){
		this.getContentPane().add(accountInitBtn);
		accountInitBtn.addMouseListener(new MouseListener() {
			
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
				click("AccountInit");
				changeState("财务人员", "期初建账");
				changeSymbol("src/picture/accountBeginIcon.png");
			}
		});
	}
	void wordLabel(){
		SettlementPanel.add(EarningReceiptFindWord);
		
		SettlementPanel.add(DateWord);
//		DateWord.setOpaque(true);
//		DateWord.setBackground(Color.blue);
//		HallIDWord.setOpaque(true);
//		HallIDWord.setBackground(Color.blue);
		SettlementPanel.add(HallIDWord);
		AccountInitPanel.add(CurrentAccountWord);
		StatisticalFormPanel.add(runInfoWord);
	}
	void inputField(){
		SettlementPanel.add(inputDataText);
		SettlementPanel.add(inputHallIDText);
	}
	void Buttons(){
		SettlementPanel.add(EarningReceiptFindButton);
		EarningReceiptFindButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
//			SettlementTable.removeAllItem();
//			Vector<fakeEarningReceiptVO>fakeEarningVO = earningSearch.Search(inputDataText.getText(), inputHallIDText.getText());
//			Iterator<fakeEarningReceiptVO> EarningItr = fakeEarningVO.iterator();
//			while(EarningItr.hasNext()){
//				SettlementTable.addRow(EarningItr.next());
//			}
//			System.out.println("Searched");
			super.mouseClicked(e);
		}
		});
		SettlementPanel.add(AddUpButton);
		//
		newAccountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				super.mouseClicked(e);
			}
		});
		AccountInitPanel.add(newAccountButton);
		StatisticalFormPanel.add(exportButton);

	}
	MyTable SettlementTable;
	void table(){
		Vector<String> v1= new Vector<String>();
		v1.add("对应订单ID");
		v1.add("收款金额");
		v1.add("收款快递员");
		v1.add("收款日期");
		SettlementTable = new MyTable(30, 170, 820, 350, v1);
		SettlementTable.setTitleColor(Color.gray);
		SettlementTable.setFontColor(Color.white);
		SettlementTable.setFontSize(15);
		SettlementTable.setRowHeight(30);
		SettlementTable.setContentColor(color.LightGray());
		SettlementPanel.add(SettlementTable);
		//
		Vector<String> v2 = new Vector<String>();
		v2.add("ID");
		v2.add("账目名称");
		v2.add("建账日期");
		v2.add("操作人");
		MyTable AccountInitTable = new MyTable(30, 30, 820, 250, v2);
		AccountInitTable.setTitleColor(Color.gray);
		AccountInitTable.setFontColor(Color.white);
		AccountInitTable.setContentColor(color.LightGray());
		AccountInitTable.setFontSize(15);
		AccountInitTable.setRowHeight(30);
//		Vector<AccountVO> vInit = accountInit.CurrentAccount();
//		Iterator<AccountVO> iAccountPO = vInit.iterator();
//		while(iAccountPO.hasNext()){
//			AccountInitTable.addRow(iAccountPO.next());
//		}
		
		AccountInitPanel.add(AccountInitTable);
		//
		Vector<String> v3 = new Vector<String>();
		v3.add("收款单");
		v3.add("付款单");
		MyTable RunTable = new MyTable(30, 350, 830, 250, v3);
		RunTable.setTitleColor(Color.gray);
		RunTable.setFontColor(Color.white);
		RunTable.setContentColor(color.LightGray());
		StatisticalFormPanel.add(RunTable);
		//未完成
	}
	
	void infoWindows(){
		StatisticalFormPanel.add(costInfo);
		costInfo.setText("总收入                           "
				+ "总支出                                   "
				+ "总利润");
		AccountInitPanel.add(AccountInfo);
	}
	
	void SearchPanel(){
		SearchByDatePanel StatisticSearchByDate = new SearchByDatePanel(360,0);
		StatisticSearchByDate.setColorOfTextField(new Color(173,173,173));
		StatisticSearchByDate.setColorOfText(Color.white);
		StatisticalFormPanel.add(StatisticSearchByDate);
		
		SearchByDatePanel StatisticRunSearchByDate = new SearchByDatePanel(360, 320);
		StatisticRunSearchByDate.setColorOfTextField(color.MainFrameColor());
		StatisticalFormPanel.add(StatisticRunSearchByDate);
	}
	
	void click(String str){
		SettlementPanel.setVisible(false);
		CostManagementPanel.setVisible(false);
		StatisticalFormPanel.setVisible(false);
		AccountInitPanel.setVisible(false);
//		remove(SettlementPanel);
//		remove(StatisticalFormPanel);
		
		switch(str){
		case"settlement":
			SettlementPanel.setVisible(true);System.out.println(str);
			break;
		case"CostManagement":
			CostManagementPanel.setVisible(true);System.out.println(str);
			break;
		case"StatisticalForm":
			StatisticalFormPanel.setVisible(true);System.out.println(str);
			break;
		case"AccountInit":
			AccountInitPanel.setVisible(true);System.out.println(str);
			break;
			default:System.out.println("choice error");
		}
		
	}
}
