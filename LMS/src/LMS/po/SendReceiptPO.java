package LMS.po;

public class SendReceiptPO extends ReceiptPO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String id;
	
	senderPO sender;
	receiverPO receiver;
	
	int express_type;
	double packing_expense;
	double toral_price;
	
	
	
	public SendReceiptPO(String order_barcode_number, senderPO sender,
			receiverPO receiver, int express_type, double packing_expense,
			double toral_price) {
		super();
		this.id = order_barcode_number;
		this.sender = sender;
		this.receiver = receiver;
		this.express_type = express_type;
		this.packing_expense = packing_expense;
		this.toral_price = toral_price;
	}



	public String getID() {
		return id;
	}



	public senderPO getSender() {
		return sender;
	}



	public receiverPO getReceiver() {
		return receiver;
	}



	public int getExpress_type() {
		return express_type;
	}



	public double getPacking_expense() {
		return packing_expense;
	}



	public double getToral_price() {
		return toral_price;
	}

	
}
