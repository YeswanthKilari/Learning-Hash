import java.util.*;
public class StringHashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }


        int q = scanner.nextInt();
        while (q != 0) {
            char c;
            c = scanner.next().charAt(0);
            System.out.println(hash[c -'a'] + "");
        }
    }
}
