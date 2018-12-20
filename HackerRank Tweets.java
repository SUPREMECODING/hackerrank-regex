import java.util.*;
import java.util.regex.*;

class Solution{
    private static final String REGEX = "(?i)hackerrank";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_tweets = sc.nextInt(),i,count=0;
        sc.nextLine();
        String tweet;
        Pattern p = Pattern.compile(REGEX);
        Matcher m;
        for(i = 0 ; i < no_of_tweets; i++){
            tweet = sc.nextLine();
            m = p.matcher(tweet);
            if(m.find())
                count++;
        }
        System.out.println(count);
    }
}
