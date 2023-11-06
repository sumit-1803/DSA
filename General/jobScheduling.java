import java.util.*;

class Job implements Comparable<Job> {
    String name;
    int deadline;
    int profit;

    public Job(String name, int deadline, int profit) {
        this.name = name;
        this.deadline = deadline;
        this.profit = profit;
    }

    @Override
    public int compareTo(Job other) {
        // Sort jobs by profit in descending order
        return other.profit - this.profit;
    }
}

public class jobScheduling {
    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Job1", 2, 100));
        jobs.add(new Job("Job2", 1, 50));
        jobs.add(new Job("Job3", 2, 10));
        jobs.add(new Job("Job4", 1, 60));
        jobs.add(new Job("Job5", 3, 20));

        scheduleJobs(jobs);
    }

    public static void scheduleJobs(List<Job> jobs) {
        // Sort the jobs by profit (highest profit first)
        Collections.sort(jobs);

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        boolean[] slots = new boolean[maxDeadline];
        String[] schedule = new String[maxDeadline];

        for (Job job : jobs) {
            for (int i = job.deadline - 1; i >= 0; i--) {
                if (!slots[i]) {
                    slots[i] = true;
                    schedule[i] = job.name;
                    break;
                }
            }
        }

        int totalProfit = 0;
        System.out.println("Scheduled Jobs:");
        for (int i = 0; i < maxDeadline; i++) {
            if (schedule[i] != null) {
                System.out.println(schedule[i]);
                totalProfit += findJobByName(jobs, schedule[i]).profit;
            }
        }

        System.out.println("Total Profit: " + totalProfit);
    }

    public static Job findJobByName(List<Job> jobs, String name) {
        for (Job job : jobs) {
            if (job.name.equals(name)) {
                return job;
            }
        }
        return null;
    }
}
