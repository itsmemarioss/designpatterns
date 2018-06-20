package structural.proxy.virtual;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(600, 600);

		URL url = new URL("https://c.tadst.com/gfx/750w/sunrise-sunset-sun-calculator.jpg");
		Icon icon = new ImageProxy(url);
		
		frame.getContentPane().add(new JLabel(icon));
		
		//5. Show it.
		frame.setVisible(true);
		
	}

}
