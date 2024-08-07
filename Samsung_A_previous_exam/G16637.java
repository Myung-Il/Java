package Samsung_A_previous_exam;

import java.util.ArrayList;
import java.util.Scanner;


public class G16637 {
    static int ans = Integer.MIN_VALUE;
    static ArrayList<Integer> num;
    static ArrayList<Character> symbol;
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();            // 개행문자 처리
        String s = sc.nextLine();

        num = new ArrayList<>();
        symbol = new ArrayList<>();

        for (int i=0; i<n; i++) { // 숫자와 연산자 구분
            if (i % 2 == 0)num.add(Character.getNumericValue(s.charAt(i)));
            else symbol.add(s.charAt(i));
        }

        dfs(0, num.get(0));
        System.out.println(ans);

    }
        
    // 연산자에 따른 계산
    public static int operation(char op, int a, int b){
        switch (op) {
            case '+':return a + b;
            case '-':return a - b; 
            default: return a * b;
        }
    }

    // 규칙
    public static void dfs(int deep, int sum){
        if (deep==symbol.size()){ // 최대 계산 횟수는 연산자의 수만큼
            ans = Math.max(ans, sum);
            return;
        }
        dfs(deep+1, operation(symbol.get(deep), sum, num.get(deep+1)));           // 이전 합과 현재의 값을 계산하고 다음으로 넘김
        if (deep+2 <= symbol.size()) dfs(deep+2, operation(symbol.get(deep), sum, // 괄호 계산 부분
            operation(symbol.get(deep+1), num.get(deep+1), num.get(deep+2))));    // 두 수를 먼저 계산한 다음 이전 합과 계산한다
    }
}
