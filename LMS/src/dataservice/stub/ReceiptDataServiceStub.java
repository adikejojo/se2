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
//import po.ReceiptPO;
//import po.SendReceiptPO;
//import dataservice.receiptdataservice.ReceiptDataService;
//
//public class ReceiptDataServiceStub implements ReceiptDataService{
//
//	@Override
//	public ReceiptPO find(String id) throws RemoteException {
//		// TODO Auto-generated method stub
//		return new SendReceiptPO(id, null, null, null, 0, 0);
//	}
//
//	@Override
//	public void insert(ReceiptPO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		SendReceiptPO srPO=(SendReceiptPO)po;
//		File sendreceiptlist = new File("Data/Receipt/SendReceipt/txt");
////		if(this.type==DataType.TXT){
//			try {
////				BufferedWriter bw= new BufferedWriter(new FileWriter("Data/SendReceipt/txt"));
//				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(                        
//		                    new FileOutputStream(sendreceiptlist, true))); 
//				bw.write(srPO.getOrder_barcode_number()+";"+srPO.getPacking_expense()
//						+";"+srPO.getToral_price()+";"+srPO.getExpress_type()+";"
//						+srPO.getReceiver().getName()+";"+srPO.getSender().getName());
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
//	@Override
//	public void delete(ReceiptPO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void update(ReceiptPO po) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void init() throws RemoteException {
//		File f=new File("Data/Receipt/SendReceipt/txt");
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
//		File f=new File("Data/Receipt/SendReceipt/txt");
//		f.delete();
//		
//	}
//
//}
