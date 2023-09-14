import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt()+1;
        int s1 = 0;
        for (int i=1;i<x;i++){
            s1 += i;
        }
        double s2 = Math.pow(s1, 2);
        int s3 = 0;
        for (double i=1;i<x;i++){
            s3 += Math.pow(i, 3);
        }

        System.out.println(s1);
        System.out.println((int)s2);
        System.out.println(s3);
    }
}