package po;

public class SalaryStrategyPO {
	String ID;
	String Title;
	double CourierBaseSalary;
	double CourierPushMoney;
	double BusinessHallClerkBaseSalary;
	double TransitCenterClerkBaseSalary;
	double WarehouseManagerBaseSalary;
	double FinancialStuffBaseSalary;
	double SeniorFinancialStuffBaseSalary;
	
	public SalaryStrategyPO(
	String id, 
	String title,
	double courierBaseSalary,
	double courierPushMoney,
	double businessHallClerkBaseSalary,
	double transitCenterClerkBaseSalary,
	double warehouseManagerBaseSalary,
	double financialStuffBaseSalary,
	double seniorFinancialStuffBaseSalary
	){
		ID = id;
		Title = title;
		CourierBaseSalary = courierBaseSalary;
		CourierPushMoney = courierPushMoney;
		BusinessHallClerkBaseSalary = businessHallClerkBaseSalary;
		TransitCenterClerkBaseSalary = transitCenterClerkBaseSalary;
		WarehouseManagerBaseSalary = warehouseManagerBaseSalary;
		FinancialStuffBaseSalary = financialStuffBaseSalary;
		SeniorFinancialStuffBaseSalary = seniorFinancialStuffBaseSalary;
		
	}
	public String getID(){
		return ID;
	}
	public String getTitle(){
		return Title;
	}
	public double getCourierBaseSalary(){
		return CourierBaseSalary;
	}
	public double getCourierPushMoney(){
		return CourierPushMoney;
	}
	public double getBusinessHallClerkBaseSalary(){
		return BusinessHallClerkBaseSalary;
	}
	public double getTransitCenterClerkBaseSalary(){
		return TransitCenterClerkBaseSalary;
	}
	public double getWarehouseManagerBaseSalary(){
		return WarehouseManagerBaseSalary;
	}
	public double getFinancialStuffBaseSalary(){
		return FinancialStuffBaseSalary;
	}
	public double getSeniorFinancialStuffBaseSalary(){
		return SeniorFinancialStuffBaseSalary;
	}
	//
	public void setID(String i){
		ID = i;
	}
	public void setTitle(String i){
		Title = i;
	}
	public void setCourierBaseSalary(double i){
		CourierBaseSalary = i;
	}
	public void setCourierPushMoney(double i){
		CourierPushMoney = i;
	}
	public void setBusinessHallClerkBaseSalary(double i){
		BusinessHallClerkBaseSalary =i;
	}
	public void setTransitCenterClerkBaseSalary(double i){
		TransitCenterClerkBaseSalary =i;
	}
	public void setWarehouseManagerBaseSalary(double i){
		WarehouseManagerBaseSalary =i;
	}
	public void setFinancialStuffBaseSalary(double i){
		FinancialStuffBaseSalary = i;
	}
	public void setSeniorFinancialStuffBaseSalary(double i){
		SeniorFinancialStuffBaseSalary = i;
	}
}





