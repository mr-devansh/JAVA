package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class jobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i, int d, int p){
            id = i;
            profit = p;
            deadline = d;
        }
    }
    public static void main(String[] args) {
        Integer[][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}}; 
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        Collections.sort(jobs, (a,b)->b.profit-a.profit); //descending order

        for (int i = 0; i < jobs.size(); i++) {
             Job curr = jobs.get(i);
             if (curr.deadline>time) {
                seq.add(curr.id);
                time++;
             }
        }
        
        // print
        System.out.println("max jobs: "+seq.size());
        System.out.print("job number: ");
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
