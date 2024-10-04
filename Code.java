
// public class Code {
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i=1;i<=n;i++) {
//             for(int j=1;j<=n-i;j++) {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=10;j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
// for practice 

// import java.util.Scanner;
// public class Code {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter The String : ");
//        String uppercase = sc.nextLine();
//        System.out.print("This Is The String Which Is Converts Into Lower : ");
//        System.out.print(uppercase.toLowerCase());
//        sc.close();
//     }
// }

// import java.util.Scanner;
// public class Code {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Your Marks In Math : ");
//         byte m1 = sc.nextByte();
//         System.out.print("Enter Your Marks In Chemistry : ");
//         byte m2 = sc.nextByte();
//         System.out.print("Enter Your Marks In Physics : ");
//         byte m3 = sc.nextByte();
//         float avg = (m1+m2+m3)/3.0f;
//         System.out.println("You Overall Percentage Is :"+avg);
//         if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
//             System.out.println("You Have Been Promoted");
//         }
//         else {
//             System.out.println("You Have Not Been Promoted");
//         }
//     }
// }

// import java.util.Scanner;
// public class Code {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The Number : ");
//         Byte num = sc.nextByte();
//         switch (num){
//             case 1 :
//                 System.out.println("It Is Monday");
//                 break;
//             case 2 :
//                 System.out.println("It Is Tuesday");
//                 break;
//             case 3 :
//                 System.out.println("It Is Wednesday");
//                 break;
//             case 4 :
//                 System.out.println("It Is Thursday");
//                 break;
//             case 5 :
//                 System.out.println("It Is Friday");
//                 break;
//             case 6 :
//                 System.out.println("It Is Saturday");
//                 break;
//             case 7 :
//                 System.out.println("It Is Sunday");
//                 break;
//         }
//         sc.close();
//     }
// }
// import java.util.Scanner;
// public class Code {
//     public static void main(String[] args) {
//         // int a = 10;
//         // do {
//         //     System.out.println(a);
//         //     a++;
//         // } while(a<5);
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter The Number : ");
//         // int n = sc.nextInt();
//         // System.out.println("Odd Number : ");
//         // for(int i=0; i<n; i++) {
//         //     System.out.println(2*i+1);
//         // }
//         // sc.close();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter The Number : ");
//         int n = sc.nextInt();
//         System.out.println("Odd Number : ");
//         for(int i=n; i>0; i--) {
//             System.out.println(2*i+1);
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class Code {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        // for ( int i=n; i>=0; i--) {
        // for(int j=0;j<=i;j++) {
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }
        // sc.close();
        // int sum = 0;
        // System.out.println("Enter The Number : ");
        // int n = sc.nextInt();
        // for ( int i=0;i<n;i++) {
        // sum =sum + (2*i);
        // }
        // System.out.println("Sum Of Even number Is : ");
        // System.out.println(sum);
        // sc.close();
        // System.out.println("Enter The Number : ");
        // int n = sc.nextInt();
        // for ( int i=1; i<=10;i++){
        // System.out.println("The Result Is : ");
        // System.out.println(n*i);
        // }

        // Modified
        // System.out.println("Enter The Number : ");
        // int n = sc.nextInt();
        // System.out.println("The Result Is : ");
        // for ( int i=1; i<=10;i++){

        // System.out.printf("%d X %d = %d\n", n, i, n*i);
        // }

        // reverse multiplication

        // System.out.println("Enter The Number : ");
        // int n = sc.nextInt();
        // System.out.println("The Result Is : ");
        // for ( int i=10; i>=1;i--){

        // System.out.printf("%d X %d = %d\n", n, i, n*i);
        // }

        // factorial using for loop

        // System.out.println("Enter The Number : ");
        // int n = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <=n; i++) {
        //     fact = fact*i;
        // }
        // System.out.println(fact);

        // sum of multiplication

        // System.out.println("Enter The Number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // System.out.println("The Result Is : ");
        // for ( int i=1; i<=10;i++){
        //    sum = sum + n*i;
        // }
        // System.out.println(sum);
        // sc.close();
//     }
// }
