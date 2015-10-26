package po;

public class ImportReceiptPO extends ReceiptPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	String sendReceiptID;
	String import_date;
	String arrival;
	int area_number;
	int row_number;
	int rack_number;
	int place_number;
	
	public ImportReceiptPO(String sendReceiptID, String import_date,
			String arrival, int area_number, int row_number, int rack_number,
			int place_number) {
		super();
		this.sendReceiptID = sendReceiptID;
		this.import_date = import_date;
		this.arrival = arrival;
		this.area_number = area_number;
		this.row_number = row_number;
		this.rack_number = rack_number;
		this.place_number = place_number;
	}

	public String getSendReceiptID() {
		return sendReceiptID;
	}

	public String getImport_date() {
		return import_date;
	}

	public String getArrival() {
		return arrival;
	}

	public int getArea_number() {
		return area_number;
	}

	public int getRow_number() {
		return row_number;
	}

	public int getRack_number() {
		return rack_number;
	}

	public int getPlace_number() {
		return place_number;
	}
	

	
	
}
