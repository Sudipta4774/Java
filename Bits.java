import java.util.*;
public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        System.out.print("Enter The Position : ");
        int m = sc.nextInt();
        int bitMask = 1<<m;
        int newNumber = bitMask | n;
        System.out.print("The Number Is : "+ newNumber);
        sc.close();

    }
}
