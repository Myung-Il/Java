import java.io.*;
import java.util.Scanner;
class Test1
{
     public static void main(String[] args) throws IOException
     {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Scanner scan = new Scanner(System.in);  // 한줄안에 여러 자료형이나 별개의 데이터가

                                                                     //있을경우각각 따로 읽을수 있다.
          String name;
          char gender;
          int age;
          double tall;

          System.out.print("Input name and age:");
          name = scan.next();                              // scanf(%d %s %c)의 대용으로 사용
          age = scan.nextInt();

          System.out.print("Input gender :");
          gender = (char)System.in.read();
          System.in.read();                
          System.in.read();     
 
          System.out.print("Input tall :");
          tall = Double.parseDouble(br.readLine());
         
          System.out.println("이름 : "+name);
          if(gender == 'M')
          {
               System.out.println("성별 : 남자");
          }
          else if(gender == 109)
          {
               System.out.println("성별 : 남자");
          }
          else
          {
               System.out.println("성별 : 여자");
          }
          System.out.println("나이 : "+age);
          System.out.println("신장 : "+tall);
     }
}