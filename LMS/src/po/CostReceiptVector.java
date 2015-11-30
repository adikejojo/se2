package po;

import java.util.Vector;

public class CostReceiptVector {
	private Vector<CostReceiptPO> cost;
	public CostReceiptVector(){
		this.cost =new Vector<CostReceiptPO>();
	}
	public void addItem(CostReceiptPO item){
		this.cost.add(item);
	}
}
