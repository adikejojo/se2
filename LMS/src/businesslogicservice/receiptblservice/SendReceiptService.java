package businesslogicservice.receiptblservice;

import UI.mainUI.expressType;

public interface SendReceiptService {
	
	
	/**
	 * 生成一个订单编号 
	 * @return 返回该订单编号
	 */
	public String makeReceiptID();
	
	
	
	/**
	 * 提交寄件单
	 * @return 返回是否成功提交寄件单
	 */
	public boolean submitSendReceipt(String nameS, String phoneS, String addressS, 
            String nameR, String phoneR, String addressR, 
            double weight, double volume, String content,
            expressType type, double packFee);
	
	public double getPrice();
	
	public double getPrice_stub();
}
