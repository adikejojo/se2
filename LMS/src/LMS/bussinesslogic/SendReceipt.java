package LMS.bussinesslogic;

import LMS.businesslogicservice.SendReceiptService;
import LMS.vo.SendReceiptVO;

public class SendReceipt implements SendReceiptService{
	String idNumber;
	@Override
	public String makeReceiptID() {
		this.idNumber = "1234567890";
		// TODO Auto-generated method stub
		return idNumber;
	}

	@Override
	public boolean submitSendReceipt() {
		String ID = this.idNumber;
		// TODO Auto-generated method stub
		return false;
	}



}
