package Presentation;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Button extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Button(int y,String address,String addressHL){
		this.setBounds(0, y, 200, 50);
		Icon Icon = new ImageIcon(address);
		Icon EnterIcon = new ImageIcon(addressHL);
		this.setIcon(Icon);
		this.addMouseListener(new MouseListener() {
			
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
				setIcon(Icon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				setIcon(EnterIcon);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
