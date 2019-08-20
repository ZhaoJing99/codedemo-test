package newtest;

import sun.java2d.pipe.SpanShapeRenderer;

import javax.swing.*;

/**
 * Created by zhaojing on 2019-08-16.
 */
public class SimpleFrameTest {

    public static void main(String[] args){
    SimpleFrame simpleFrame = new SimpleFrame();
    simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭框架时的响应动作；
    simpleFrame.show();

       // simpleFrame.setVisible(true);
    simpleFrame.setLocationRelativeTo(null); //设置窗体的相对位置。null，代表没有相对的其他窗体，因此就占据屏幕中间
    }
}

class SimpleFrame extends JFrame{

    public SimpleFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HIGHT);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HIGHT = 200;
}