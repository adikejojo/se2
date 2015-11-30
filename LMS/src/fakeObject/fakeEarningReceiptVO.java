package fakeObject;

import java.util.Vector;

public class fakeEarningReceiptVO extends Vector<String>{
	public fakeEarningReceiptVO(String receiptid, String amount, String operator, String date, String hallid) {
		add(receiptid);
		add(amount);
		add(operator);
		add(date);
		add(hallid);
	}
	String getID(){
		return get(0);
	}
	String getAmount(){
		return get(1);
	}
	String getOperator(){
		return get(2);
	}
	String getDate(){
		return get(3);
	}
	String getHallID(){
		return get(4);
	}
}