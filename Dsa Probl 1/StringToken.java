import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        String[] arr = s.split("[ !,?._'@]+");
        
        if (s.length() < 1){
            System.out.println(0);
        }
        else {
            System.out.println(arr.length);
            for (String i : arr){
                System.out.println(i);
            }
        }
        
    }
}
