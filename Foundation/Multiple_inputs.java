package Foundation;

import java.io.*;
import java.util.*;

public class Multiple_inputs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer list = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(list.nextToken());
        int k = Integer.parseInt(list.nextToken());

        System.out.println(n);
        System.out.println(k);
    }
}