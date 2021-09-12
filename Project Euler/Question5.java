
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question5{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            int small=0,no=1;
            while(true)
            {
                int cnt=0;
                for(int i=1;i<=n;i++)
                {
                    if(no%i==0)
                        cnt++;
                    else
                        break;
                }
                if(cnt==n)
                {
                    small=no;
                    break;
                }
                no++;
            }
            System.out.println(small);
        }
    }
}