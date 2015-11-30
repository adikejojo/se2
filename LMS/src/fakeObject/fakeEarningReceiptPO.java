package fakeObject;

public class fakeEarningReceiptPO {
	String ReceiptID;
	String Amount;
	String Operator;
	String Date;
	String HallID;
	public fakeEarningReceiptPO(String receiptid, String amount, String operator, String date,String hallid) {
		ReceiptID = receiptid;
		Amount = amount;
		Operator = operator;
		Date = date;
	}
	public String getID(){
		return ReceiptID;
	}
	public String getAmount(){
		return Amount;
	}
	public String getOperator(){
		return Operator;
	}
	public String getDate(){
		return Date;
	}
	public String getHallID(){
		return HallID;
	}
}
