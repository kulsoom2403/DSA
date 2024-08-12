import java.util.Arrays;
class Job {
    char id;
    int deadline;
    int profit;


    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
class JobSequencing {

    void printJobScheduling(Job[] arr, int n) {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        boolean[] result = new boolean[n];
        char[] jobSequence = new char[n];


        for (int i = 0; i < n; i++) {
            result[i] = false;
        }

        for (int i = 0; i < n; i++) {

            for (int j = Math.min(n, arr[i].deadline) - 1; j >= 0; j--) {

                if (result[j] == false) {
                    result[j] = true;
                    jobSequence[j] = arr[i].id;
                    break;
                }
            }
        }

        int totalProfit = 0;
        for (int i = 0; i < n; i++) {
            if (result[i]) {
                for (Job job : arr) {
                    if (job.id == jobSequence[i]) {
                        totalProfit =totalProfit+ job.profit;
                    }
                }

            }
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String args[]) {
        Job arr[] = { new Job('a', 2, 100), new Job('b', 1, 19),
                new Job('c', 2, 20), new Job('d', 1, 25),
                new Job('e', 3, 15) };
        int n = arr.length;

        JobSequencing jobSequencing = new JobSequencing();
        jobSequencing.printJobScheduling(arr, n);
    }
}
