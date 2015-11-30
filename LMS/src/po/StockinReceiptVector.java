package po;

import java.util.Vector;

public class StockinReceiptVector {
	private Vector<StockinReceiptPO> stockin;

	public StockinReceiptVector() {
		this.stockin = new Vector<StockinReceiptPO>();
	}

	public void addItem(StockinReceiptPO item) {
		this.stockin.add(item);
	}
}
