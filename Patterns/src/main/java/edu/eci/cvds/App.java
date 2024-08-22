package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String saludo = "Hello World!";
        if (args.length > 0) {
            saludo = "Hello " + args[0];
        }
        System.out.println(saludo);
    }
}
