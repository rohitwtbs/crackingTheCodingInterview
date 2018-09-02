//Implement an algorithm to determine if a string has all unique characters 
//What if you can not use additional data structures?

import java.util.*;
public class A_A{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(isUniqueChars2(a));
        
     }
     public static boolean isUniqueChars2(String str) {
         boolean[] char_set = new boolean[256];
         for (int i = 0; i < str.length(); i++) {
         int val = str.charAt(i);
         if (char_set[val]) return false;
         char_set[val] = true;
         }
         return true;
         }
}