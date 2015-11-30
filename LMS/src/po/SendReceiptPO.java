package po;



public class SendReceiptPO {
	
	private String number;
	private String time;
	private String sender;
	private String senderAddress;
	private String receiver;
	private String receiverAddress;
	private String senderWork;
	private String receiverWork;
	private String receiverPhone;
	private String senderPhone;
	private String content;
	private double weight;
	private double volume;
	private double price;
	private ExpressType express;
	private PackagingType packaging;
	private RequestType request;
	
	public SendReceiptPO(String Number,String Time,String Sender,String SenderAddress,String Receiver,
						 String ReceiverAddress,String SenderWork,String SenderPhone,String ReceiverWork,
						 String ReceiverPhone,String Content,double Weight,double Volume,ExpressType Express,
						 PackagingType Packaging, RequestType Request) {
		number = Number;
		time =Time;
		sender = Sender;
		senderAddress = SenderAddress; 
		receiver = Receiver;
		receiverAddress = ReceiverAddress;
		senderWork = SenderWork;
		senderPhone = SenderPhone;
		receiverWork = ReceiverWork;
		receiverPhone = ReceiverPhone;
		content = Content;
		weight = Weight;
		volume = Volume;
		express = Express;
		packaging = Packaging;
		request = Request;
		
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSenderAdress() {
		return senderAddress;
	}
	public void setSenderAdress(String senderAdress) {
		this.senderAddress = senderAdress;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getSenderWork() {
		return senderWork;
	}
	public void setSenderWork(String senderWork) {
		this.senderWork = senderWork;
	}
	public String getReceiverWork() {
		return receiverWork;
	}
	public void setReceiverWork(String receiverWork) {
		this.receiverWork = receiverWork;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getSenderPhone() {
		return senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public ExpressType getExpress() {
		return express;
	}
	public void setExpress(ExpressType express) {
		this.express = express;
	}
	public PackagingType getPackaging() {
		return packaging;
	}
	public void setPackaging(PackagingType packaging) {
		this.packaging = packaging;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public RequestType getRequest() {
		return request;
	}
	public void setRequest(RequestType request) {
		this.request = request;
	}
	
}
