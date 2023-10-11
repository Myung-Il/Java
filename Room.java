import java.util.*;

public class Room {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위:0 바위:1 보:2");
		int n = sc.nextInt();

		int s = (int)(Math.random()*3);
		String o = "";
		if (n==0) {if (s==0) o = "com : 가위 /// 비김";if (s==1) o = "com : 가위 /// 졌음";if (s==2) o = "com : 가위 /// 이김";}
		if (n==1) {if (s==0) o = "com : 바위 /// 이김";if (s==1) o = "com : 바위 /// 비김";if (s==2) o = "com : 바위 /// 졌음";}
		if (n==2) {if (s==0) o = "com : 보 /// 졌음";if (s==1) o = "com : 보 /// 이김";if (s==2) o = "com : 보 /// 비김";}


		System.out.println(o);
	}
}