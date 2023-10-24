import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        int a = s1.length()+1;
        int b = s2.length()+1;
        int c = s3.length()+1;

        int[][][] arr = new int[a][b][c];
        for(int i=1;i<a;i++){
            for(int j=1;j<b;j++){
                for(int k=1;k<c;k++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)&&s2.charAt(j-1)==s3.charAt(k-1))arr[i][j][k] = arr[i-1][j-1][k-1]+1;
                    else{
                        int[] l = {arr[i][j-1][k],arr[i][j][k-1]};
                        int max = arr[i-1][j][k];
                        for(int elm:l) if(elm>max) max = elm;
                        arr[i][j][k] = max;
                    }
                }
            }
        }
        System.out.println(arr[a-1][b-1][c-1]);
    }
}
// abcdefghijklmn
// bdefg
// efg