import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> cart = new ArrayList<>();
            while (true) {
                int item = scanner.nextInt();
                if (item == 0) break;
                cart.add(item);
            }

            int countA = 0, countB = 0;
            for (int item : cart) {
                if (item == a) countA++;
                else if (item == -a) countA--;
                else if (item == b) countB++;
                else if (item == -b) countB--;
            }

            if (countA > 0 && countB > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}