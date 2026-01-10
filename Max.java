import java.util.Scanner;

public class Max {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();
//basic method
//      int max = a;
//      if (b > max) {
//         max = b;
//      }
//      if (c > max) {
//         max = c;
//      }
//      System.out.println(max);
//   }
      //Advance method
      int max = Math.max(Math.max(a, b), c);

      System.out.println(max);
   }
}