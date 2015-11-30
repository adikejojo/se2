package po;


public class SignReceiptPO {
	
	private String receiver;
	private String number;
	private String time;
	public SignReceiptPO(String Receiver,String Number, String Time) {
		receiver = Receiver;
		number = Number;
		time = Time;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	
}
