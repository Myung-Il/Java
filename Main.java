import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000-sc.nextInt();

        int cnt = 0;
        while (n!=0){
            if (n>=500){
                n-=500;
            }else if (n>=100){
                n-=100;
            }else if (n>=50){
                n-=50;
            }else if (n>=10){
                n-=10;
            }else if (n>=5){
                n-=5;
            }else if (n>=1){
                n-=1;
            }
            cnt+=1;
        }
        System.out.println(cnt);
    }
}