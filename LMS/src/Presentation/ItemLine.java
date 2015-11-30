package Presentation;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemLine extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel title = new JLabel();
	private JLabel text = new JLabel();
	MyColor color = new MyColor();
	public ItemLine(int y,String name) {
		this.setLayout(null);
		this.setBounds(0, y, 850, 40);
		title.setBounds(30, 0, 220,40);
		text.setBounds(250, 0, 670, 40);
		Icon titleIcon = new ImageIcon("src/picture/left.png");
		Icon textIcon = new ImageIcon("src/pictire/top.png");
//		title.setIcon(titleIcon);
		title.setBackground(Color.gray);
		title.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,25));
		title.setOpaque(true);
		title.setForeground(Color.white);
		text.setOpaque(true);
		text.setBackground(color.LightGray());
		text.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,15));
		text.setForeground(Color.white);
//		text.setIcon(textIcon);
//		this.setVisible(true);
		this.add(text);
		this.add(title);
		setTitle(name);
	}
	void setText(String s){
		text.setText(s);
	}
	void setTitle(String str){
		title.setText(str);
	}
}
