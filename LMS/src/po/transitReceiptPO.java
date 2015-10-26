package po;

public class transitReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String loading_date;
	String acceptReceipt_id;
	String transport_number;
	String point_of_departure;
	String arrival;
	String Container_number;
	supercargoPO supercargo;
	String[] consign_number;
	int fee;
	public transitReceiptPO(String loading_date, String acceptReceipt_id,
			String transport_number, String point_of_departure, String arrival,
			String container_number, supercargoPO supercargo,
			String[] consign_number, int fee) {
		super();
		this.loading_date = loading_date;
		this.acceptReceipt_id = acceptReceipt_id;
		this.transport_number = transport_number;
		this.point_of_departure = point_of_departure;
		this.arrival = arrival;
		Container_number = container_number;
		this.supercargo = supercargo;
		this.consign_number = consign_number;
		this.fee = fee;
	}
	public String getLoading_date() {
		return loading_date;
	}
	public String getAcceptReceipt_id() {
		return acceptReceipt_id;
	}
	public String getTransport_number() {
		return transport_number;
	}
	public String getPoint_of_departure() {
		return point_of_departure;
	}
	public String getArrival() {
		return arrival;
	}
	public String getContainer_number() {
		return Container_number;
	}
	public supercargoPO getSupercargo() {
		return supercargo;
	}
	public String[] getConsign_number() {
		return consign_number;
	}
	public int getFee() {
		return fee;
	}
	

}
