import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, m;

        while ((n = inp.nextInt()) != 0 && (m = inp.nextInt()) != 0) {
            int[] arr = new int[m];
            int cnt = n;
            boolean contains = false;
            int min = n;
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < m; i++) {
                int x = inp.nextInt();
                arr[i] = x;
                if (min > x) {
                    min = x;
                }
            }

            for (int i = 0; i < m - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    set.add(arr[i]);
                }
            }

            cnt = (n - min) + (m - set.size());
            System.out.println(cnt);
        }
    }
}



