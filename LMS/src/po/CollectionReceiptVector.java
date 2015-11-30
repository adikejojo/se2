package po;
import java.util.Vector;


public class CollectionReceiptVector {
	private Vector<CollectionReceiptPO> earning;
	public CollectionReceiptVector(){
		this.earning =new Vector<CollectionReceiptPO>();
	}
	public void addItem(CollectionReceiptPO item){
		this.earning.add(item);
	}
	public Vector<CollectionReceiptPO> getPO(){
		return this.earning;
	}
}
