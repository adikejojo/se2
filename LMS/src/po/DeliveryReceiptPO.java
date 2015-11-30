package po;

public class DeliveryReceiptPO {
	
	private String number;
	private String date;
	private String destination;
	private String courier;
	private boolean send;
	public DeliveryReceiptPO(String Number,String Date,String Destination,String Courier, boolean Send) {
		number = Number;
		date = Date;
		destination = Destination;
		courier= Courier;
		send = Send;
		// TODO Auto-generated constructor stub
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public boolean isSend() {
		return send;
	}
	public void setSend(boolean send) {
		this.send = send;
	}
	public String getCourier() {
		return courier;
	}
	public void setCourier(String courier) {
		this.courier = courier;
	}
	
}
