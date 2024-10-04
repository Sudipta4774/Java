import java.util.Scanner;
public class Sum3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter The First Number : ");
      int a = sc.nextInt();
      System.out.print("Enter The Second Number : ");
      int b = sc.nextInt();
      System.out.print("Enter The Third Number : ");
      int c = sc.nextInt();
      int sum = a+b+c;
      System.out.println("Sum Is : "+sum);
      sc.close();
    }
}
