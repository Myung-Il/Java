package Foundation;

public class Condition {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a<b){
            System.out.println(true);
        }
        
        // 중복 변수 안됨
        String A = "희희";
        String B = "희희";

        if (A.equals(B)){
            System.out.println(true);
        }
    }
}