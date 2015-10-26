package po;

import java.io.Serializable;

public class FinancePO implements Serializable{

	/**
	 * 
	 */
	public FinancePO(String[] institutionID, String[][] personID,
			String[] vehicleID) {
		super();
		this.institutionID = institutionID;
		this.personID = personID;
		this.vehicleID = vehicleID;
	}
	
	private static final long serialVersionUID = 1L;

	
	String[] institutionID;
	String[][] personID;
	String[] vehicleID;
	public String[] getInstitutionID() {
		return institutionID;
	}
	public String[][] getPersonID() {
		return personID;
	}
	public String[] getVehicleID() {
		return vehicleID;
	}
	
	
	
}
