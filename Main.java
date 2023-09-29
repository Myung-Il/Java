import java.util.*;

public class Main {
    private static int n, k, ans;
    private static int[] l;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        
        l = new int[k];
        for (int i=0;i<k;i++){
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        Dfs(0);
        System.out.println(ans);
    }
    private static void Dfs(int z){
        if (z>n)return;
        if (z>ans)ans=z;
        for (int i=k-1;i>-1;i--){
            Dfs(z*10+l[i]);
        }
    }
}