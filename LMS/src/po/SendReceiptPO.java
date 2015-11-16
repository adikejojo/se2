package po;

import UI.mainUI.expressType;

public class SendReceiptPO extends ReceiptPO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String ID;
	
	senderPO sender;
	receiverPO receiver;
	
	expressType express_type;
	double packing_expense;
	double toral_price;
	
	
	
	public SendReceiptPO(String ID, senderPO sender,
			receiverPO receiver, expressType express_type, double packing_expense,
			double toral_price) {
//		super();
		this.ID = ID;
		this.sender = sender;
		this.receiver = receiver;
		this.express_type = express_type;
		this.packing_expense = packing_expense;
		this.toral_price = toral_price;
	}



	public String getOrder_barcode_number() {
		return ID;
	}



	public senderPO getSender() {
		return sender;
	}



	public receiverPO getReceiver() {
		return receiver;
	}



	public expressType getExpress_type() {
		return express_type;
	}



	public double getPacking_expense() {
		return packing_expense;
	}



	public double getToral_price() {
		return toral_price;
	}

	
}
