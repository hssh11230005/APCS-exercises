import java.util.Scanner;

public class Main {
    public static char letterCase(char c) {
        if (Character.isLowerCase(c)) return 'l';
        if (Character.isUpperCase(c)) return 'u';
        return 'n';
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int k = s.nextInt();
            String str = s.next();
            int g = 0;      
            int cg = 0;     
            int len = str.length();
            char preL = 'n';    
            char curL;          
            int ck = 0;         

            if (k == 1) {
                for (int i = 0; i < len; i++) {
                    curL = letterCase(str.charAt(i));      
                    if (preL != curL)    
                        cg++;
                    else                
                        cg = 1;
                    
                    g = Math.max(cg, g);    
                    preL = curL;        
                }
            } else {
                for (int i = 0; i < len; i++) {
                    curL = letterCase(str.charAt(i));

                    if (preL == curL) {
                        ck++;
                        if (ck == k) {             
                            cg += k;            
                            g = Math.max(cg, g);     
                        }

                        if (ck > k)             
                            cg = k;             
                    } else if (preL != curL) {       
                        if (ck < k) cg = 0;     
                        ck = 1;                
                    }
                    preL = curL;                
                }
            }

            System.out.println(g);
        }
    }
}
