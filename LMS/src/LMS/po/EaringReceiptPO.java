package LMS.po;

public class EaringReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int income;
	int expense;
	int profit;
	public EaringReceiptPO(int income, int expense, int profit) {
		super();
		this.income = income;
		this.expense = expense;
		this.profit = profit;
	}
	public int getIncome() {
		return income;
	}
	public int getExpense() {
		return expense;
	}
	public int getProfit() {
		return profit;
	}
	
	
}
