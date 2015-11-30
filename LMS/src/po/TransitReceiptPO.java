package po;

public class TransitReceiptPO {

	String loadingDate;
	String transitReceiptNumber;
	String placeOfDeparture;
	String placeOfArrival;
	String shippingNoteNumber;//原本是数组
	public TransitReceiptPO(String LoadingDate,String TransitReceiptNumber,String PlaceOfDepature,String PlaceOfArrival,String ShippingNoteNumber) {
		loadingDate = LoadingDate;
		transitReceiptNumber = TransitReceiptNumber;
		placeOfDeparture = PlaceOfDepature;
		placeOfArrival = PlaceOfArrival;
		shippingNoteNumber = ShippingNoteNumber;
	}
	public String getLoadingDate(){
		return loadingDate;
	}
	public String getTransitReceiptNumber(){
		return transitReceiptNumber;
	}
	public String getPlaceOfDepature(){
		return placeOfDeparture;
	}
	public String getPlaceOfArrival(){
		return placeOfArrival;
	}
	public String getShippingNoteNumber(){
		return shippingNoteNumber;
	}
	public void setLoadingDate(String LoadingDate){
		loadingDate= LoadingDate;
	}
	public void setTransitReceiptNumber(String TransitReceiptNumber){
		transitReceiptNumber = TransitReceiptNumber;
	}
	public void setPlaceOfDepature(String Place){
		placeOfDeparture = Place;
	}
	public void setPlaceOfArrival(String place){
		placeOfArrival = place;
	}
	public void setShippingNoteNumber(String num){
		shippingNoteNumber = num;
	}
}
