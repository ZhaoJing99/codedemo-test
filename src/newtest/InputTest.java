package newtest;
import java.util.*;

/**
 * Created by zhaojing on 2019-07-16.
 */
public class InputTest {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            //get first input
            System.out.println("What is your name?");
            String name = in.nextLine();

            //get second input
            System.out.println("How old are you?");
            int age = in.nextInt();

            //display the output
            System.out.println("Hello," + name +",next year you will be " +(age +1));


    }
}
