import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        int num=0;
        String s;
        char x;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      s=sc.nextLine();
      System.out.println("Enter a Character: ");
      x=sc.next().charAt(0);
      for(int i=0;i<s.length();i++){
          char c= s.charAt(i);
          if(c==x) num++;
      }
      System.out.println(" Count of given Character's repeatition in the String is: "+num);
    }
}
