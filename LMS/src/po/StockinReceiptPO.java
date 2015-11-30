package po;

public class StockinReceiptPO {

	Double alarmValue = 0.9;
	String ID;
	String stockin_date;
	String send_date;
	String destination;
	int area_number;
	int row_number;
	int rack_number;
	int place_number;

	public StockinReceiptPO(String ID, String stockin_date, String send_date,
			String destination, int area_number, int row_number,
			int rack_number, int place_number) {
//		super();
		this.ID = ID;
		this.stockin_date = stockin_date;
		this.send_date = send_date;
		this.destination = destination;
		this.area_number = area_number;
		this.row_number = row_number;
		this.rack_number = rack_number;
		this.place_number = place_number;
	}

	public String getID() {
		return ID;
	}

	public String getStockin_date() {
		return stockin_date;
	}
	
	public String getSend_date() {
		return send_date;
	}

	public String getDestination() {
		
		return destination;
	}
	
	public String setDestination() {
		return ID;
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

