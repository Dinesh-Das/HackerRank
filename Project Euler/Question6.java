import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question6
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long sumsq=0,sqsum=0,temp=0;
            int n = in.nextInt();
            for(int i=1;i<=n;i++)
            {
                sumsq+= i*i;
                temp+=i;
            }
            sqsum=temp*temp;
            System.out.println(sqsum-sumsq);
        }
        
    }
}
