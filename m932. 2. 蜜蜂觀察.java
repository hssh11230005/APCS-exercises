import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int m = input.nextInt();
        int n = input.nextInt();
        int k = input.nextInt();
        input.nextLine(); 

        String[] ss = new String[m];
        for (int i = 0; i < m; i++) {
            ss[i] = input.nextLine();
        }

        int[] mm = new int[k];
        for (int i = 0; i < k; i++) {
            mm[i] = input.nextInt();
        }
        
        Map<String, Character> cells = new HashMap<>();
        for (int i = m - 1; i >= 0; i--) {
            int y = 2 * (m - 1 - i);
            for (int j = 0; j < n; j++) {
                int x = 2 * j + y / 2;
                cells.put(x + "," + y, ss[i].charAt(j));
            }
        }
        
        int prev_x = 0, prev_y = 0;
        int dx = 0, dy = 0;
        StringBuilder pp = new StringBuilder();
        
        for (int move : mm) {
            switch (move) {
                case 0:
                    dx = 1; dy = 2;
                    break;
                case 1:
                    dx = 2; dy = 0;
                    break;
                case 2:
                    dx = 1; dy = -2;
                    break;
                case 3:
                    dx = -1; dy = -2;
                    break;
                case 4:
                    dx = -2; dy = 0;
                    break;
                case 5:
                    dx = -1; dy = 2;
                    break;
            }
            
            
            if (cells.containsKey((prev_x + dx) + "," + (prev_y + dy))) {
                prev_x += dx;
                prev_y += dy;
            }
            
            pp.append(cells.get(prev_x + "," + prev_y));
        }
        
        System.out.println(pp.toString());
        System.out.println(pp.chars().distinct().count());
        
        input.close();
    }
}
