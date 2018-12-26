import java.util.*;
import java.util.regex.*;

class Solution{
    private static final String IPv4 = "\\b((([1-9][0-9]?)|([1][0-9][0-9])|([2][0-5][0-5]))\\.){3}(([1-9][0-9])|([1][0-9][0-9])|([2][0-5][0-5]))\\b";
    private static final String IPv6 = "\\b([0-9a-f]{1,4}:){7}[0-9a-f]{1,4}\\b";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int no_of_lines = sc.nextInt() , i; 
        sc.nextLine();
        String LINE;
        Pattern ipv4 = Pattern.compile(IPv4);
        Pattern ipv6 = Pattern.compile(IPv6);
        Matcher mipv4,mipv6;
        for(i = 0; i< no_of_lines; i++){
            LINE = sc.nextLine();
            mipv4 = ipv4.matcher(LINE);
            mipv6 = ipv6.matcher(LINE);
            if(mipv4.find())
                System.out.println("IPv4");
            else if(mipv6.find())
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
    }
}
