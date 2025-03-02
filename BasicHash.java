import java.util.*;
class BasicHash{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no. of inputs: ");
        int n = scan.nextInt();
        int[] arr = new int[13];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        //precomputing
        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        //fetching the data
        System.out.println("Enter the Element to search: ");
        int m = scan.nextInt();

        while (m-- != 0) {
            int number = scan.nextInt();
            System.out.print(hash[number]+ "");
        }

    }
}