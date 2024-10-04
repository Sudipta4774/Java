import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter The Second Number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum Is : "+sum);
        sc.close(); 
    }
}

