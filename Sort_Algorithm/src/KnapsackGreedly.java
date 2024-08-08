import java.util.Arrays;

class JobNumber {
    char id;
    int profit;
    int weight;

    JobNumber(char id, int profit, int weight) {
        this.id = id;
        this.profit = profit;
        this.weight = weight;
    }
}

class KnapsackGreedly {
    double calculateProfit(JobNumber arr[], int n) {
        Arrays.sort(arr, (a, b) -> Double.compare((double)b.profit / b.weight, (double)a.profit / a.weight));
        double totalProfit = 0;
        int capacity = 20;

        for (int i = 0; i < n; i++) {
            if (arr[i].weight <= capacity) {
                capacity =capacity- arr[i].weight;
                totalProfit =totalProfit+ arr[i].profit;
            } else {
                totalProfit += arr[i].profit * ((double) capacity / arr[i].weight);
                break;
            }
        }
        return totalProfit;
    }
}


