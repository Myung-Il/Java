import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n, m, d, cnt, result;
    static int[][] arr;
    static List<Archer> archers = new ArrayList<>();
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();

        arr = new int[n][m];
        for (int yi=0;yi<n;yi++) {
            for (int xi=0;xi<m;xi++) {
                arr[yi][xi] = sc.nextInt();
            }
        }
        
        bfs(0);
        System.out.println(result);

    }
    
    /**
     * @param a : 아처가 마지막으로 배치된 위치
     */
    static void bfs(int a){
        if (a==3){
            int[][] copy = new int[n][m];
            for (int yi=0;yi<n;yi++) {
                for (int xi=0;xi<m;xi++) {
                    copy[yi][xi] = arr[yi][xi];
                }
            }

            int enemy = 45;
            while (enemy>0){
                for (Archer archer : archers){
                    int distance = Integer.MAX_VALUE;
                    archer.ex = -1;
                    archer.ey = -1;

                    for (int xi=0; xi<m; xi++){
                        for (int yi=n-1; yi>=0; yi--){
                            int temp;
                            if (copy[yi][xi]==1){
                                temp = dis(xi-archer.x, yi-archer.y);
                                if (temp>d) break;
                                if (distance>temp){
                                    distance = temp;
                                    archer.ex = xi;
                                    archer.ey = yi;
                                }
                            }
                        }
                    }
                }
                for (Archer archer : archers){
                    if (archer.ex != -1){
                        if (copy[archer.ey][archer.ex] == 1){
                            copy[archer.ey][archer.ex] = 0;
                            cnt++;
                        }
                    }
                }
                enemy = 0;
                for (int xi=0; xi<m; xi++) {
                    for (int yi=n-1; yi>=0; yi--) {
                        if (copy[yi][xi] == 1){
                            int move = yi+1;
                            if (move>=n)copy[yi][xi] = 0;
                            else {
                                copy[move][xi] = 1;
                                copy[yi][xi] = 0;
                                enemy++;
                            }
                        }
                    }
                }
            }
            result = Math.max(result, cnt);
            cnt = 0;
            return;
        }
        for (int xi=a; xi<m; xi++){
            archers.add(new Archer(xi, n));
            bfs(xi+1);
            archers.remove(archers.size()-1);
        }
    }

    public static int dis(int a, int b){
        return Math.abs(a) + Math.abs(b);
    }

    static class Archer{
        int x, y;
        int ex, ey;
        public Archer(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}