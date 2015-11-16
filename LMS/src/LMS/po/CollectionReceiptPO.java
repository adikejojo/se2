package LMS.po;

public class CollectionReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String earning_date;
	double money;
	UserPO courier;
	String[] order_barcode_number;
	
	public CollectionReceiptPO(String earning_date, double money,
			UserPO courier, String[] order_barcode_number) {
		super();
		this.earning_date = earning_date;
		this.money = money;
		this.courier = courier;
		this.order_barcode_number = order_barcode_number;
	}

	public String getEarning_date() {
		return earning_date;
	}

	public double getMoney() {
		return money;
	}

	public UserPO getCourier() {
		return courier;
	}

	public String[] getOrder_barcode_number() {
		return order_barcode_number;
	}
	
	
}
