import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] value = new int[102][102];
        int[][] cost = new int[102][102];

        for (int i = 1; i <= n; i++) {
            value[i][i] = input.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            cost[i][i] = 0;
        }

        for (int l = 1; l < n; l++) {
            for (int i = 1; i <= n - l; i++) {
                int j = i + l;
                cost[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++) {
                    int s = cost[i][k] + cost[k + 1][j] + Math.abs(value[i][k] - value[k + 1][j]);

                    if (s < cost[i][j]) {
                        cost[i][j] = s;
                        value[i][j] = value[i][k] + value[k + 1][j];
                    }
                }
            }
        }

        System.out.println(cost[1][n]);

        input.close();
    }
}
