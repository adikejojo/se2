package po;

import java.util.Vector;

public class StockoutReceiptVector {
	private Vector<StockoutReceiptPO> stockout;

	public StockoutReceiptVector() {
		this.stockout = new Vector<StockoutReceiptPO>();
	}

	public void addItem(StockoutReceiptPO item) {
		this.stockout.add(item);
	}
}
