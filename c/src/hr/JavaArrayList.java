/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;
import java.util.*;
/**
 *
 * @author test
 */
public class JavaArrayList 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        ArrayList[] lst=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter d:");
            int d=s.nextInt();
            lst[i]=new ArrayList(d);
            for(int j=0;j<d;j++) lst[i].add(s.nextInt());
        }
        int q=s.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=s.nextInt();
            int y=s.nextInt();
            try{
               System.out.println(lst[x-1].get(y-1));
            }
                    catch(Exception e){
                System.out.println("ERROR!");}
        }
    }
}