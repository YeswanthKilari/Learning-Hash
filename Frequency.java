import java.util.ArrayList;
import java.util.List;

public class Frequency{
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        int hash[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1 && arr[i] <= n) {
                hash[arr[i]] += 1;
            }

        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            result.add(hash[i]);
        }

        return result;
    }
    

    public static void main(String[] args) {
        Frequency freq = new Frequency();
        int arr[] = {1, 2, 3, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = freq.frequencyCount(arr);
        System.out.println(result);
    }
}