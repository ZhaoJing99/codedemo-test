package newtest;
import java.util.*;
import java.lang.reflect.*;

/**
 * Created by zhaojing on 2019-08-08.
 */
public class ReflectionTest {
    public static void main (String[] args){

        String name ;
        if (args.length>0)
            name = args[0];
        else {
            Scanner  in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            System.out.print("class: " + name);
            if(supercl != null && supercl != Object.class)
                System.out.print("extends" + supercl.getName());

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
        //System.exit(0) 正常退出程序，System.exit(1)或者说非0表示非正常退出程序。
    }


public static void printConstructors(Class cl){

    Constructor[] constructors= cl.getDeclaredConstructors();

    for (Constructor c:constructors)
    {
        String name = c.getName();
        System.out.print(" "+ Modifier.toString(c.getModifiers()));
        System.out.print(" " + name +"(");

        Class[] paramTypes = c.getParameterTypes();
        for (int j = 0;j < paramTypes.length;j++){
            if(j>0) System.out.print(". ");
            System.out.print(paramTypes[j].getName());
        }
        System.out.println(");");
    }
}

public static void printMethods(Class cl) {

    Method[] method = cl.getDeclaredMethods();

    for (Method m:method)
    {
        Class retType = m.getReturnType();
        String name = m.getName();
        System.out.print(" " + Modifier.toString(m.getModifiers()));
        System.out.print(" "+name+"(");

        Class[] paramTypes = m.getParameterTypes();
        for (int j = 0;j < paramTypes.length;j++){
            if(j>0) System.out.print(". ");
            System.out.print(paramTypes[j].getName());
        }
        System.out.println(");");
    }
}

public static void printFields(Class cl){
    Field[] fields = cl.getDeclaredFields();

    for (Field n :fields){
        Class type = n.getType();
        String name = n.getName();
        System.out.print(" " + Modifier.toString(n.getModifiers()));
        System.out.println(" "+type.getName()+name+";");
    }
}

}