package po;

public class StockoutReceiptPO {
	
	String ID;
	String stockout_date;
	String destination;
	String transport_type;
	String transitReceiptID;
	public StockoutReceiptPO(String ID, String stockout_date,
			String destination, String transport_type, String transitReceiptID) {
		super();
		this.ID = ID;
		this.stockout_date = stockout_date;
		this.destination = destination;
		this.transport_type = transport_type;
		this.transitReceiptID = transitReceiptID;
	}
	public String getID() {
		return ID;
	}
	public String getStockout_date() {
		return stockout_date;
	}
	public String getDestination() {
		return destination;
	}
	public String getTransport_type() {
		return transport_type;
	}
	public String getTransitReceiptID() {
		return transitReceiptID;
	}
}
