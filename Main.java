import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        int cnt = 0;
        for (int i=0;i<n;i++){
            String w = sc.next();
            if (s.equals(w)){
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
}