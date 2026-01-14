import java.util.Scanner;

public class Method {
    public  static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
        //normal approach
//        Scanner input = new Scanner(System.in);
//        int num1, num2, sum;
//        System.out.println("Enter First Num:");
//        num1 = input.nextInt();
//        System.out.println("Enter Second Num:");
//        num2 = input.nextInt();
//        sum = num1 + num2;
//        System.out.println("The Sum is: " + sum);
        static int sum() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num1:");
            int num1 = sc.nextInt();
            System.out.println("Enter Num2:");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            return sum;
        }
    }