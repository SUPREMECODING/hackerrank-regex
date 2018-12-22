import java.util.*;
import java.util.regex.*;

class Solution{

    private static final String REGEX = "<a.*?href=\"(.*?)\".*?>(?:<.*?>)*(.*?)(?:<\\/.*?>)*<\\/a>";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int no_of_lines = sc.nextInt() , i; 
        sc.nextLine();
        String LINE;
        Pattern p = Pattern.compile(REGEX);
        Matcher m;
        for(i = 0; i< no_of_lines; i++){
            LINE = sc.nextLine();
            m = p.matcher(LINE);
            while(m.find()){
                LINE = m.group(1).trim()+","+ m.group(2).trim();
                System.out.println(LINE);
            }
        }
    }
}

