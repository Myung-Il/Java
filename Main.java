import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stk = new Stack<>();
        for (int i=0;i<n;i++){
            switch (sc.nextInt()){
                case 1:stk.push(sc.nextInt());break;
                case 2:sb.append((stk.empty()?-1:stk.pop())+"\n");break;
                case 3:sb.append(stk.size()+"\n");break;
                case 4:sb.append((stk.empty()?1:0)+"\n");break;
                case 5:sb.append((stk.empty()?-1:stk.peek())+"\n");break;
            }
        }
        System.out.println(sb.toString());
    }
}