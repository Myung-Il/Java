import java.util.Scanner;

public class Room {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// int n = 0, s = 0;
		// while (n!=-1){
		// 	n = sc.nextInt();
		// 	s+=n;
		// }System.out.println("총합: "+s);

		int n = 0, s = 0;
		do{
			n = sc.nextInt();
			s+=n;
		}while (n!=-1);
		System.out.println("총합: "+s);
		
		// n = 0; s = 0;
		// for (;n!=-1;){
		// 	n = sc.nextInt();
		// 	s+=n;
		// }System.out.println("총합: "+s);

		// int s = 0;
		// for (int v = 0;v!=-1;){
		// 	s = s + v;
		// 	System.out.println("총합: "+s);
		// 	v = sc.nextInt();
		// }
	}
}