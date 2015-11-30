package Presentation;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JTextField;

public class MyTextField extends JTextField{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyTextField(int x,int y,int width,int height) {
		MyColor mycolor = new MyColor();
		double ShrinkIndex = 38.0/50.0;
		this.setBounds(x, y, width, height);
		this.setFont(new Font("ËÎÌו", Font.BOLD, (int)(height*ShrinkIndex)));
//		System.out.println((int)(height*ShrinkIndex));
		this.setBorder(new MyLineBorder(Color.GRAY, 1, true));
		this.setBackground(mycolor.MainFrameColor());
//		setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
	}

}
