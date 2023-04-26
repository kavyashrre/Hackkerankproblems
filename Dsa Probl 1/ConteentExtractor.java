import java.io.*; 
import java.util.*; 
import java.util.regex.*; public class Solution {


public static void main(String[] args) {
    String regex = "<(.+)>([^<>]+)</(\\1)>";
    Pattern p = Pattern.compile(regex);

    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    while (testCases-- > 0) {
        String line = in.nextLine();
        Matcher m = p.matcher(line);

        if (m.find()) {
            m.reset();
            while (m.find()) {
                System.out.println(m.group(2));
            }
        } else {
            System.out.println("None");
        }
    }

    in.close();
}
}
        
