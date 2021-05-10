import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int t = 0; t < n; t++) {
            int[][] arr = new int[9][9];
            boolean isValid = true;

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = inp.nextInt();
                    set.add(arr[i][j]);
                }
                if (set.size() != 9) {
                    isValid = false;
                }
            }
            set.clear();

            for (int i = 0; i <= 6; i += 3) {
                for (int k = 0; k <= 6; k += 3) {
                    HashSet<Integer> s = new HashSet<>();

                    for (int m = 0; m < 3; m++) {
                        for (int l = 0; l < 3; l++) {
                            s.add(arr[m + i][l + k]);
                        }
                    }

                    if (s.size() != 9) {
                        isValid = false;
                    }
                }
            }

            System.out.println("Instancia " + (t + 1));
            System.out.println(isValid ? "SIM" : "NAO");


        }
    }
}
