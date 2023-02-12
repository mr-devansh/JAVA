package Heaps;

import java.util.ArrayList;

public class heaps {
    static class Heaps{
        ArrayList<Integer> arr = new ArrayList<>();

        public int peekMin(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;
            if (left<arr.size() && arr.get(minidx)>arr.get(left)) {
                minidx = left;
            }
            if (right<arr.size() && arr.get(minidx)>arr.get(right)) {
                minidx = right;
            }
            if (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);
            }
        }

        public int delete(){
            //1. swap root and last node in arraylist
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            //2. remove last index element
            arr.remove(arr.size()-1);
            //3. heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

        public void add(int data){ //O(logn)
            // add at last index
            arr.add(data);
            int x = arr.size()-1; //child index
            int par = (x-1)/2; //parent index
            while (arr.get(x)<arr.get(par)) { //O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public static void main(String[] args) {
            Heaps h = new Heaps();
            h.add(3);
            h.add(4);
            h.add(1);
            h.add(5);
            while (!h.isEmpty()) {
                System.out.println(h.peekMin());
                h.delete();
            }
        }
    }
}
