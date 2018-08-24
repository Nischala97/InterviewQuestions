import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javaSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count=0,n=0,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
	    sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
		//System.out.println("i="+i+" j= "+j+" sum= "+sum);
                if(sum<0) 
		{
//			System.out.println("i="+i+" j= "+j+" sum= "+sum);
			count++;
		}
            }
        }
        System.out.println(count);
    }
}
