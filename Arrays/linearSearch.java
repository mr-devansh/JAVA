// package Arrays;

public class linearSearch {
    public static int search(int[] numbers,int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 8;
        int index = search(numbers, key);
        
        if (index==-1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: "+index+", with value: "+numbers[index]);   
        }
    }
}
// time O(n)
