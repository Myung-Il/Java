import java.io.*;
import java.util.*;

public class Room {
    public static void main(String[] args) throws IOException {
        int n = 5;
        for (int i=1;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                System.out.println(i+" "+j);
            }
        }
    }
}