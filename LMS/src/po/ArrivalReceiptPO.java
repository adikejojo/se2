package po;

public class ArrivalReceiptPO {

	String arrivalReceiptNumber;
	String receiptNumber;
	String arrivalDate;
	String placeOfDeparture;
	String loadingDate;
	String placeOfArrival;
	String fee;

	public ArrivalReceiptPO(String arrivalReceiptNumber, String receiptNumber,
			String arrivalDate, String placeOfDeparture, String loadingDate,
			String placeOfArrival, String fee) {
		super();
		this.arrivalReceiptNumber = arrivalReceiptNumber;
		this.receiptNumber = receiptNumber;
		this.arrivalDate = arrivalDate;
		this.placeOfDeparture = placeOfDeparture;
		this.loadingDate = loadingDate;
		this.placeOfArrival = placeOfArrival;
		this.fee = fee;
	}

	public String getArrivalReceiptNumber() {
		return arrivalReceiptNumber;
	}

	public String getReceiptNumber() {
		return receiptNumber;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public String getPlaceOfDeparture() {
		return placeOfDeparture;
	}

	public String getLoadingDate() {
		return loadingDate;
	}

	public String getPlaceOfArrival() {
		return placeOfArrival;
	}

	public String getFee() {
		return fee;
	}

}
