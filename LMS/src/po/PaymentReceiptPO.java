package po;

public class PaymentReceiptPO {
	private String payDate;
	private double payMoney;
	private String payer;
	private String payAccount;
	private double rent;
	private double tranExpenses;
	private double salary;
	private double award;
	private int rentYear;
	private String transitID;
	private int salaryMonth;
	private double courierRoyalty;
	private double driverRoyalty;
	private double countermanRoyalty;
	
	public PaymentReceiptPO(String payDate, double payMoney, String payer,
			String payAccount, double rent, double tranExpenses,
			double salary, double award, int rentYear, String transitID, int salaryMonth, double courierRoyalty, 
			double driverRoyalty, double countermanRoyalty) {
		super();
		this.payDate = payDate;
		this.payMoney = payMoney;
		this.payer = payer;
		this.payAccount = payAccount;
		this.rent = rent;
		this.tranExpenses = tranExpenses;
		this.salary = salary;
		this.award = award;
		this.rentYear = rentYear;
		this.transitID = transitID;
		this.salaryMonth = salaryMonth;
		this.courierRoyalty = courierRoyalty;
		this.driverRoyalty = driverRoyalty;
		this.countermanRoyalty = countermanRoyalty;
	}

	
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(double payMoney) {
		this.payMoney = payMoney;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public double getTranExpenses() {
		return tranExpenses;
	}
	public void setTranExpenses(double tranExpenses) {
		this.tranExpenses = tranExpenses;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAward() {
		return award;
	}
	public void setAward(double award) {
		this.award = award;
	}
	public int getRentYear() {
		return rentYear;
	}
	public void setRentYear(int rentYear) {
		this.rentYear = rentYear;
	}
	public String getTransitID() {
		return transitID;
	}
	public void setTransitID(String transitID) {
		this.transitID = transitID;
	}
	public int getSalaryMonth() {
		return salaryMonth;
	}
	public void setSalaryMonth(int salaryMonth) {
		this.salaryMonth = salaryMonth;
	}
	public double getCourierRoyalty() {
		return courierRoyalty;
	}
	public void setCourierRoyalty(double courierRoyalty) {
		this.courierRoyalty = courierRoyalty;
	}
	public double getDriverRoyalty() {
		return driverRoyalty;
	}
	public void setDriverRoyalty(double driverRoyalty) {
		this.driverRoyalty = driverRoyalty;
	}
	public double getCountermanRoyalty() {
		return countermanRoyalty;
	}
	public void setCountermanRoyalty(double countermanRoyalty) {
		this.countermanRoyalty = countermanRoyalty;
	}
}
