import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.equals(reverse(A))){
            System.out.println("Yes");
    }else{
        System.out.println("No");
    }


}
static String reverse(String a){
    String rev="";

    for(int i=a.length()-1;i>=0;i--){
        rev =rev+a.charAt(i);
    }
    //System.out.println(rev);
    return rev;
}
}
