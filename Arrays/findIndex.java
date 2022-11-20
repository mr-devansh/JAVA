// public class findIndex {
//     public static int find(int arr[], int key) {
//         int start = 0, end = arr.length-1;
//         while (start<=end) {
//             int mid = (start+end)/2;
//             if (arr[mid]==key) {
//                 return mid;
//             }if(arr[mid]<key) {
//                 start = mid+1;                
//             }else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {4,5,6,7,0,1,2};
//         int key = 0;
//         System.out.println(find(arr, key));
//     }
// }




public class findIndex {
    public static int search(int[] nums, int target) {
        int min = minSearch(nums); 
        if(nums[min] <= target && target <= nums[nums.length-1]){
             return search(nums,min,nums.length-1,target); 
        }
        else{ 
            return search(nums,0,min,target); 
        } 
    }
    public static int search(int[] nums,int left,int right,int target){
        int l = left; 
        int r  = right;
        while(l <= r){ 
            int mid = l + (r - l)/2; 
            if(nums[mid] == target){ 
                return mid; 
            } 
            else if(nums[mid] > target){ 
                r = mid-1; 
            } else{ 
                l = mid+1; 
            } 
        } 
        return -1; 
    }
    public static int minSearch(int[] nums){ 
      int left = 0; 
      int right = nums.length-1; 
      while(left < right){
          int mid = left + (right - left)/2; 
          if(mid>0 && nums[mid-1] > nums[mid]){ 
              return mid; 
          } 
          else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){ 
              left = mid+1; 
          } else{ 
              right = mid-1; 
           } 
       } 
       return left; 
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 0;
        System.out.println(search(arr,key));
    }
}
