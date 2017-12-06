import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		//set frame height and width
		int frameWidth = 200;
		int frameHeight = 200;
		
		//Set frame location x and y value in order to set it in screen center
		int frameX = (int) (userWindowWidth() / 2) - (frameWidth / 2);
		int frameY = (int) (userWindowHeight() / 2) - (frameHeight / 2);
		
		JFrame myFrame = new JFrame("Gabriel J. Rosa Rios");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(frameX, frameY);
		myFrame.setSize(frameWidth,frameHeight);
		
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
	}
	
	public static double userWindowWidth() {
		double screenW = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		return screenW;
	}
	
	public static double userWindowHeight() {
		double screenH = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		return screenH;
	}
}