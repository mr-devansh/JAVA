// Q1.tower of hanoi
// public class recursionTwo {
//     public static void hanoi(int n, String source, String helper, String destination) {
//         if (n == 1) {
//             System.out.println("transfer disk " + n + " from " + source + " to " + destination);
//             return;
//         }
//         hanoi(n - 1, source, destination, helper);
//         System.out.println("h1 passed");
//         System.out.println("transfer disk " + n + " from " + source + " to " + destination);
//         System.out.println("mid h1 h2");
//         hanoi(n - 1, helper, source, destination);
//         System.out.println("h2 passed");
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         hanoi(n, "S", "H", "D");
//     }
// }

// Q2. reverse string 
// public class recursionTwo {
//     public static void reverse(int n, String str) {
//         if (n<0) {
//             return;
//         }
//         System.out.print(str.charAt(n));
//         reverse(n-1, str);
//     }
//     public static void main(String[] args) {
//         String str = "dev";
//         int n = str.length()-1;
//         reverse(n, str);
//     }
// }

// Q3. first and last occurence of a element
// public class recursionTwo {
//     public static int f = -1;
//     public static int l = -1;
//     public static void occurence(String str, int n, char element) {
//         if (n==str.length()) {
//             System.out.println("first: "+f+", last: "+l);
//             return;
//         }
//         char currChar = str.charAt(n);
//         if (currChar==element) {
//             if (f==-1) {
//                 f = n;
//             }else{
//                 l = n;
//             }
//         }
//         occurence(str, n+1, element);
//     }
//     public static void main(String[] args) {
//         occurence("abaacdaefaah", 0, 'z');
//     }
// }

// Q4.check if array is sorted
// public class recursionTwo {
//     public static void sort(int n, int[] arr) {
//         if (((arr.length)-1)==n) {
//             System.out.println("sorted");
//             return;
//         }
//         if (arr[n]<arr[n+1]) {
//             sort(n+1, arr);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,10};
//         sort(0, arr);
//     }
// }

// Q5.move all X to the end
// public class recursionTwo {
//     public static String str2= "";
//     public static void endMe(int n, int count, String str) {
//         if(n==str.length()){
//             for (int i = 0; i < count; i++) {
//                 str2+="x";
//             }
//             System.out.print(str2);
//             return;
//         }
//         if (str.charAt(n)=='x') {
//             endMe(n+1, count+1, str);
//         }else{
//             str2+=str.charAt(n);
//             endMe(n+1, count, str);
//         }
//     }

//     public static void main(String[] args) {
//         endMe(0, 0, "xaxbxcxdxe");
//     }
// }


// Q6. remove duplicates in string 
/**
 * recursionTwo
 */
// public class recursionTwo {
//     public static boolean[] map = new boolean[26];

//     public static void remove(String str, int n, String str2) {
//         if (n==str.length()) {
//             System.out.println(str2);
//             return;
//         }
//         char currChar = str.charAt(n);
//         if (map[currChar-'a']) {
//             remove(str, n+1, str2);
//         }else{
//             str2+=currChar;
//             map[currChar-'a']=true;
//             remove(str, n+1, str2);
//         }
//     }
//     public static void main(String[] args) {
//         remove("abbccda", 0, "");
//     }
// }

// Q7. print all subsequences of a string 
/**
 * recursionTwo
 */
// public class recursionTwo {
//     public static void sub(String str, String str2, int n) {
//         if (n==str.length()) {
//             System.out.println(str2);
//             return;
//         }
//         char currChar = str.charAt(n);
//         sub(str, str2+currChar, n+1);
//         sub(str, str2, n+1);
//     }
//     public static void main(String[] args) {
//         sub("aaa", "", 0);
//     }
// }


// Q8. print unique subsequence of string 
public class recursionTwo {
    public static void subUnique(String str, String str2, int n) {
        if (n==str.length()) {
            System.out.println(str2);
            return;
        }
        char currChar = str.charAt(n);
        subUnique(str, str2+currChar, n+1);
        subUnique(str, str2, n+1);
    }
    public static void main(String[] args) {
        subUnique("aaa", "", 0);
    }
}