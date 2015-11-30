package Presentation;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SimpleButton extends JLabel{

	/**
	 * 简单的按钮类
	 */
	private static final long serialVersionUID = 1L;
	MyColor color = new MyColor();
	public SimpleButton(String text,int x,int y,int width,int height) {
		setBounds(x, y, width, height);
		setText(text);
		setBackground(color.ButtonPink());
		setOpaque(true);
		setFont(new Font("微软雅黑",Font.PLAIN,20));
		setForeground(Color.white);
		setHorizontalAlignment(SwingConstants.CENTER);
		Cursor c= Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
		setCursor(c);
		
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				setBackground(color.ButtonPink());
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				setBackground(new Color(165,42,42));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				setBackground(color.ButtonPink());
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				setBackground(new Color(198,163,163));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ouch");
			}
		});
		
	}
}
