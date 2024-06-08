import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left = 0;
        int right = 0;
        int rev = 0;
        int prev_dir = 0;
        
        int n = input.nextInt();
        int px = input.nextInt();
        int py = input.nextInt();
        
        for (int i = 1; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            int dir;
            if (x > px)
                dir = 0; 
            else if (y < py)
                dir = 1; 
            else if (x < px)
                dir = 2; 
            else
                dir = 3;
            
            if (dir == (prev_dir + 1) % 4)
                right++;
            else if (dir == (prev_dir + 2) % 4)
                rev++;
            else if (dir == (prev_dir + 3) % 4)
                left++;
            
            prev_dir = dir;
            px = x;
            py = y;
        }
        
        System.out.println(left + " " + right + " " + rev);
    }
}