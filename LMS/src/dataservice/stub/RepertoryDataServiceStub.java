//package dataservice.stub;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.rmi.RemoteException;
//
//import po.RepertoryPO;
//import dataservice.repertorydataservice.RepertoryDataService;
//
//public class RepertoryDataServiceStub implements RepertoryDataService{
//	//库存需要进一步讨论
//	@Override
//	public RepertoryPO find(String id) throws RemoteException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void insert(RepertoryPO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(RepertoryPO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void update(RepertoryPO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void init() throws RemoteException {
//		File f=new File("Data/Repertory/txt");
//		try {
//			FileWriter fw=new FileWriter(f);
//			fw.write("");
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//	@Override
//	public void finish() throws RemoteException {
//		File f=new File("Data/Repertory/txt");
//		f.delete();
//		
//	}
//
//}
