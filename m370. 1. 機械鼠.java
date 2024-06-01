import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left_count = 0;
        int right_count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int x = input.nextInt();
        int n = input.nextInt();
        int[] foods = new int[n];
        for(int i = 0; i < n; i++)
            foods[i] = input.nextInt();
        for(int i = 0; i < n; i++){
            if(foods[i] > x){
                right_count++;
                max = (foods[i] > max) ? foods[i] : max;
            }
            else if(foods[i] < x){
                left_count++;
                min = (foods[i] < min) ? foods[i] : min;
            }
        }
        if(left_count > right_count)
            System.out.println(left_count + " " + min);
        else if (right_count > left_count)
            System.out.println(right_count + " " + max);
    }
}
