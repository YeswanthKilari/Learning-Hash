import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the hashmap: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the hashmap: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        //precomputing
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key);
            }
            freq++;
            mp.put(key, freq);
        }



        //outputting
        int q;
        System.out.println("Enter the number of queries: ");
        q = sc.nextInt();

        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            if (mp.containsKey(number)) {
                System.out.println(mp.get(number));
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}
