import java.util.*;

class Add {
	public int a;
	public int b;

	public int Add_ab(){
		return a + b;
	}
}

public class lesson {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
		int as = 1;
		int[] n = new int[3];
        for(int i=0;i<3;i++) {
			n[i] = as++;
			System.out.println(Arrays.toString(n)+" "+i);
		}
		// n.a = 6;
		// n.b = 7;

		// System.out.println(n.Add_ab());
		
    }
}