package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class knapsack {
    public static void doit(int[] value, int[] weight, int W) {
        double[][] info = new double[value.length][4];
        for (int i = 0; i < value.length; i++) {
            info[i][0] = i;
            info[i][1] = value[i];
            info[i][2] = weight[i];
            info[i][3] = value[i]/(double)weight[i];
        }
        Arrays.sort(info, Comparator.comparingDouble(o->o[3]));
        
        double cap = W;
        double val = 0;

        for (int i = value.length-1; i >= 0; i--) {
            if (info[i][2]<=cap) {
                cap -= info[i][2];
                val += info[i][1];
            }
            else{
                val += info[i][3]*cap;
                cap = 0;
                break;
            }
        }
        System.out.println(val);
    }
    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;
        doit(value, weight, W);
    }
}
