package Presentation;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageSetter extends ImageIcon{
	
	 /**
	 * ���ڻ�ȡһ��ָ����С��ͼƬ��icon
	 * new ImageSetter(String path, int width, int height).getNewIcon  ����Get��������ܻ��Icon
	 */
	private static final long serialVersionUID = 1L;
	String Path;
	int Width;
	int Height;
	ImageIcon icon;
	public ImageSetter(String path, int width, int height) {
		icon = new ImageIcon(path);
		Image newImage = icon.getImage();
		newImage = newImage.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		icon.setImage(newImage);
	}
	ImageIcon getNewIcon (){
		return icon;
	}
}
