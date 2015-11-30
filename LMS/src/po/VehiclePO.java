package po;

public class VehiclePO extends ConfigurationPO{

	protected int vehicleNumber;
	protected int engineNumber;
	protected int licenseNumber;
	protected int underpanNumber;
	protected String purchaseDate;
	protected String serviceDate;

	public VehiclePO(int vehicleNumber, int engineNumber, int licenseNumber,
			int underpanNumber, String purchaseDate, String serviceDate) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.engineNumber = engineNumber;
		this.licenseNumber = licenseNumber;
		this.underpanNumber = underpanNumber;
		this.purchaseDate = purchaseDate;
		this.serviceDate = serviceDate;
		this.dataBaseID = 1;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public int getEngineNumber() {
		return engineNumber;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public int getUnderpanNumber() {
		return underpanNumber;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public String getServiceDate() {
		return serviceDate;
	}

}
