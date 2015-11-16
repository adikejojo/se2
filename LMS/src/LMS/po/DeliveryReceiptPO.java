package LMS.po;

public class DeliveryReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	String arrival_date;
	String sendReceiptID;
	String courierID;
	public DeliveryReceiptPO(String arrival_date, String sendReceiptID,
			String courierID) {
		super();
		this.arrival_date = arrival_date;
		this.sendReceiptID = sendReceiptID;
		this.courierID = courierID;
	}
	public String getArrival_date() {
		return arrival_date;
	}
	public String getSendReceiptID() {
		return sendReceiptID;
	}
	public String getCourierID() {
		return courierID;
	}
	
	
}
