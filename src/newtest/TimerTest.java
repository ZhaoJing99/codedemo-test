package newtest;
import java.awt.* ;
import java.awt.event.*;
import java.util.* ;
import  javax.swing.*;
import javax.swing.Timer;
/**
 * Created by zhaojing on 2019-08-12.
 */
public class TimerTest {
    public static void main(String[] args){
    ActionListener listener = new TimePrinter();

    Timer t = new Timer(10000,listener);
    t.start();

    JOptionPane.showConfirmDialog(null,"Quit program?");
    System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        Date now = new Date();
        System.out.println("At the tone ,the time is " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}

