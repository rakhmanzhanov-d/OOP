import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tests = inp.nextInt();
        double fruitCnt = 0;
        double allSpent = 0;

        inp.nextLine();
        for (int i = 0; i < tests; i++) {
            double kg = 1;
            String s;
            double x = inp.nextDouble();
            allSpent += x;

            inp.nextLine();
            s = inp.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    kg++;
                }
            }

            System.out.printf("day %d: %.0f kg\n", i + 1, kg);
            fruitCnt += kg;
        }
        System.out.printf("%.2f kg by day\n", fruitCnt / tests);
        System.out.printf("R$ %.2f by day\n", allSpent / tests);
    }
}
