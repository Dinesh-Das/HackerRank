import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    static long PF(long n)
    {
      long i=0,j;
        while(n%2==0)
        {
           n=n/2;
        } 
     if(n==1)
      {
        return 1;
      }
    for(i=3;i<=Math.sqrt(n);i=i+2)
    {
        while(n%i==0)
        {
            n=n/i;
        }
    }
    if(n>2)
        return n;
    else
        return (i-2);
    } 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long temp;
        for(int a0 = 0; a0 < t; a0++)
        {
            long n = in.nextLong();
            temp=Solution.PF(n);
            System.out.println(temp);      
        }
    }
}
