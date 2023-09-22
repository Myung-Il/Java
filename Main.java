import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        List<String> l = new ArrayList<>();
        for (int i=1;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                StringBuilder front = new StringBuilder(s.substring(0, i));
                StringBuilder middle = new StringBuilder(s.substring(i, j));
                StringBuilder back = new StringBuilder(s.substring(j));

                String f_r = front.reverse().toString();
                String m_r = middle.reverse().toString();
                String b_r = back.reverse().toString();
                l.add(f_r+m_r+b_r);
            }
        }
        Collections.sort(l);
        System.out.println(l.get(0));
    }
}