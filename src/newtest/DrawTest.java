package newtest;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by zhaojing on 2019-08-20.
 */
public class DrawTest {
    public static void main(String[] args){

        DrawFrame drawFrame = new DrawFrame();
        drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawFrame.setVisible(true);
    }
}

class DrawFrame extends JFrame{
    public DrawFrame(){

    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();

    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;
    setLocation(screenWidth/4,screenHeight/4);
    setTitle("DrawFrame");
    setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    DrawPanel panel = new DrawPanel();
    add(panel);
    }
    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 400;
}

class DrawPanel extends JPanel{
    public void paintComponent(Graphics a){
    super.paintComponent(a);
    Graphics2D a1 = (Graphics2D) a;

    double leftX = 100;
    double topY = 100;
    double width = 200;
    double height = 150;
    //draw a rectangle
    Rectangle2D rect = new Rectangle2D.Double(leftX,topY,width,height);
    a1.draw(rect);
    //draw a ellipse
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        a1.draw(ellipse);
    //draw a diagonal line
        a1.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));
    //draw a circle
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
        a1.draw(circle);
    }
}