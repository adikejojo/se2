package po;

import java.util.Vector;


public class EarningReceiptVector {
	private Vector<EarningReceiptPO> earning;
	public EarningReceiptVector(){
		this.earning =new Vector<EarningReceiptPO>();
	}
	public void addItem(EarningReceiptPO item){
		this.earning.add(item);
	}
	public Vector<EarningReceiptPO> getPO(){
		return this.earning;
	}
}
