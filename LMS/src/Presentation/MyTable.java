package Presentation;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MyColor color = new MyColor();
	Vector<String> VColumns = new Vector<String>();
	Vector<String> vData = new Vector<String>();
	private DefaultTableModel importListModel;
	private JTable importListTable;
	public MyTable(int x,int y,int width,int height,Vector<String> vColumns) {
		JScrollPane scrollPane = new JScrollPane();
		
		//表头


		//数据
//		vData.addElement("ccc");
		//模型
		importListModel = new DefaultTableModel(vData, vColumns);
	
		//表格
		importListTable = new JTable(importListModel){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		importListTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.getViewport().add(importListTable);
		importListTable.setFillsViewportHeight(true);
		importListTable.setBackground(color.MainFrameColor());
		importListTable.setFont(new Font("微软雅黑",Font.PLAIN,10));
		importListTable.getTableHeader().setFont(new Font("微软雅黑",Font.PLAIN,15));
		
//		importListTable.setBackground(color.LightGray());
//		importListTable.getTableHeader().setBackground(Color.gray);
		scrollPane.setBounds(0, 0, width, height);
		
		//
		setLayout(null);
		setBounds(x, y, width, height);
		add(scrollPane);
	}
	void setFontSize(int x){
		importListTable.setFont(new Font("微软雅黑",Font.PLAIN,x));
	}
	void addColumns(String s){
		VColumns.add(s);
	}
	void setTitleColor(Color c){
		importListTable.getTableHeader().setBackground(c);
	}
	void setContentColor(Color c){
		importListTable.setBackground(c);
	}
	void setFontColor(Color c){
		importListTable.getTableHeader().setForeground(c);
	}
	//new methods
	void addRow(Vector<String> v){
		importListModel.addRow(v);
		
	}
	void removeRow(int x){
		importListModel.removeRow(x);
	}
	
	void getValueAt(int row, int column){
		importListModel.getValueAt(row, column);
	}
	int  getRowCount(){
		return importListModel.getRowCount();
	}
	int  getSelectRow(){
		return importListTable.getSelectedRow();
	}
	void setRowHeight(int x){
		importListTable.setRowHeight(x);
	}
	void removeAllItem(){
		if (importListModel.getRowCount() > 0) {
			 for (int i = importListModel.getRowCount() - 1; i > -1; i--) {
			  importListModel.removeRow(i);
			 }
			}
	}
}
