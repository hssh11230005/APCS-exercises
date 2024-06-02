import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, sum;
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        ArrayList<Integer> special_position_x = new ArrayList<>();
        ArrayList<Integer> special_position_y = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x = arr[i][j];
                sum = 0;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        if (Math.abs(k - i) + Math.abs(l - j) <= x) {
                            sum += arr[k][l];
                        }
                    }
                }
                if (sum % 10 == x) {
                    special_position_x.add(i);
                    special_position_y.add(j);
                }
            }
        }

        System.out.println(special_position_x.size());
        for (int i = 0; i < special_position_x.size(); i++) {
            System.out.println(special_position_x.get(i) + " " + special_position_y.get(i));
        }
    }
}