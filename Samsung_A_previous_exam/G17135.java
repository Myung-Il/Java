package Samsung_A_previous_exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class G17135 {
    static int n, m, d, cnt, result;
    static int[][] arr;
    static List<Archer> archers = new ArrayList<>();
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 세로 열의 길이
        m = sc.nextInt(); // 가로 행의 길이
        d = sc.nextInt(); // 아처의 사거리

        arr = new int[n][m]; // 몬스터가 배치될 위치
        for (int yi=0;yi<n;yi++) { // 배치
            for (int xi=0;xi<m;xi++) {
                arr[yi][xi] = sc.nextInt();
            }
        }
        
        bfs(0); // 아처의 위치에 따라서 얼마나 많은 적을 처치 할 수 있는지
        System.out.println(result); // 탐색하고 결과 값을 도출함

    }
    
    /**
     * @param a : 아처가 마지막으로 배치된 위치
     */
    static void bfs(int a){
        if (archers.size()==3){            // 아처를 전부 배치 했다면
            int[][] copy = new int[n][m];  // 적의 위치 배열의 복사본을 만들어준다
            for (int yi=0;yi<n;yi++) {     // 아처의 자리를 바꿔가면서 얼마나 많은 적을
                for (int xi=0;xi<m;xi++) { // 해치웠는지 알아야하기 때문에
                    copy[yi][xi] = arr[yi][xi]; // 아처 자리를 제외한 다른 조건들은
                }                               // 동일해야 된다
            }                                   // 원본을 수정하면 조건이 바뀌기에 복사본이 필요

            int enemy = 45;  // 얼마나 많은 적이 있는지 모르기 때문에 적당히 추정 수치를 적는다
            while (enemy>0){ // 해치울 적이 남아 있다면 계산을 시작한다
                for (Archer archer : archers){        // 각 아처를 불러온다
                    int distance = Integer.MAX_VALUE; // 아처와 가장 가까운 몬스터와의 거리
                    archer.ex = -1;                   // 그 몬스터의 x값 (행 값)
                    archer.ey = -1;                   // 그 몬스터의 y값 (열 값)

                    for (int xi=0; xi<m; xi++){        // 아처는 y가 고정되어 있으니 x를 기준으로 찾아본다
                        for (int yi=n-1; yi>=0; yi--){ // 아처는 n번째 줄에 있으니 n-1부터 거꾸로 찾아본다
                            int temp;                  // 몬스터와 아처의 거리를 기록할 변수
                            if (copy[yi][xi]==1){      // 탐색한 위치에 몬스터가 있다면
                                temp = dis(xi-archer.x, yi-archer.y); // 거리를 재본다 ( 아래 dis함수가 있음 )
                                if (temp>d) break;   // 몬스터와의 거리가 아처의 사거리보다 멀리 있다면 다음 몬스터를 볼 필요도 없음
                                if (distance>temp){  // 그게 아니라 가깝다면 심지어 기존의 거리 중에서 가장 가깝다면
                                    distance = temp; // 거리 갱신
                                    archer.ex = xi;  // 몬스터의 x 좌표 갱신
                                    archer.ey = yi;  // 몬스터의 y 좌표 갱신
                                }
                            }
                        }
                    }
                }
                for (Archer archer : archers){ // 각 아처에 대해서
                    if (archer.ex != -1){      // 몬스터를 잡은 적이 있다면
                        if (copy[archer.ey][archer.ex] == 1){
                            copy[archer.ey][archer.ex] = 0; // 몬스터를 없애고
                            cnt++;                          // 잡은 횟수를 늘려준다
                        }
                    }
                }
                enemy = 0; // 적이 얼마나 남았는지 모르기 때문에 초기화 해준다
                for (int xi=0; xi<m; xi++) { // 몬스터가 아래로 움직이기 때문에 
                    for (int yi=n-1; yi>=0; yi--) { // 열을 단위로 봐줘야 한다
                        if (copy[yi][xi] == 1){     // 몬스터가 있다면
                            int move = yi+1;        // 아래로 한칸 옮겨주기 위해 다음 위치를 찾아준다
                            if (move>=n)copy[yi][xi] = 0; // 다음 위치가 벽을 넘는다면 몬스터를 없기만한다
                            else {                  // 허나 넘지않았다면
                                copy[move][xi] = 1; // 한 칸 옮겨서 추가하고
                                copy[yi][xi] = 0;   // 이전 위치에 것은 지워준다
                                enemy++;            // 적이 아직 있다는 소리니 적의 수를 증가 시켜준다
                            }
                        }
                    }
                }
            }
            result = Math.max(result, cnt); // 최종적으로 지금 아처가 처리한 수와 이전에 처리한 수를 비교한다
            cnt = 0;                        // 다음 계산을 위해서 수 세기를 초기화 해준다
            return;                         // 함수를 종료 시킨다
        }
        for (int xi=a; xi<m; xi++){         // 아처의 자리를 기록한다
            archers.add(new Archer(xi, n)); // 기록을 했다면 아처의 위치를 저장한다
            bfs(xi+1);                      // 다음 아처의 위치를 받어서 기록을 넘긴다
            archers.remove(archers.size()-1); // bfs에서 계산을 했으니 아처의 위치를 없애준다
        }
    }

    public static int dis(int a, int b){  // a와 b는 거리이기 때문에 절대값으로 감싼 다음 더해준다
        return Math.abs(a) + Math.abs(b); // 거리가 0보다 짧을 수 없기에 절대값을 씌워준다
    }

    static class Archer{
        int x, y;   // 아처의 위치
        int ex, ey; // 몬스터의 위치
        public Archer(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}