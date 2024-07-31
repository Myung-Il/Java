package Samsung_A_previous_exam;

import java.util.ArrayList;
import java.util.Scanner;

public class G16637 {
    @SuppressWarnings("resource")
    public static void Main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();

        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String> symbol = new ArrayList<String>();
        for (int i=0;i++<n;){
            if (i%2==0)num.add(Integer.valueOf(s.charAt(i)));
            else symbol.add(String.valueOf(s.charAt(i)));
        }
        System.out.println("Numbers: " + num);
        System.out.println("Symbols: " + symbol);
    }
}
