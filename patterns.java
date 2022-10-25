// Q1) 
// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for (int j=1; j<=5; j++){
//             System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }



// Q2)
// * * * * * 
// *       *
// *       *
// * * * * *
// public class patterns {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for (int j=1; j<=5; j++){
//                 if (i==1 || j==1 || i== 4 || j==5 ){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }


// Q3)
// *
// * *
// * * * 
// * * * *
// public class patterns{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//             System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// Q4)
// * * * * 
// * * *
// * *
// *
// public class patterns{
//     public static void main(String[] args) {
//         for (int i=4; i>=1;i--){
//             for (int j=i; j>=1;j--){
//                 System.out.print("* ");
//             }
//             System.err.println();
//         }
//     }
// }


// Q5)
// * 
// * *
// * * *
// * * * *
// public class patterns{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=(4-i);j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Q6)
// 1
// 12
// 123
// 1234
// 12345
// public class patterns{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// Q7)
// 12345
// 1234
// 123
// 12
// 1
// public class patterns{
//     public static void main(String[] args) {
//         for (int i = 0; i <= 4; i++) {
//             for (int j = 1; j <= 5-i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// Q8)
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// public class patterns{
//     public static void main(String[] args) {
//         int z = 1;
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < i+1; j++) {
//                 System.out.print(z+" ");
//                 z++;
//             }
//             System.out.println();
//         }
//     }
// }


// Q9)
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// public class patterns{
//         public static void main(String[] args) {
//             int z = 1;
//             for (int i = 1; i <= 5; i++) {
//                 for (int j = 1; j <= i; j++) {
//                     if ((i+j)%2==0){
//                         System.out.print("1 ");
//                     }else{
//                         System.out.print("0 ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }
//     }


// Q10)
// *             *
// * *         * * 
// * * *     * * *
// * * * * * * * * 
// * * * * * * * * 
// * * *     * * *  
// * *         * * 
// *             *
// public class patterns{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print("* ");
//             }
//             for (int j = 1; j <= 2*(4-i); j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int i = 4; i >= 1; i--) {
//             for (int j = 1; j <= i ; j++) {
//                 System.out.print("* ");
//             }
//             for (int j = 1; j <= 2*(4-i); j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// Q11)
//         * * * * *   
//       * * * * *  
//     * * * * * 
//   * * * * * 
// * * * * * 
// public class patterns{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5-i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Q12)
//     1  
//    2 2 
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
// public class patterns{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Q13)
//     1
//    212
//   32123
//  4321234
// 543212345
// public class patterns{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j > 1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// Q14)
//        *  
//      * * * 
//    * * * * *
//  * * * * * * * 
//  * * * * * * *
//    * * * * *  
//      * * *   
//        *
// public class patterns{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= 4-i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j < 2*i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         for (int i = 4; i >= 1; i--) {
//             for (int j = 1; j <= 4-i; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j < 2*i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


