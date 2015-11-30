package Presentation;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WordLabel extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public WordLabel(String word,int x,int y,int width,int height) {
		this.setText(word);
		this.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,height));
		this.setBounds(x, y, width, height);
		this.setHorizontalAlignment(SwingConstants.CENTER);
//		setBackground(Color.blue);
//		setOpaque(true);
	}

}
