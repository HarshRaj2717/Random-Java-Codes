import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.function.*;
import java.security.SecureRandom;


public class LearnJava
{
    // This is a single-line comment.
    /*
    There goes a multi-line comment
    */
    public static void main(String[] args)
    {
        /*
        OUTPUT

        System.out.println("hello world");
        System.out.printf("value of pi = %f\n", Math.PI);
        */

        /*
        INPUT
        
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Enter x : ");
        x = scanner.nextInt();
        System.out.printf("x = %d\n", x);
        */

        /*
        DECLARING A LONG

        long x = 11116054L;
        System.out.printf("x = %d\n", x);
        */

        /*
        MAKING A CONSTANT VARIABLE

        final int x = 12;
        */
        
        /*
        StringBuilder

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("will this ");
        stringbuilder.append("do the ");
        stringbuilder.append(scanner.next());
        String x = stringbuilder.toString();
        System.out.printf("x = %s\n", x);
        */

        /*
        ARRAYS

        int n = 10;
        int[] arr = new int[n];
        System.out.printf("length = %d\n", arr.length);
        */

        /*
        FOR LOOPS

        Mostly same as C but...

        int[] arr = [4,54,54,43]
        for (int i : arr)
        {
            System.out.printf("%d\n", i);
        }
        */
        
        // Switch works as C.
        // if, ()?():(), while and do while are like C.
        
        /*
        BREAKING LOOPS...

        a:
        for (int i = 0; i < 5; i++)
        {
            b:
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    System.out.println("hi");
                    break b;
                }
                break a;
            }
        }
        */

        /*
        INTEGER & STRING CONVERSION

        int n, m = 123;
        String a, b = "123";
        a = Integer.toString(m);
        n = Integer.parseInt(b);
        System.out.printf("a = %s\nn = %d\n", a, n);
        */

        // new keyword initiates a class.
    }
}