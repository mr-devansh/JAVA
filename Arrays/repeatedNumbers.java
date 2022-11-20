import java.util.HashSet;



// BRUTE FORCE O(n^2)
// public class repeatedNumbers {
//     public static boolean check(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i]==arr[j]) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//         public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         System.out.println(check(arr));
//     }
// }




// USING SET O(N)
public class repeatedNumbers {
    public static boolean check(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return false;
            } else {
                set.add(arr[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,3};
        System.out.println(check(arr));
    }
}