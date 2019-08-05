package newtest;

import sun.util.calendar.Gregorian;

import java.util.GregorianCalendar;
import java.util.*;
/**
 * Created by zhaojing on 2019-08-05.
 */
public class PersonTest {

    public static void main (String[] args){
        Person[] people = new Person[2];

        people[0] = new EmployeeofFactory("Harry",25000,1989,11,10);
        people[1] = new Student("David","Computer Science");

        for(Person p:people)
            System.out.println(p.getname()+ ", " + p.getDescribe()+".");
    }
}


abstract  class Person {
    public Person (String n){
        name = n;
    }

    public abstract String getDescribe();

    public String getname(){
        return name;
    }

    private String name;

}

class EmployeeofFactory extends Person{

    public EmployeeofFactory(String n ,double s,int year,int month,int day){
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year,month -1 ,day);
        hireDay = calendar.getTime();
    }

    public double getSalary(){
        return  salary;
    }

    public Date getHireday(){
        return hireDay;
    }

    public String getDescribe(){
        return String.format("an employee with a salary of $%.2f",salary);
    }

    public void raiseSalary(double bypercent){
        double raise = salary * bypercent /100;
        salary += raise;
    }
    private double salary ;
    private Date hireDay;
}

class Student extends Person {

    public  Student(String n,String m){
        super(n);
        major = m;
    }

    public String getDescribe(){
        return "a student major in " + major;
    }

    private String major;
}