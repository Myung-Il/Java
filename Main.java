import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static int ans = Integer.MIN_VALUE;
    static ArrayList<Integer> num;
    static ArrayList<Character> symbol;
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        num = new ArrayList<>();
        symbol = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (i % 2 == 0)num.add(Character.getNumericValue(s.charAt(i)));
            else symbol.add(s.charAt(i));
        }

        dfs(0, num.get(0));
        System.out.println(ans);

    }
        
    public static int operation(char op, int a, int b){
        switch (op) {
            case '+':return a + b;
            case '-':return a - b; 
            default: return a * b;
        }
    }
    public static void dfs(int deep, int sum){
        if (deep==symbol.size()){
            ans = Math.max(ans, sum);
            return;
        }
        dfs(deep+1, operation(symbol.get(deep), sum, num.get(deep+1)));
        if (deep+2 <= symbol.size()) dfs(deep+2, operation(symbol.get(deep), sum,
            operation(symbol.get(deep+1), num.get(deep+1), num.get(deep+2))));
    }
}
