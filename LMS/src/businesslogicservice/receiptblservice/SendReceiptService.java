package businesslogicservice.receiptblservice;

import UI.mainUI.expressType;

public interface SendReceiptService {
	
	
	/**
	 * ����һ��������� 
	 * @return ���ظö������
	 */
	public String makeReceiptID();
	
	
	
	/**
	 * �ύ�ļ���
	 * @return �����Ƿ�ɹ��ύ�ļ���
	 */
	public boolean submitSendReceipt(String nameS, String phoneS, String addressS, 
            String nameR, String phoneR, String addressR, 
            double weight, double volume, String content,
            expressType type, double packFee);
	
	public double getPrice();
	
	public double getPrice_stub();
}
