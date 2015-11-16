package LMS.po;

public class VehiclePO extends ConfigurationPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String id;
	String car_Number;
	String engine_number;
	String chassis_number;
	String purchase_date;
	String activeTime;
	public VehiclePO(String id, String car_Number, String engine_number,
			String chassis_number, String purchase_date, String activeTime) {
		super();
		this.id = id;
		this.car_Number = car_Number;
		this.engine_number = engine_number;
		this.chassis_number = chassis_number;
		this.purchase_date = purchase_date;
		this.activeTime = activeTime;
	}
	public String getId() {
		return id;
	}
	public String getCar_Number() {
		return car_Number;
	}
	public String getEngine_number() {
		return engine_number;
	}
	public String getChassis_number() {
		return chassis_number;
	}
	public String getPurchase_date() {
		return purchase_date;
	}
	public String getActiveTime() {
		return activeTime;
	}
	
	

}
