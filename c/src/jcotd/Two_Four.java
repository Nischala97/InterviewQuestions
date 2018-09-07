/*
Given a string “JAVAJ2EE”, write java program to print this string in the below format?

J
J A
J A V
J A V A
J A V A J
J A V A J 2
J A V A J 2 E
J A V A J 2 E E
*/
package jcotd;
import java.util.*;

public class Two_Four 
{
    public static void main(String[] args)
    {
        String s = "JAVAJ2EE";
 
        char[] c = s.toCharArray();
 
        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(c[j]+" ");
            }
            System.out.println();
        }
    }
}
