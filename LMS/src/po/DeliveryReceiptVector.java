package po;

import java.util.Vector;


public class DeliveryReceiptVector {
	private Vector<DeliveryReceiptPO> earning;
	public DeliveryReceiptVector(){
		this.earning =new Vector<DeliveryReceiptPO>();
	}
	public void addItem(DeliveryReceiptPO item){
		this.earning.add(item);
	}
	public Vector<DeliveryReceiptPO> getPO(){
		return this.earning;
	}
}
