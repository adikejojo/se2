package po;

public class CostReceiptPO {
	private double generalIncome;
	private double generalPay;
	private double generalProfit;

	public CostReceiptPO(double generalIncome, double generalPay, double generalProfit) {
		super();
		this.generalIncome = generalIncome;
		this.generalPay = generalPay;
		this.generalProfit = generalProfit;
	}
	public double getGeneralIncome() {
		return generalIncome;
	}
	public void setGeneralIncome(double generalIncome) {
		this.generalIncome = generalIncome;
	}
	public double getGeneralPay() {
		return generalPay;
	}
	public void setGeneralPay(double generalPay) {
		this.generalPay = generalPay;
	}
	public double getGeneralProfit() {
		return generalProfit;
	}
	public void setGeneralProfit(double generalProfit) {
		this.generalProfit = generalProfit;
	}
}
