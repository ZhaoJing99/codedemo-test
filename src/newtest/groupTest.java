package newtest;
import java.util.*;
/**
 * Created by zhaojing on 2019-07-17.
 */
public class groupTest {

    public static void main(String[] args) {
       /* int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }

        //java index exception test
        //System.out.println("a = " + a[5]);

        // foreach 循环处理
        for (int element :a) System.out.println("a = " + element);

        **/

       //Test arraycopy
        int[] smallTest = new int[8];

        for (int j= 0;j<8;j++){
            smallTest[j] = (j+1)*3;
            System.out.println("smalltest"+(j+1)+": "+smallTest[j]);
        }

        int[] luckyNum = new int[12];

        for (int k = 0;k<12;k++){
            luckyNum[k] = (k+1)*1013;
            System.out.println("luckyNum"+(k+1)+": "+luckyNum[k]);
        }

        System.arraycopy(smallTest,3,luckyNum,4,3);
        for(int element:luckyNum)
            System.out.println("luckyNum: "+element);


    }
}
