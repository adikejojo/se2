package businesslogicservice.receiptblservice;
import po.ReceiptPO;

public interface ReceiptblService {
	  public void export(ReceiptPO po);
	  public ReceiptPO getInfo(String id);
	  public void create(ReceiptPO po);
	  public void remove(String id);
	  public void modify(String id);

}
