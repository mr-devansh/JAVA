// Q1. print sum of all number between given range
// public class recursionOne {
//     public static void printNums(int i, int n, int sumy) {
//         if (i == n) {
//             sumy+=i;
//             System.out.println(sumy);
//             return;
//         }
//         sumy += i;
//         printNums(i+1, n, sumy);
//     }
//     public static void main(String[] args) {
//         printNums(1, 5, 0);
//     }
// }



// Q2. factorial
// public class recursionOne {
//     public static void fact(int n, int pro) {
//         if (n == 0) {
//             System.out.println(pro);
//             return;
//         }
//         pro*=n;
//         fact(n-1, pro);
//     }
//     public static void main(String[] args) {
//         fact(4, 1);
//     }
// }



// Q3. fibonacci series
// public class recursionOne {
//     public static void fib(int z, int a, int b) {
//         if (z==0) {
//             return;
//         }
//         int c = a+b;
//         System.out.print(c+" ");
//         fib(z-1, b, c);
//     }
//     public static void main(String[] args) {
//         System.out.print(0+" ");
//         System.out.print(1+" ");
//         fib(5, 0, 1);
//     }
// }


// Q4. x^n
// public class recursionOne {
//     public static void pow(int pro, int x, int n) {
//         if (n==0) {
//             System.out.println(pro);
//             return;
//         }
//         pro*=x;
//         pow(pro, x, n-1);
//     }
//     public static void main(String[] args) {
//         pow(1, 1, 0);
//     }
// }