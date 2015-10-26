package po;

public class loadingReceiptPO extends ReceiptPO{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String loading_date;
	String businessHall_number;
	String automobileTransport_number;
	String arrival;
	String licensePlateNumber;
	supercargoPO supercargo;
	String[] order_barcode_number;
	double freight;



	public loadingReceiptPO(String loading_date, String businessHall_number,
			String automobileTransport_number, String arrival,
			String licensePlateNumber, supercargoPO supercargo,
			String[] order_barcode_number, double freight) {
		super();
		this.loading_date = loading_date;
		this.businessHall_number = businessHall_number;
		this.automobileTransport_number = automobileTransport_number;
		this.arrival = arrival;
		this.licensePlateNumber = licensePlateNumber;
		this.supercargo = supercargo;
		this.order_barcode_number = order_barcode_number;
		this.freight = freight;
	}



	public String getLoading_date() {
		return loading_date;
	}



	public String getBusinessHall_number() {
		return businessHall_number;
	}



	public String getAutomobileTransport_number() {
		return automobileTransport_number;
	}



	public String getArrival() {
		return arrival;
	}



	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}



	public supercargoPO getSupercargo() {
		return supercargo;
	}



	public String[] getOrder_barcode_number() {
		return order_barcode_number;
	}



	public double getFreight() {
		return freight;
	}

	
	
}
