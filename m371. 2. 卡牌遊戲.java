import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] mat = new int[m + 1][n + 1];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
            mat[i][n] = 1001;
        }
        
        for (int j = 0; j <= n; j++) {
            mat[m][j] = 1001;
        }
        
        int ans = 0;
        boolean modified = true;
        
        while (modified) {
            modified = false;
            
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    if (mat[r][c] < 0) {
                        continue; 
                    }
                    
                    
                    int i = r + 1;
                    
                    while (mat[i][c] < 0) {
                        i++;
                    }
                    
                    if (mat[r][c] == mat[i][c]) {
                        ans += mat[r][c];
                        mat[r][c] = mat[i][c] = -1;
                        modified = true;
                        continue;
                    }
                    
                    int j = c + 1;
                    
                    while (mat[r][j] < 0) {
                        j++;
                    }
                    
                    if (mat[r][c] == mat[r][j]) {
                        ans += mat[r][c];
                        mat[r][c] = mat[r][j] = -1;
                        modified = true;
                    }
                }
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}