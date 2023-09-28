import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        int[] la = new int[a];
        for (int i=0;i<a;i++){
            la[i] = sc.nextInt();
        }

        int[] lb = new int[b];
        for (int i=0;i<b;i++){
            lb[i] = sc.nextInt();
        }

        Arrays.sort(la);
        Arrays.sort(lb);
        int n = 0,m = 0;
        StringBuilder str = new StringBuilder();
        while (n<a && m<b){
            if (la[n]<lb[m]){
                str.append(la[n++]+" ");
            }else{
                str.append(lb[m++]+" ");
            }
        }
        while (n<a){
            str.append(la[n++]+" ");
        }while (m<b){
            str.append(lb[m++]+" ");
        }
    System.out.println(str.toString());
    }
}