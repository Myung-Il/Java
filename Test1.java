import java.util.Scanner;

class List{
    public void make(int n, int m, int list[][]){

    }
}

public class Test1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] list1 = new int[n][m];
        for(int i=-1;i++<n;){
            for(int j=-1;j++<m;){
                list1[j][i] = sc.nextInt();
            }
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] list2 = new int[n][m];
        for(int i=-1;i++<n;){
            for(int j=-1;j++<m;){
                list2[b][a] = sc.nextInt();
            }
        }


    }
}
