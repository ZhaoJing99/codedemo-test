package newtest;
import java.util.*;

/**
 * Created by zhaojing on 2019-07-24.
 */
public class EmployeeTest {

    public static void main(String[] args){
        Employee[] newstaff = new Employee[3];

        //构造器总是伴随着new 操作符的执行而被调用，而不能对一个已经存在的对象调用构造器来重新设置实例域，这样将会产生编译错误；
        newstaff[0] = new Employee("A",12000,1988,12,1);
        //会设置实例域
        // name = "A";
        //salary = 12000;
        //hirday = Dec 1,1988
        newstaff[1] = new Employee("B",15000,1990,12,11);
        newstaff[2] = new Employee("C",16000,1988,12,21);

        for(Employee e :newstaff) e.raiseSalary(5);
        for(Employee e:newstaff)  System.out.println("name = "+ e.getName() + " salary:"+e.getSalary() + " hireday:"+e.getHireDay());

        double Seconds = 10*365.25*24*60*60*1000;
        Date d = newstaff[1].getHireDay();
        d.setTime(d.getTime() - (long)(Seconds));// 注意：d 和newstaff[1].hireday 引用的同一个对象，对d做了调整会自动改变newstaff[1]的私有状态；
        System.out.println(d);

        for(Employee e:newstaff)  System.out.println("name = "+ e.getName() + " salary:"+e.getSalary() + " hireday:"+e.getHireDay());
    }
}
    class Employee{
        //包括1个构造器和4个方法; 构造器与类同名
        //构造器总是伴随着new 操作符的执行而被调用，而不能对一个已经存在的对象调用构造器来重新设置实例域，这样将会产生编译错误；
        public Employee(String n ,double s ,int year,int month,int day){

        //String name = n; 声明了局部变量name，只能在构造器内部访问，会遮蔽同名的实例域；
        name = n;
        salary = s;
        GregorianCalendar calander = new GregorianCalendar(year,month -1,day);
        hireday = calander.getTime();

        }
        //public 意味着任何类的任何方法都可以调用这个方法;
        public String getName(){
            return name;
        }

        public double getSalary(){
            return salary;
        }
        public Date getHireDay(){
            return hireday;
        }

        public void raiseSalary(double byPercent){ //byPercent 显式参数
            // double raise = this.salary * byPercent /100 ; this.salary += raise; this 表示隐式参数
            double raise = salary * byPercent/100;
            salary += raise;
        }

        //3个实例域，private 确保只有Employee类自身的方法能够访问这些实例域;如果使用关键字public 则变为允许程序中任何方法  进行读取和修改，会破坏封装；
        private String name;
        private double salary;
        private Date hireday;
    }

