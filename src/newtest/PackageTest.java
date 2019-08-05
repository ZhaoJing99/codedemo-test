package newtest;
import com.horseman.corejava.*;
import java.util.*;
/**
 * Created by zhaojing on 2019-08-01.
 */
public class PackageTest {

    public  static void main(String args[]){

        Employee harry = new Employee("Harry",15000,1990,1,1);

        harry.raiseSalary(5);

        System.out.println("name = "+ harry.getName() + " , salary = " + harry.getSalary() +" , hireday = " + harry.getHireDay());
    }

}
