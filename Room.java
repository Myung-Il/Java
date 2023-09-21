import java.io.*;
import java.util.*;

public class Room {
    public static void main(String[] args) throws Exception {
        // BufferedReader를 사용하여 표준 입력에서 데이터를 읽을 수 있도록 설정합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer를 사용하여 입력된 문자열을 공백으로 분리합니다.
        StringTokenizer token = new StringTokenizer(br.readLine());

        // StringTokenizer에서 분리된 문자열을 정수로 변환하여 변수 a와 b에 저장합니다.
        int a = Integer.parseInt(token.nextToken()); // 첫 번째 정수를 변수 a에 저장
        int b = Integer.parseInt(token.nextToken()); // 두 번째 정수를 변수 b에 저장

        // 변수 a와 b의 합을 계산하고 출력합니다.
        System.out.println(a + b);
    }
}