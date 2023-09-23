import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] list = new int[n];
        for (int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }
        int b,c;
        b = sc.nextInt();
        c = sc.nextInt();

        long cnt = n;
        for (int i=0;i<n;i++){
            int af = list[i]-b;
            if (af>0){
                if (af%c>0){
                    cnt++;
                }
                cnt += af/c;
            }
        }
        System.out.println(cnt);
    }
}