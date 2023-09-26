import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()){
            int s = 1,cnt = 1;
            int n = sc.nextInt();
            while ((s %= n)!=0){
                s = s*10+1;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}