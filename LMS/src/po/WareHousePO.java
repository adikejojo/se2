package po;

public class WareHousePO {
	private String wareHouseID;
	private int area;
	private int row;
	private int frame;
	private int place;
	
	public WareHousePO(String wareHouseID, int area, int row, int frame, int place) {
		super();
		this.wareHouseID = wareHouseID;
		this.area = area;
		this.row = row;
		this.frame = frame;
		this.place = place;
	}
	
	public String getWareHouseID() {
		return wareHouseID;
	}
	public void setWareHouseID(String wareHouseID) {
		this.wareHouseID = wareHouseID;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getFrame() {
		return frame;
	}
	public void setFrame(int frame) {
		this.frame = frame;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	
}
