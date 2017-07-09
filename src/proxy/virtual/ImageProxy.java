package proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	
	ImageIcon image;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url) {
		imageURL = url;
	}

	@Override
	public int getIconHeight() {
		if(image!=null){
			return image.getIconHeight();
		}else{
			return 800;
		}
	}

	@Override
	public int getIconWidth() {
		if(image!=null){
			return image.getIconWidth();
		}else{
			return 800;
		}
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (image!=null) {
			image.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading image, please wait...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
							image = new ImageIcon(imageURL, "Sunset");
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}//fim retrieving
		}
	}

}
