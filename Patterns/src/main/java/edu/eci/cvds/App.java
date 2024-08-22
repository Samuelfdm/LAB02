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
            String[] nombres = args[0].split(",");
            if (nombres.length > 0){
                saludo = "Hello " + String.join(" ", nombres) + "!";
            } else {
                saludo = "Hello " + nombres[0] + "!";
            }
        }
        System.out.println(saludo);
    }
}
