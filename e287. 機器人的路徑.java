import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[100 + 5][100 + 5];
        int mn = Integer.MAX_VALUE;
        int x = 0, y = 0, ans = 0;
        boolean[][] been = new boolean[100 + 5][100 + 5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
                if (arr[i][j] < mn) {
                    mn = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        been[x][y] = true;
        ans += arr[x][y];
        int drc = -1; // udlr 0123

        while (true) {
            boolean cmp = false;
            mn = Integer.MAX_VALUE;

            if (x != 0 && !been[x - 1][y] && arr[x - 1][y] < mn) {
                mn = arr[x - 1][y];
                drc = 0;
                cmp = true;
            }
            if (x != n - 1 && !been[x + 1][y] && arr[x + 1][y] < mn) {
                mn = arr[x + 1][y];
                drc = 1;
                cmp = true;
            }
            if (y != 0 && !been[x][y - 1] && arr[x][y - 1] < mn) {
                mn = arr[x][y - 1];
                drc = 2;
                cmp = true;
            }
            if (y != m - 1 && !been[x][y + 1] && arr[x][y + 1] < mn) {
                mn = arr[x][y + 1];
                drc = 3;
                cmp = true;
            }

            if (!cmp) {
                break;
            }

            switch (drc) {
                case 0:
                    x--;
                    break;
                case 1:
                    x++;
                    break;
                case 2:
                    y--;
                    break;
                case 3:
                    y++;
                    break;
            }

            been[x][y] = true;
            ans += arr[x][y];
        }

        System.out.println(ans);
    }
}