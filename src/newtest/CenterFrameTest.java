package newtest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zhaojing on 2019-08-16.
 */
public class CenterFrameTest {
    public static void main(String[] args) {
        CenterFrame centerFrame = new CenterFrame();
        centerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centerFrame.show();

    }

}
class CenterFrame extends JFrame{
    public CenterFrame(){
        //get screen dimensions

        Toolkit  kit =  Toolkit.getDefaultToolkit();
        Dimension screenSize   = kit.getScreenSize();

        int  screenWidth = screenSize.width;
        int  screenHight = screenSize.height;

        setSize(screenWidth/2,screenHight/2);
        setLocation(screenHight/4,screenWidth/4);

        Image img = kit.getImage("D://Jellyfish.jpg");
        setIconImage(img);
        setTitle("CenterFrame");


    }
        }