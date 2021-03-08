package AdvancedJava;

public class Main
{
    public static void main(String args[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int y)->System.out.println(2*y);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
    }
}
