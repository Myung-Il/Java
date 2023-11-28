import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = n/5;
        if (n==1 || n==3)System.out.println(-1);
        else{
            switch (n%5) {
                case 0:System.out.println(s);break;
                case 1:System.out.println(s+2);break;
                case 2:System.out.println(s+1);break;
                case 3:System.out.println(s+3);break;
                case 4:System.out.println(s+2);break;
            }
        }
    }
}