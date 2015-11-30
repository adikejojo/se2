package Presentation;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BackLabel extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	BackLabel(int x, int y, int width, int height){
		Icon back = new ImageIcon("src/picture/backGroundColor.png");
		this.setIcon(back);
		this.setBounds(x, y, width, height);
		this.setLayout(null);
	}
}
