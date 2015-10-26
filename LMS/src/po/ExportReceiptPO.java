package po;

public class ExportReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String sendReceiptID;
	String export_date;
	String arrival;
	String transport_type;
	String transitReceiptID;
	public ExportReceiptPO(String sendReceiptID, String export_date,
			String arrival, String transport_type, String transitReceiptID) {
		super();
		this.sendReceiptID = sendReceiptID;
		this.export_date = export_date;
		this.arrival = arrival;
		this.transport_type = transport_type;
		this.transitReceiptID = transitReceiptID;
	}
	public String getSendReceiptID() {
		return sendReceiptID;
	}
	public String getExport_date() {
		return export_date;
	}
	public String getArrival() {
		return arrival;
	}
	public String getTransport_type() {
		return transport_type;
	}
	public String getTransitReceiptID() {
		return transitReceiptID;
	}
	

	
}
