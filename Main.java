import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer list = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(list.nextToken());
        int k = Integer.parseInt(list.nextToken());

        int[] arr = new int[n];
        list = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(list.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}