import java.util.*;

public class Main {
    static int a = 0;
    static int b = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fib(n);
        fibonacci(n);
        System.out.println(a);
        System.out.println(b);
    }
    public static int fib(int n) {
        if (n==1 || n==2){a++;return 1;}
        else return fib(n - 1) + fib(n - 2);
    }
    
    public static int fibonacci(int n) {
        int[] arr = new int[n+1]; 
        arr[1] = arr[2] = 1; 

        for(int i=3;i<=n;i++){
            b++;
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}