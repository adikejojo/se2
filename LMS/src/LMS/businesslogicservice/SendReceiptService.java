package LMS.businesslogicservice;

import LMS.vo.SendReceiptVO;

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
	public boolean submitSendReceipt();
}
