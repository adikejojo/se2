package dataservice.totalData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import po.AccountPO;
import po.ArrivalReceiptPO;
import po.BankAccountPO;
import po.CollectionReceiptPO;
import po.CostReceiptPO;
import po.DeliveryReceiptPO;
import po.DriverPO;
import po.EarningReceiptPO;
import po.ExpressType;
import po.InstitutionPO;
import po.LoadingReceiptPO;
import po.PackagingType;
import po.PaymentReceiptPO;
import po.RequestType;
import po.SalaryStrategyPO;
import po.SendReceiptPO;
import po.SignReceiptPO;
import po.StaffPO;
import po.StockinReceiptPO;
import po.StockoutReceiptPO;
import po.TransitReceiptPO;
import po.UserPO;
import po.VehiclePO;
import po.WareHousePO;

public class DataServiceImpl {
	Connection conn;
	

	public Vector<AccountPO> findAccount(){
		//tested
		Vector<AccountPO>result = new Vector<AccountPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from AccountPO");
			while(rs.next()){
				result.add(new AccountPO(rs.getString("id"), 
									     rs.getString("title"),
									     rs.getString("createdate"), 
									     rs.getString("operator"),
									     rs.getString("BankAccounts")));
			}
					
		} catch (SQLException e) {
		System.err.println("account error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<ArrivalReceiptPO> findArrivalReceipt(){
		Vector<ArrivalReceiptPO>result = new Vector<ArrivalReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from ArrivalReceiptPO");
			while(rs.next()){
				result.add(new ArrivalReceiptPO(rs.getString("arrivalReceiptNumber"), 
									     rs.getString("receiptNumber"),
									     rs.getString("arrivalDate"), 
									     rs.getString("placeOfDeparture"),
									     rs.getString("loadingDate"),
									     rs.getString("placeOfArrival"),
									     rs.getString("fee")));
			}
					
		} catch (SQLException e) {
		System.err.println("arrivalReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<BankAccountPO> findBankAccount(){
		Vector<BankAccountPO>result = new Vector<BankAccountPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from BankAccountPO");
			while(rs.next()){
				result.add(new BankAccountPO(rs.getString("accounttitle"), 
									     rs.getString("accountnumber"),
									     rs.getString("amount")));
			}
					
		} catch (SQLException e) {
		System.err.println("account error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<CollectionReceiptPO> findCollectionReceipt(){
		Vector<CollectionReceiptPO>result = new Vector<CollectionReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from CollectionReceiptPO");
			while(rs.next()){
				result.add(new CollectionReceiptPO(rs.getString("number"), 
									     rs.getString("date"),
									     rs.getString("start"), 
									     rs.getString("id"), 
									     rs.getString("numberoftran"), 
									     rs.getBoolean("situation")));
			}
					
		} catch (SQLException e) {
		System.err.println("Collection error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<CostReceiptPO> findCostPO(){
		Vector<CostReceiptPO>result = new Vector<CostReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from CostPO");
			while(rs.next()){
				result.add(new CostReceiptPO(rs.getDouble("GeneralIncome"),
											 rs.getDouble("GeneralPay"),
											 rs.getDouble("GeneralProfit")));
			}
					
		} catch (SQLException e) {
		System.err.println("CostReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<DeliveryReceiptPO> findDeliveryReceiptPO(){
		Vector<DeliveryReceiptPO>result = new Vector<DeliveryReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from DeliveryReceiptPO");
			while(rs.next()){
				result.add(new DeliveryReceiptPO(rs.getString("number"),
												 rs.getString("date"),
												 rs.getString("destination"),
												 rs.getString("courier"),
												 rs.getBoolean("send")));
			}
					
		} catch (SQLException e) {
		System.err.println("CostReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<DriverPO> findDriverPO(){
		Vector<DriverPO>result = new Vector<DriverPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from DriverPO");
			while(rs.next()){
				result.add(new DriverPO(rs.getInt("ID"),
												 rs.getString("name"),
												 rs.getString("birthDate"),
												 rs.getString("IDnumber"),
												 rs.getString("phoneNumber"),
												 rs.getString("vehicleUnit"),
												 rs.getString("gender"),
												 rs.getString("validTime")));
			}
					
		} catch (SQLException e) {
		System.err.println("Driver error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<EarningReceiptPO> findEarningReceiptPO(){
		Vector<EarningReceiptPO>result = new Vector<EarningReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from EarningReceiptPO");
			while(rs.next()){
				result.add(new EarningReceiptPO(rs.getString("numberofcourier"),
												rs.getString("nameofcourier"),
												rs.getString("date"),
												rs.getInt("count"),
												rs.getDouble("price"),
												rs.getDouble("totalPrice"),
												rs.getDouble("Weight"),
												rs.getDouble("volume"),
												rs.getBoolean("situation")));
			}
					
		} catch (SQLException e) {
		System.err.println("EarningReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}
	public Vector<InstitutionPO> findInstitutionPO(){
		Vector<InstitutionPO>result = new Vector<InstitutionPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from EarningReceiptPO");
			while(rs.next()){
				result.add(new InstitutionPO(rs.getString("id"),
											 rs.getString("name"),
											 rs.getString("staff")));
			}
					
		} catch (SQLException e) {
		System.err.println("Institution error");
		e.printStackTrace();
		}
		
		return result;
	}

	public Vector<LoadingReceiptPO> findLoadingReceiptPO(){
		Vector<LoadingReceiptPO>result = new Vector<LoadingReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from LoadingReceiptPO");
			while(rs.next()){
				result.add(new LoadingReceiptPO(rs.getString("number"),
												rs.getString("start"),
												rs.getString("destination"),
												rs.getString("date"),
												rs.getString("car"),
												rs.getString("monitor"),
												rs.getString("escort"),
												rs.getBoolean("choose")));
			}
					
		} catch (SQLException e) {
		System.err.println("LoadingReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}
	public Vector<PaymentReceiptPO> findPaymentReceiptPO(){
		Vector<PaymentReceiptPO>result = new Vector<PaymentReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from PaymentPO");
			while(rs.next()){
				result.add(new PaymentReceiptPO(rs.getString("PayDate"),
												rs.getDouble("PayMoney"),
												rs.getString("Payer"),
												rs.getString("PayAccount"),
												rs.getDouble("Rent"),
												rs.getDouble("Tranexpenses"),
												rs.getDouble("Salary"),
												rs.getDouble("Award"),
												rs.getInt("RentYear"),
												rs.getString("TansiID"),
												rs.getInt("SalaryMonth"),
												rs.getDouble("CourierRoyalty"),
												rs.getDouble("DriverRoyalty"),
												rs.getDouble("CountermanSalary")));
			}
					
		} catch (SQLException e) {
		System.err.println("PaymentPO error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<SalaryStrategyPO> findSalaryStrategyPO(){
		Vector<SalaryStrategyPO>result = new Vector<SalaryStrategyPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from SalaryStrategyPO");
			while(rs.next()){
				result.add(new SalaryStrategyPO(rs.getString("id"),
												rs.getString("title"),
												rs.getDouble("courierBaseSalary"),
												rs.getDouble("courierPushMoney"),
												rs.getDouble("businessHallClerkBaseSalary"),
												rs.getDouble("transitCenterClerkBaseSalary"),
												rs.getDouble("warehouseManagerBaseSalary"),
												rs.getDouble("financialStuffBaseSalary"),
												rs.getDouble("seniorFinancialStuffBaseSalary")));
			}
					
		} catch (SQLException e) {
		System.err.println("SalaryStrategy error");
		e.printStackTrace();
		}
		
		return result;
	}
	public Vector<SendReceiptPO> findSendReceiptPO(){
		Vector<SendReceiptPO>result = new Vector<SendReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from SendReceiptPO");
			while(rs.next()){
				result.add(new SendReceiptPO(rs.getString("number"),
												rs.getString("time"),
												rs.getString("sender"),
												rs.getString("sendaddress"),
												rs.getString("receiver"),
												rs.getString("receiveraddress"),
												rs.getString("senderwork"),
												rs.getString("senderphone"),
												rs.getString("receiverwork"),
												rs.getString("receiverphone"),
												rs.getString("content"),
												rs.getDouble("weight"),
												rs.getDouble("volume"),
												ExpressType.values()[rs.getInt("expresstype")],
												PackagingType.values()[rs.getInt("packagingtype")],
												RequestType.values()[rs.getInt("requesttypt")]));
			}
					
		} catch (SQLException e) {
		System.err.println("SendReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}

	public Vector<SignReceiptPO> findSignReceiptPO(){
		Vector<SignReceiptPO>result = new Vector<SignReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from SignReceiptPO");
			while(rs.next()){
				result.add(new SignReceiptPO(rs.getString("receiver"),
												rs.getString("number"),
												rs.getString("time")));
			}
					
		} catch (SQLException e) {
		System.err.println("SignReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}

	public Vector<StaffPO> findStaffPO(){
		Vector<StaffPO>result = new Vector<StaffPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from StaffPO");
			while(rs.next()){
				result.add(new StaffPO(rs.getString("id"),
												rs.getString("name"),
												rs.getString("salary"),
												rs.getString("institution")));
			}
					
		} catch (SQLException e) {
		System.err.println("Staff error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<StockinReceiptPO> findStockinPO(){
		Vector<StockinReceiptPO>result = new Vector<StockinReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from StockinPO");
			while(rs.next()){
				result.add(new StockinReceiptPO(rs.getString("id"),
												rs.getString("StockinTime"),
												rs.getString("SendTime"),
												rs.getString("Destination"),
												rs.getInt("areaNumber"),
												rs.getInt("rowNumber"),
												rs.getInt("rackNumber"),
												rs.getInt("placeNumber")));
			}
					
		} catch (SQLException e) {
		System.err.println("Stockin error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<StockoutReceiptPO> findStockoutPO(){
		Vector<StockoutReceiptPO>result = new Vector<StockoutReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from StockoutPO");
			while(rs.next()){
				result.add(new StockoutReceiptPO(rs.getString("ID"),
												rs.getString("StockoutDate"),
												rs.getString("Destination"),
												rs.getString("Loadtype"),
												rs.getString("TransitReceiptID")));
			}
					
		} catch (SQLException e) {
		System.err.println("Stockout error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<TransitReceiptPO> findTransitReceiptPO(){
		Vector<TransitReceiptPO>result = new Vector<TransitReceiptPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from TransitReceiptPO");
			while(rs.next()){
				result.add(new TransitReceiptPO(rs.getString("loadingDate"),
												rs.getString("transitReceiptNumber"),
												rs.getString("placeOfDepature"),
												rs.getString("placeOfArrival"),
												rs.getString("ShippingNoteNumber")));
			}
					
		} catch (SQLException e) {
		System.err.println("TransitReceipt error");
		e.printStackTrace();
		}
		
		return result;
	}
	public Vector<VehiclePO> findVehiclePO(){
		Vector<VehiclePO>result = new Vector<VehiclePO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from UserPO");
			while(rs.next()){
				result.add(new VehiclePO(rs.getInt("vehicleNumber"),
									     rs.getInt("engineNumber"),
									     rs.getInt("licenseNumber"),
									     rs.getInt("UnderpanNumber"),
									     rs.getString("purchaseDate"),
									     rs.getString("serviceDate")));
			}
					
		} catch (SQLException e) {
		System.err.println("Vehicle error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<UserPO> findUserPO(){
		Vector<UserPO>result = new Vector<UserPO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from UserPO");
			while(rs.next()){
				result.add(new UserPO(rs.getString("name"),
									  rs.getString("position"),
									  rs.getString("account"),
									  rs.getString("password")));
			}
					
		} catch (SQLException e) {
		System.err.println("User error");
		e.printStackTrace();
		}
		
		return result;
	}
	
	public Vector<WareHousePO> findWareHousePO(){
		Vector<WareHousePO>result = new Vector<WareHousePO>();
		connectDataBase();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from UserPO");
			while(rs.next()){
				result.add(new WareHousePO(rs.getString("WareHouseID"),
									  rs.getInt("Area"),
									  rs.getInt("Row"),
									  rs.getInt("Frame"),
									  rs.getInt("Places")));
			}
					
		} catch (SQLException e) {
		System.err.println("WareHouse error");
		e.printStackTrace();
		}
		
		return result;
	}
	//update

	public void addAccountPO(AccountPO account){
		connectDataBase();
		try {
			String statment = "insert into AccountPO values(?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, account.getID());
			    ps.setString(2, account.getTitle());
			    ps.setString(3, account.getCreateDate());
			    ps.setString(4, account.getOperator());
			    ps.setString(5, account.getBankAccount());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addArrivalReceiptPO(ArrivalReceiptPO arrival){
		connectDataBase();
		try {
			String statment = "insert into ArrivalReceiptPO values(?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, arrival.getArrivalReceiptNumber());
			    ps.setString(2, arrival.getReceiptNumber());
			    ps.setString(3, arrival.getArrivalDate());
			    ps.setString(4, arrival.getPlaceOfDeparture());
			    ps.setString(5, arrival.getLoadingDate());
			    ps.setString(6, arrival.getPlaceOfArrival());
			    ps.setString(7, arrival.getFee());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	public void addBankAccountPO(BankAccountPO bank){
		connectDataBase();
		try {
			String statment = "insert into BankAccountPO values(?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, bank.getAccountNumber());
			    ps.setString(2, bank.getAccountTitle());
			    ps.setString(3, bank.getAmount());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	public void addCollectionReceiptPO(CollectionReceiptPO collection){
		connectDataBase();
		try {
			String statment = "insert into CollectionReceiptPO values(?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, collection.getNumber());
			    ps.setString(2, collection.getDate());
			    ps.setString(3, collection.getStart());
			    ps.setString(4, collection.getID());
			    ps.setString(5, collection.getNumberOfTran());
			    ps.setBoolean(6, collection.isSituation());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	public void addCostReceiptPO(CostReceiptPO cost){
		connectDataBase();
		try {
			String statment = "insert into CostPO values(?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setDouble(1, cost.getGeneralIncome());
			    ps.setDouble(2, cost.getGeneralPay());
			    ps.setDouble(3, cost.getGeneralProfit());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	
	public void addDeliveryReceiptPO(DeliveryReceiptPO delivery){
		connectDataBase();
		try {
			String statment = "insert into DeliveryReceiptPO values(?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, delivery.getNumber());
			    ps.setString(2, delivery.getDate());
			    ps.setString(3, delivery.getDestination());
			    ps.setString(4, delivery.getCourier());
			    ps.setBoolean(5, delivery.isSend());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addDriverPO(DriverPO driver){
		connectDataBase();
		try {
			String statment = "insert into DriverPO values(?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setInt(1, driver.getDriverNumber());
			  ps.setString(2, driver.getName());
			  ps.setString(3, driver.getBirthDate());
			  ps.setString(4, driver.getIDnumber());
			  ps.setString(5, driver.getPhoneNumber());
			  ps.setString(6, driver.getVehicleUnit());
			  ps.setString(7, driver.getGender());
			  ps.setString(8, driver.getValidTime());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addEaringReceiptPO(EarningReceiptPO earn){
		connectDataBase();
		try {
			String statment = "insert into EarningReceiptPO values(?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, earn.getNumberOfCourier());
			  ps.setString(2, earn.getNameOfCourier());
			  ps.setString(3, earn.getDate());
			  ps.setInt(4, earn.getCount());
			  ps.setDouble(5, earn.getPrice());
			  ps.setDouble(6, earn.getTotalPrice());
			  ps.setDouble(7, earn.getWeight());
			  ps.setDouble(8, earn.getVolume());
			  ps.setBoolean(9, earn.isSituation());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addInstitutionPO(InstitutionPO institution){
		connectDataBase();
		try {
			String statment = "insert into InstitutionPO values(?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, institution.getID());
			  ps.setString(2, institution.getStaff());
			  ps.setString(3, institution.getName());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addLoadingReceiptPO(LoadingReceiptPO load){
		connectDataBase();
		try {
			String statment = "insert into LoadingReceiptPO values(?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, load.getNumber());
			  ps.setString(2, load.getStart());
			  ps.setString(3, load.getDestination());
			  ps.setString(4, load.getDate());
			  ps.setString(5, load.getCar());
			  ps.setString(6, load.getMonitor());
			  ps.setString(7, load.getEscort());
			  ps.setBoolean(8, load.isChoose());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addPaymentReceiptPO(PaymentReceiptPO pay){
		connectDataBase();
		try {
			String statment = "insert into PaymentPO values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, pay.getPayDate());
			  ps.setDouble(2, pay.getPayMoney());
			  ps.setString(3, pay.getPayer());
			  ps.setString(4, pay.getPayAccount());
			  ps.setDouble(5, pay.getRent());
			  ps.setDouble(6, pay.getTranExpenses());
			  ps.setDouble(7, pay.getSalary());
			  ps.setDouble(8, pay.getAward());
			  ps.setInt(9, pay.getRentYear());
			  ps.setString(10, pay.getTransitID());
			  ps.setInt(11, pay.getSalaryMonth());
			  ps.setDouble(12, pay.getCourierRoyalty());
			  ps.setDouble(13, pay.getDriverRoyalty());
			  ps.setDouble(14,pay.getCountermanRoyalty());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	
	public void addSalaryStrategyPO(SalaryStrategyPO salary){
		connectDataBase();
		try {
			String statment = "insert into SalaryStrategyPO values(?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, salary.getID());
			  ps.setString(2, salary.getTitle());
			  ps.setDouble(3, salary.getCourierBaseSalary());
			  ps.setDouble(4, salary.getCourierPushMoney());
			  ps.setDouble(5, salary.getBusinessHallClerkBaseSalary());
			  ps.setDouble(6, salary.getTransitCenterClerkBaseSalary());
			  ps.setDouble(7, salary.getWarehouseManagerBaseSalary());
			  ps.setDouble(8, salary.getFinancialStuffBaseSalary());
			  ps.setDouble(9, salary.getSeniorFinancialStuffBaseSalary());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	
	public void addSendReceiptPO(SendReceiptPO send){
		connectDataBase();
		try {
			String statment = "insert into SendReceiptPO values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, send.getNumber());
			  ps.setString(2, send.getTime());
			  ps.setString(3, send.getSender());
			  ps.setString(4, send.getReceiver());
			  ps.setString(5, send.getSenderAdress());
			  ps.setString(6, send.getReceiverAddress());
			  ps.setString(7, send.getSenderWork());
			  ps.setString(8, send.getReceiverWork());
			  ps.setString(9, send.getSenderPhone());
			  ps.setString(10, send.getReceiverPhone());
			  ps.setDouble(11, send.getWeight());
			  ps.setDouble(12, send.getVolume());
			  ps.setInt(13, send.getExpress().ordinal());
			  ps.setInt(14, send.getPackaging().ordinal());
			  ps.setInt(15, send.getRequest().ordinal());
			  
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addSignReceiptPO(SignReceiptPO sign){
		connectDataBase();
		try {
			String statment = "insert into SignReceiptPO values(?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, sign.getReceiver());
			  ps.setString(2, sign.getNumber());
			  ps.setString(3, sign.getTime());
			  
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	
	public void addStaffPO(StaffPO staff){
		connectDataBase();
		try {
			String statment = "insert into StaffPO values(?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, staff.getID());
			  ps.setString(2, staff.getName());
			  ps.setString(3, staff.getSalary());
			  ps.setString(4, staff.getInsitution());
			  
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}

	public void addStockinReceiptPO(StockinReceiptPO stockin){
		connectDataBase();
		try {
			String statment = "insert into StockinPO values(?,?,?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, stockin.getID());
			  ps.setString(2, stockin.getStockin_date());
			  ps.setString(3, stockin.getDestination());
			  ps.setString(4, stockin.getSend_date());
			  ps.setInt(5, stockin.getArea_number());
			  ps.setInt(6, stockin.getRow_number());
			  ps.setInt(7, stockin.getRack_number());
			  ps.setInt(8, stockin.getPlace_number());
			  
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	
	public void addStockoutReceiptPO(StockoutReceiptPO stockout){
		connectDataBase();
		try {
			String statment = "insert into StockoutPO values(?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, stockout.getID());
			  ps.setString(2, stockout.getStockout_date());
			  ps.setString(3, stockout.getDestination());
			  ps.setString(4, stockout.getTransport_type());
			  ps.setString(5, stockout.getTransitReceiptID());
			  
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	public void addTransitReceiptPO(TransitReceiptPO transit){
		connectDataBase();
		try {
			String statment = "insert into TransitReceiptPO values(?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, transit.getTransitReceiptNumber());
			  ps.setString(2, transit.getPlaceOfDepature());
			  ps.setString(3, transit.getPlaceOfArrival());
			  ps.setString(4, transit.getLoadingDate());
			  ps.setString(5, transit.getShippingNoteNumber());
			  
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	
	public void addUserPO(UserPO user){
		connectDataBase();
		try {
			String statment = "insert into UserPO values(?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, user.getAccount());
			  ps.setString(2, user.getPassword());
			  ps.setString(3, user.getName());
			  ps.setString(4, user.getPosition());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	
	public void addVehiclePO(VehiclePO v){
		connectDataBase();
		try {
			String statment = "insert into VehiclePO values(?,?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setInt(1, v.getVehicleNumber());
			  ps.setInt(2, v.getEngineNumber());
			  ps.setInt(3, v.getLicenseNumber());
			  ps.setInt(4, v.getUnderpanNumber());
			  ps.setString(5, v.getPurchaseDate());
			  ps.setString(6, v.getServiceDate());
			    ps.addBatch();
			    
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	public void addWareHousePO(WareHousePO warehouse){
		connectDataBase();
		try {
			String statment = "insert into WareHousePO values(?,?,?,?,?);";
			PreparedStatement ps = conn.prepareStatement(statment);
			  ps.setString(1, warehouse.getWareHouseID());
			  ps.setInt(2, warehouse.getArea());
			  ps.setInt(3, warehouse.getRow());
			  ps.setInt(4, warehouse.getFrame());
			  ps.setInt(5, warehouse.getPlace());
			    ps.addBatch();
//			    conn.setAutoCommit(false);
			    ps.executeBatch();
//			    conn.setAutoCommit(true);
		} catch (SQLException e) {
		System.err.println("add account error");
		e.printStackTrace();
		}
	}
	private void connectDataBase(){
		try{
			//连接SQLite的JDBC
			Class.forName("org.sqlite.JDBC");
			System.out.println("Class done");
			//建立一个数据库名Data.db的连接，如果不存在就在当前目录下创建之
			
			conn = DriverManager.getConnection("jdbc:sqlite:DataBase.db");
			//使用完毕后关闭连接
		}catch(Exception e){
			System.err.println("cant connect to the DataBase");
		}
	}	
	 void disConnextDataBase(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("cant disconnect the DataBase");
			e.printStackTrace();
		}
	}
}
