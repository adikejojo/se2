package Presentation;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class infoWindow extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel title = new JLabel();
//	JLabel content = new JLabel();
	JEditorPane content = new JEditorPane();
	MyColor color = new MyColor();
	public infoWindow(String name,int x,int y,int width,int height) {
		// TODO Auto-generated constructor stub
		this.setBounds(x, y, width, height);
		this.setLayout(null);

		title.setBounds(0, 0, width, 30);
		title.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,20));
		content.setBounds(0, 30, width, height-30);
		content.setBackground(color.LightGray());
		content.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,20));
		content.setEditable(false);
		content.setOpaque(true);
		content.setForeground(Color.white);;
		this.add(content);
		this.add(title);
		title.setBackground(Color.gray);
		title.setOpaque(true);
		title.setText(name);
		title.setForeground(Color.white);
	}
	void setText(String s){
		content.setText(s);
	}
	void setTitleColor(Color c){
		title.setForeground(c);
	}
	void setContentColor(Color c){
		content.setForeground(c);
	}
}
