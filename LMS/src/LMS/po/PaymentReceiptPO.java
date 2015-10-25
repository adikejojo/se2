package LMS.po;

public class PaymentReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String pay_date;
	int money;
	String name;
	String account;
	String entry;
	String note;
	public PaymentReceiptPO(String pay_date, int money, String name,
			String account, String entry, String note) {
		super();
		this.pay_date = pay_date;
		this.money = money;
		this.name = name;
		this.account = account;
		this.entry = entry;
		this.note = note;
	}
	public String getPay_date() {
		return pay_date;
	}
	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	public String getAccount() {
		return account;
	}
	public String getEntry() {
		return entry;
	}
	public String getNote() {
		return note;
	}

}
