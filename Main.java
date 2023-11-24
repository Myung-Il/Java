import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt()+1,m = sc.nextInt()+1;
        int[][] list = new int[n][m];
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                list[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        for (int cnt=0;cnt<k;cnt++){
            int y1 = sc.nextInt(),x1 = sc.nextInt(),y2 = sc.nextInt(),x2 = sc.nextInt();
            int sum = 0;

            for (;y1<=y2;y1++){
                for (int x=x1;x<=x2;x++){
                    sum += list[y1][x];
                }
            }
            System.out.println(sum);
        }
    }
}
// 2 3
// 1 2 4
// 8 16 32
// 3
// 1 1 2 3
// 1 2 1 2
// 1 3 2 3