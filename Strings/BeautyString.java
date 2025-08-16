package Strings;

import java.util.*;

public class BeautyString {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        while (T-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            int Beauty = 0;
            
           
            for (int i = 0; i < n; i++) {
                int[] freq = new int[26];
                for (int j = i; j < n; j++) {
                
                    freq[s.charAt(j) - 'a']++;
                    
                    int max = 0, min = Integer.MAX_VALUE;
                    for (int f : freq) {
                        if (f > 0) {
                            max = Math.max(max, f);
                            min = Math.min(min, f);
                        }
                    }
                    
                Beauty += (max - min);
                }
            }
            
            System.out.println(Beauty);
        }
        
        sc.close();
    }
}