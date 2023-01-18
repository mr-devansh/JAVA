package Stacks;

import java.util.Stack;

public class maxAreaHistogram {
    public static void doit(int[] heights) {
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for (int i = heights.length-1; i >= 0; i--) {
            while (!s.isEmpty() && heights[i] <= heights[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
         
        // width = j-1-1 = nsr[i]-nsl[i]-1;
        for (int k = 0; k < heights.length; k++) {
            int curr = heights[k];
            int width = nsr[k]-nsl[k]-1;
            int height = heights[k];
            int currArea = height*width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max areas is : "+maxArea);
    }
    
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        doit(heights);
    }
}
