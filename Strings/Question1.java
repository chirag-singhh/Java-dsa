package Strings;
import java.util.Scanner;


public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine(); 
        
        String target = "hello";
        
        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();
            int j = 0; 
            
            for (int i = 0; i < s.length(); i++) {
                if (j < target.length() && s.charAt(i) == target.charAt(j)) {
                    j++;
                }
            }
            
            if (j == target.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
