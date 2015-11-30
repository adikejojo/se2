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
//import po.ConfigurationPO;
//import po.supercargoPO;
//import dataservice.configurationdataservice.ConfigurationDataService;
//
//public class ConfigurationDataServiceStub implements ConfigurationDataService{
//	public ConfigurationPO find(String id) throws RemoteException{
//		return new supercargoPO("Jack", "1980/10/10", "430903198010102648",
//				"13911111111", 1);
//	}
//	
//	public void insert(ConfigurationPO po) throws RemoteException{
////		supercargoPO scPO=(supercargoPO)po;
//		File list = new File("Data/Configuration/txt");
////		if(this.type==DataType.TXT){
//			try {
////				BufferedWriter bw= new BufferedWriter(new FileWriter("Data/SendReceipt/txt"));
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(                        
//		                    new FileOutputStream(list, true))); 
//				bw.write("Jack"+ "1980/10/10"+"430903198010102648"+
//						"13911111111"+"1");
//				bw.newLine();
//				bw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
////		}
//		
//	}
//	
//	public void delete(ConfigurationPO po) throws RemoteException{
//		
//	}
//	
//	public void update(ConfigurationPO po) throws RemoteException{
//		
//	}
//	
//	public void init() throws RemoteException{
//		File f=new File("Data/Configuration/txt");
//		try {
//			FileWriter fw=new FileWriter(f);
//			fw.write("");
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void finish() throws RemoteException{
//		File f=new File("Data/Configuration/txt");
//		f.delete();
//	}
//}
