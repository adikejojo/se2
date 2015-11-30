package Presentation;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class SearchByDatePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SimpleButton SearchButton = new SimpleButton("查 询", 440, 0, 60, 30);
	MyTextField beginDateText = new MyTextField(85, 3, 130, 25);
	MyTextField endDateText = new MyTextField(305, 3, 130, 25);
	WordLabel BeginDate = new WordLabel("开始日期",0,5,80,20);
	WordLabel EndDate = new WordLabel("结束日期",220,5,80,20);
	public SearchByDatePanel(int x,int y) {

		beginDateText.setBackground(Color.lightGray);
		endDateText.setBackground(Color.lightGray);
		setBounds(x, y, 560, 30);
		setLayout(null);
		setOpaque(false);
//		searchPanel.setVisible(false);
		add(BeginDate);
		add(EndDate);
		add(SearchButton);
		add(beginDateText);
		add(endDateText);
		SearchButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("开始日期:"+beginDateText.getText()+"结束日期:"+endDateText.getText());
			}
		});
	}
	
	void setColorOfTextField(Color c){
		beginDateText.setBackground(c);
		endDateText.setBackground(c);
	}
	void setColorOfText(Color c){
		beginDateText.setForeground(c);
		endDateText.setForeground(c);
		BeginDate.setForeground(c);
	}
	
}
