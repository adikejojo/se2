package po;


public class LoadingReceiptPO {

	private String number;//快递编号
	private String start;	
	private String destination;
	private String date;
	private String car;
	private String monitor;//监装员
	private String escort;//押运员
	private boolean choose;
	public LoadingReceiptPO(String Number,String Start,String Destination,String Date,String Car,String Monitor,String Escort,boolean Choose) {
		number = Number;
		start = Start;
		destination =Destination;
		date = Date;
		car = Car;
		monitor = Monitor;
		escort = Escort;
		choose = Choose;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getEscort() {
		return escort;
	}
	public void setEscort(String escort) {
		this.escort = escort;
	}
	public boolean isChoose() {
		return choose;
	}
	public void setChoose(boolean choose) {
		this.choose = choose;
	}
	
}
