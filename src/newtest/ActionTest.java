package newtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by zhaojing on 2019-08-23.
 */
public class ActionTest {
    public static void main (String[] args){
    ActionFrame  frame = new ActionFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    }
}


class ActionFrame extends JFrame{
    public ActionFrame(){
        setTitle("ActionTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        ActionPanel panel = new ActionPanel();
        add(panel);
    }

    public static final int   DEFAULT_WIDTH = 400;
    public static final int   DEFAULT_HEIGHT = 400;
}

class ActionPanel extends JPanel{
    public ActionPanel(){
        Action yellowAction = new ColorAction("Yellow",new ImageIcon("D://color//yellow.jpg"), Color.YELLOW);
        Action blueAction  = new ColorAction("Blue",new ImageIcon("D://color//blue.jpg"),Color.BLUE);
        Action redAction = new ColorAction("Red",new ImageIcon("D://color//red.jpg"),Color.RED);


        add(new JButton(yellowAction));
        add(new JButton(blueAction));
        add(new JButton(redAction));

        InputMap imap = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("ctrl Y"),"panel.yellow");
        imap.put(KeyStroke.getKeyStroke("ctrl B"),"panel.blue");
        imap.put(KeyStroke.getKeyStroke("ctrl R"),"panel.red");

        ActionMap amap = getActionMap();
        amap.put("panel.yellow",yellowAction);
        amap.put("panel.blue",blueAction);
        amap.put("panel.red",redAction);



    }




public class ColorAction extends AbstractAction{
    public ColorAction(String name,Icon icon, Color c){
        putValue(Action.NAME,name);
        putValue(Action.SMALL_ICON,icon);
        putValue(Action.SHORT_DESCRIPTION,"Set panel color to "+ name.toLowerCase());

        putValue("color",c);
    }

    public void actionPerformed(ActionEvent event){
        Color c  = (Color) getValue("color");
        setBackground(c);
    }
}
}