package po;


public class EarningReceiptPO {
	
	private String numberOfCourier;
	private String nameOfCourier;
	private String date;
	private int count;
	private double price;
	private double totalPrice;
	private double weight;
	private double volume;
	private boolean situation;
public EarningReceiptPO(String NumberOfCourier,String NameOfCourier,String Date,int Count,double Price,
		double TotalPrice,double Weight,double Volume,boolean Situation) {
		numberOfCourier = NumberOfCourier;
		nameOfCourier = NameOfCourier;
		date = Date;
		count = Count;
		price = Price;
		totalPrice = TotalPrice;
		Weight = weight;
		volume = Volume;
		situation = Situation;
}
	
	public String getNumberOfCourier() {
		return numberOfCourier;
	}
	public void setNumberOfCourier(String numberOfCourier) {
		this.numberOfCourier = numberOfCourier;
	}
	public String getNameOfCourier() {
		return nameOfCourier;
	}
	public void setNameOfCourier(String nameOfCourier) {
		this.nameOfCourier = nameOfCourier;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public boolean isSituation() {
		return situation;
	}
	public void setSituation(boolean situation) {
		this.situation = situation;
	}
	
}
