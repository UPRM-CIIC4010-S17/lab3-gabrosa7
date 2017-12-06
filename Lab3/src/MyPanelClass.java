import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
//                        int ovalWidth = 55;
//                        int ovalHeight = 55;
                        int rectangleWidth = 200;
                        int rectangleHeight = 110;
                        int centralizeX = (int) (x2/2) - (rectangleWidth/2);
                        int centralizeY = (int) (y2/2) - (rectangleHeight/2);
 
                        //Paint the background
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw a border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a second interior border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
//                        
//                        //Draw a diagonal line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                      //Draw a second diagonal line
//                        g.setColor(Color.RED);
//                        g.drawLine(x2, y1, x1, y2);
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((x2/2) - (ovalWidth/2) , (y2/2) - (ovalHeight/2), ovalWidth, ovalHeight);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);                       
                       
                        g.setColor(Color.WHITE);
                        g.fillRect(centralizeX , centralizeY, 200, 140);
                        g.setColor(Color.RED);
                        g.fillRect(centralizeX, centralizeY, 200, 28);
                        g.setColor(Color.RED);
                        g.fillRect(centralizeX, centralizeY + 56, 200, 28);                        
                        g.setColor(Color.RED);
                        g.fillRect(centralizeX, centralizeY + 112, 200, 28);
                        
                        Polygon p = new Polygon();
                        p.addPoint(centralizeX , centralizeY);
                        p.addPoint(centralizeX + 115, centralizeY + 70);
                        p.addPoint(centralizeX, centralizeY + 140);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(centralizeX + 20, centralizeY + 68);
                        p2.addPoint(centralizeX + 36, centralizeY + 68);
                        p2.addPoint(centralizeX + 42, centralizeY + 53);
                        p2.addPoint(centralizeX + 48, centralizeY + 68);
                        p2.addPoint(centralizeX + 64, centralizeY + 68);
                        p2.addPoint(centralizeX + 51, centralizeY + 78);
                        p2.addPoint(centralizeX + 56, centralizeY + 93);
                        p2.addPoint(centralizeX + 42, centralizeY + 83);
                        p2.addPoint(centralizeX + 29, centralizeY + 93);
                        p2.addPoint(centralizeX + 33, centralizeY + 78);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
			}
}