package po;


public class CollectionReceiptPO {
	
	private String number;//��ݱ��
	private String date;
	private String start;
	private String ID;//��Ӫҵ�����
	private String numberOfTran;//��ת�����
	private boolean situation;
	public CollectionReceiptPO(String Number,String Date,String Start,String id,String NumberOfTran,boolean Situation) {
		number = Number;
		date = Date;
		start = Start;
		ID = id;
		numberOfTran = NumberOfTran;
		situation = Situation;
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
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public boolean isSituation() {
		return situation;
	}
	public void setSituation(boolean situation) {
		this.situation = situation;
	}
	public String getNumberOfTran() {
		return numberOfTran;
	}
	public void setNumberOfTran(String numberOfTran) {
		this.numberOfTran = numberOfTran;
	}
	
}
