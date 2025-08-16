package Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Chirag Singh";
        String[] temp = str.split("\\s+");
        System.out.println(Arrays.toString(temp));
        StringBuilder reversed = new StringBuilder();
 
        for(int i = temp.length-1; i >= 0 ; i-- ){
              reversed.append(temp[i]).append(" ");
        // System.out.println(temp[i]);
        }
       System.out.println(reversed.toString().trim());
}
}