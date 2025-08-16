package Strings;
public class LeetCode1903 {
    public static void main(String[] args) {
        String nums = "35427";
        String result = "";
        System.out.println(nums);
        for (int i = nums.length()-1; i >= 0; i--) {
            // System.out.println(nums.charAt(i));
            char ch = nums.charAt(i);
            if (ch - '0' %2  == 1)  {
                //odd hai 
                // ascii code h iske liye ch-0
               result = nums.substring(0, i+1);
            }
        }System.out.println(result);
        
    }
}
