package po;

import java.util.Vector;

public class PaymentReceiptVector {
	private Vector<PaymentReceiptPO> payment;
	public PaymentReceiptVector(){
		this.payment =new Vector<PaymentReceiptPO>();
	}
	public void addItem(PaymentReceiptPO item){
		this.payment.add(item);
	}
}
