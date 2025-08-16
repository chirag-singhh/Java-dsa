package Strings;

public class First {
    public static void main(String[] args) {
        String name1 = "Chirag Singh";
          String name2 = "Chirag Singh";
        // String me S cap mtlb class hai
        // Chirag Singh Object hai 
        System.out.println(name1==name2);/* iska mtlb yeh h ki name 1 aur name 2 
        same  object hai
        */
        String name3 = new String("Chirag");
          String name4 = new String("Chirag");
          System.out.println(name3==name4); /* ye false iske liye qki idhar humne alag object bnaye hai */
         System.out.println(name3.equals(name4));/* last wala true aya qki equals sirf value dekta hai */
   
        }
}
