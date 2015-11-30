package po;

import java.util.Vector;


public class LoadingReceiptVector {
	private Vector<LoadingReceiptPO> earning;
	public LoadingReceiptVector(){
		this.earning =new Vector<LoadingReceiptPO>();
	}
	public void addItem(LoadingReceiptPO item){
		this.earning.add(item);
	}
	public Vector<LoadingReceiptPO> getPO(){
		return this.earning;
	}
}
