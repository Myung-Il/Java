import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()+1;
        int m = 1;

        if (n>2){
            System.out.println(" ".repeat(n-2)+"*");
        }
        
        for (int i=3;i<n;i++){
            System.out.println(" ".repeat(n-i)+"*"+" ".repeat(m)+"*");
            m+=2;
        }
        System.out.println("*".repeat(n*2-3));
    }
}