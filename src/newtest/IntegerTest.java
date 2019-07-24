package newtest;

import java.util.*;
import java.math.*;

/**
 * Created by zhaojing on 2019-07-17.
 */
public class IntegerTest {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        Integer x = in.nextInt();

        System.out.println("What is the highest number you can draw?");
        Integer k = in.nextInt();

        BigInteger lotteryNum = BigInteger.valueOf(1);

        for(int  i=1;i<=x ;i++){
            lotteryNum = lotteryNum.multiply(BigInteger.valueOf(k - i +1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("1 of " + lotteryNum);
    }
}
