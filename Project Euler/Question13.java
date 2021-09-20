import java.io.*;
import java.util.*;
import java.math.*;
public class Question13{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger big = new BigInteger("0");
        for(int i = 0; i < n; i++) {
            big = big.add(sc.nextBigInteger());
        }
        System.out.println(big.toString().substring(0, 10));
    }
}
