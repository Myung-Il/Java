package Samsung_A_previous_exam;

import java.util.Scanner;


public class G17070 {
    static int n;
    static int ans;
    static int[][] arr;
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        dfs(1, 0, 0);
        System.out.println(ans);
    }
        
    public static void dfs(int x, int y, int t){
        if (x==n-1 && y==n-1){
            ans++;
            return;
        }

        switch (t) {
            case 0: if (x+1<n && arr[y][x+1]==0)dfs(x+1, y, 0); break;
            case 1: if (y+1<n && arr[y+1][x]==0)dfs(x, y+1, 1); break;
            case 2:
                if (x+1<n && arr[y][x+1]==0)dfs(x+1, y, 0);
                if (y+1<n && arr[y+1][x]==0)dfs(x, y+1, 1);
                break;
        }
        if (x+1<n && y+1<n && arr[y][x+1]==0 && arr[y+1][x+1]==0 && arr[y+1][x]==0)dfs(x+1, y+1, 2);
    }
}
