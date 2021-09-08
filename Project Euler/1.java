import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        long f,s,th;
        for(int a0 = 0; a0 < t; a0++)
	{
            long n = in.nextInt();
            long sum=0;
            f=(n-1)/3;
            s=(n-1)/5;
            th=(n-1)/15;
            sum=3*(f*(f+1)/2)+5*(s*(s+1)/2)-15*(th*(th+1)/2);
            System.out.println(sum);
        }
    }
}
