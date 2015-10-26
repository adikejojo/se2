package po;

public class AcceptReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	String transitCenter_number;
	String Arrival_date;
	String tranistReceipt_id;
	String place_of_departure;
	String[] cargo_state;
	
	public AcceptReceiptPO(String transitCenter_number, String arrival_date,
			String tranistReceipt_id, String place_of_departure,
			String[] cargo_state) {
		super();
		this.transitCenter_number = transitCenter_number;
		Arrival_date = arrival_date;
		this.tranistReceipt_id = tranistReceipt_id;
		this.place_of_departure = place_of_departure;
		this.cargo_state = cargo_state;
	}

	public String getTransitCenter_number() {
		return transitCenter_number;
	}

	public String getArrival_date() {
		return Arrival_date;
	}

	public String getTranistReceipt_id() {
		return tranistReceipt_id;
	}

	public String getPlace_of_departure() {
		return place_of_departure;
	}

	public String[] getCargo_state() {
		return cargo_state;
	}
	
	
}
