package LMS.presentation;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import LMS.bussinesslogic.SendReceipt;



public class CourierRecieptUI extends JPanel implements ActionListener,ItemListener{
	/**
	 * 
	 */
	public JFrame frame;
	private SendReceipt sendreceipt = new SendReceipt();
	private JTextField text_nameS;
	private JTextField text_phoneS;
	private JTextField text_addressS;
	private JTextField text_nameR;
	private JTextField text_phoneR;
	private JTextField text_addressR;
	private JTextField text_weight;
	private JTextField text_volume;
	private JTextField text_content;
	private JTextField text_packFee;
	JButton btn_commitS = new JButton("\u63D0\u4EA4");
	private static final long serialVersionUID = 1L;
	public CourierRecieptUI() {
		initialize();
	}

	/**
	 * init
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("物流管理系统");
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		Choice choice_operation = new Choice();
		choice_operation.setBounds(41, 8, 78, 23);
		choice_operation.add("寄件单");
		choice_operation.add("收件单");
		choice_operation.addItemListener(this);
		System.out.println(choice_operation.getSelectedItem());
		frame.getContentPane().add(choice_operation);
		
		Label label = new Label("\u64CD\u4F5C");
		label.setBounds(10, 8, 69, 23);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("\u5F53\u524D\u64CD\u4F5C\u4EBA\uFF1A");
		label_1.setBounds(526, 8, 69, 23);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u5FEB\u9012\u5458");
		label_2.setBounds(605, 8, 45, 23);
		frame.getContentPane().add(label_2);
		
		
		sendPanel.setBounds(10, 51, 664, 372);
		frame.getContentPane().add(sendPanel);
		sendPanel.setLayout(null);
		
		text_nameS = new JTextField();
		text_nameS.setBounds(81, 71, 156, 21);
		sendPanel.add(text_nameS);
		text_nameS.setColumns(10);
		
		JLabel sendtitleLabel = new JLabel("\u5BC4\u4EF6\u5355\u4FE1\u606F\u8F93\u5165");
		sendtitleLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		sendtitleLabel.setBounds(10, 10, 123, 33);
		sendPanel.add(sendtitleLabel);
		
		JLabel label_nameS = new JLabel("\u5BC4\u4EF6\u4EBA");
		label_nameS.setBounds(10, 74, 54, 15);
		sendPanel.add(label_nameS);
		
		JLabel label_phoneS = new JLabel("\u7535\u8BDD");
		label_phoneS.setBounds(10, 105, 54, 15);
		sendPanel.add(label_phoneS);
		
		JLabel label_addressS = new JLabel("\u5730\u5740");
		label_addressS.setBounds(10, 136, 54, 15);
		sendPanel.add(label_addressS);
		
		text_phoneS = new JTextField();
		text_phoneS.setColumns(10);
		text_phoneS.setBounds(81, 102, 156, 21);
		sendPanel.add(text_phoneS);
		
		text_addressS = new JTextField();
		text_addressS.setColumns(10);
		text_addressS.setBounds(81, 133, 156, 21);
		sendPanel.add(text_addressS);
		
		text_nameR = new JTextField();
		text_nameR.setColumns(10);
		text_nameR.setBounds(81, 195, 156, 21);
		sendPanel.add(text_nameR);
		
		text_phoneR = new JTextField();
		text_phoneR.setColumns(10);
		text_phoneR.setBounds(81, 226, 156, 21);
		sendPanel.add(text_phoneR);
		
		text_addressR = new JTextField();
		text_addressR.setColumns(10);
		text_addressR.setBounds(81, 257, 156, 21);
		sendPanel.add(text_addressR);
		
		JLabel label_nameR = new JLabel("\u6536\u4EF6\u4EBA");
		label_nameR.setBounds(10, 198, 54, 15);
		sendPanel.add(label_nameR);
		
		JLabel label_phoneR = new JLabel("\u7535\u8BDD");
		label_phoneR.setBounds(10, 229, 54, 15);
		sendPanel.add(label_phoneR);
		
		JLabel label_addressR = new JLabel("\u5730\u5740");
		label_addressR.setBounds(10, 260, 54, 15);
		sendPanel.add(label_addressR);
		
		JLabel label_weight = new JLabel("\u91CD\u91CF");
		label_weight.setBounds(345, 74, 54, 15);
		sendPanel.add(label_weight);
		
		JLabel label_volume = new JLabel("\u4F53\u79EF");
		label_volume.setBounds(345, 105, 54, 15);
		sendPanel.add(label_volume);
		
		JLabel label_content = new JLabel("\u5185\u5BB9");
		label_content.setBounds(345, 136, 54, 15);
		sendPanel.add(label_content);
		
		JLabel label_packFee = new JLabel("\u5305\u88C5\u8D39");
		label_packFee.setBounds(345, 167, 54, 15);
		sendPanel.add(label_packFee);
		
		Label label_ID = new Label("\u8BA2\u5355\u7F16\u53F7");
		label_ID.setBounds(345, 226, 69, 23);
		sendPanel.add(label_ID);
		
		Label label_IDField = new Label("");
		label_IDField.setBounds(409, 224, 156, 23);
		sendPanel.add(label_IDField);
		label_IDField.setText(sendreceipt.makeReceiptID());
		
		Choice choice_type = new Choice();
		choice_type.setBounds(409, 195, 156, 21);
		choice_type.add("经济快递");
		choice_type.add("标准快递");
		choice_type.add("特快快递");
		sendPanel.add(choice_type);
		
		Label label_type = new Label("\u5FEB\u9012\u7C7B\u578B");
		label_type.setFont(new Font("SimSun-ExtB", Font.PLAIN, 12));
		label_type.setBounds(345, 195, 69, 23);
		sendPanel.add(label_type);
		
		text_weight = new JTextField();
		text_weight.setColumns(10);
		text_weight.setBounds(409, 71, 156, 21);
		sendPanel.add(text_weight);
		
		text_volume = new JTextField();
		text_volume.setColumns(10);
		text_volume.setBounds(409, 102, 156, 21);
		sendPanel.add(text_volume);
		
		text_content = new JTextField();
		text_content.setColumns(10);
		text_content.setBounds(409, 133, 156, 21);
		sendPanel.add(text_content);
		
		text_packFee = new JTextField();
		text_packFee.setColumns(10);
		text_packFee.setBounds(409, 164, 156, 21);
		sendPanel.add(text_packFee);
		

		btn_commitS.setBounds(561, 339, 93, 23);
		btn_commitS.addActionListener(this);
		sendPanel.add(btn_commitS);
		
		
		receivePanel.setBounds(10, 51, 664, 372);
		frame.getContentPane().add(receivePanel);
		receivePanel.setLayout(null);
		
		JLabel receivetitleLabel = new JLabel("\u6536\u4EF6\u5355\u4FE1\u606F\u8F93\u5165");
		receivetitleLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		receivetitleLabel.setBounds(10, 10, 123, 33);
		receivePanel.add(receivetitleLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 35, 664, 14);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 429, 653, 2);
		frame.getContentPane().add(separator_1);
	}
	Panel sendPanel = new Panel();
	Panel receivePanel = new Panel();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn_commitS){
			System.out.println(text_nameS.getText());
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getItem() == "寄件单"){
			sendPanel.setVisible(true);
			receivePanel.setVisible(false);
		}
		if(e.getItem() == "收件单"){
			sendPanel.setVisible(false);
			receivePanel.setVisible(true);
		}
	}
}



