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
public class JavaHashset 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) 
        {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<Object> set=new HashSet<>();
        for(int i=0;i<t;i++)
        {
            set.add(pair_left[i]+" "+pair_right[i]);
            //System.out.println("name1="+name1+" name2="+name2);
            System.out.println(set.size());
        }
        
    }
}
