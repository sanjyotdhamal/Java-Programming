//WAP to create the queue of print jobs and display the details of each job

package com.mit.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintJob {

    public static void main(String[] args) {

        Queue<JobOrder> queue = new LinkedList<JobOrder>();

        queue.offer(new JobOrder(10, "assignment"));
        queue.offer(new JobOrder(20, "myJob"));
        queue.offer(new JobOrder(30, "MyData"));
        queue.offer(new JobOrder(40, "SampleQueue"));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

class JobOrder {

    int JobID;
    String JobName;

    public JobOrder(int JobID, String JobName) {
        this.JobID = JobID;
        this.JobName = JobName;
    }

    public int getJobID() {
        return JobID;
    }

    public void setJobID(int JobID) {
        this.JobID = JobID;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    public String toString() {
        return "JobOrder [JobID=" + JobID +
               ", JobName=" + JobName + "]";
    }
}