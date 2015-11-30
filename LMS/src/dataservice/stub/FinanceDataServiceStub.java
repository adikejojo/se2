//package dataservice.stub;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.rmi.RemoteException;
//
//import po.FinancePO;
//import dataservice.financedataservice.FinanceDataService;
//
//public class FinanceDataServiceStub implements FinanceDataService{
//
//	@Override
//	public FinancePO find(String id) throws RemoteException {
//		String[] institutionID={"1","2"};
//		String[][] personID={{"1","2"},{"1","2"}};
//		String[] vehicleID={"1","2"};
//		return new FinancePO(institutionID,personID,vehicleID);
//	}
//
//	@Override
//	public void insert(FinancePO po) throws RemoteException {
//		File list = new File("Data/Finance/txt");
////		if(this.type==DataType.TXT){
//			try {
////				BufferedWriter bw= new BufferedWriter(new FileWriter("Data/SendReceipt/txt"));
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(                        
//		                    new FileOutputStream(list, true))); 
//				bw.write("1"+"2"+"1");
//				bw.newLine();
//				bw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
////		}
//		
//		
//	}
//
//	@Override
//	public void delete(FinancePO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void update(FinancePO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void init() throws RemoteException {
//		File f=new File("Data/Finance/txt");
//		try {
//			FileWriter fw=new FileWriter(f);
//			fw.write("");
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Override
//	public void finish() throws RemoteException {
//		File f=new File("Data/Finance/txt");
//		f.delete();
//		
//	}
//
//}
