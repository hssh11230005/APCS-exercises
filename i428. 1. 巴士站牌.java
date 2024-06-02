import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = 0;
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
            d = Math.abs(x[i] - x[i+1]) + Math.abs(y[i] - y[i+1]);
            max = (d > max) ? d : max;
            min = (d < min) ? d : min;
        }
        System.out.println(max + " " + min);
    }
}