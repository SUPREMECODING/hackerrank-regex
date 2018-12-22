import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
    private static final String STARTREGEX = "^(?i)(hackerrank)" ;
    private static final String ENDREGEX = "(?i)(hackerrank)$" ;
    private static final String BOTHREGEX = "^(?i)(hackerrank).*\\1$|^(?i)(hackerrank)$" ;
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int no_of_lines = sc.nextInt(), i;
        sc.nextLine();
        String LINE;
        Pattern p0 = Pattern.compile(BOTHREGEX);
        Pattern p1 = Pattern.compile(STARTREGEX);
        Pattern p2 = Pattern.compile(ENDREGEX);
        Matcher m;

        for(i = 0 ; i < no_of_lines ; i++ ){
            LINE = sc.nextLine();
            if(p0.matcher(LINE).find()) System.out.println(0);
            else if(p1.matcher(LINE).find()) System.out.println(1);
            else if(p2.matcher(LINE).find()) System.out.println(2);
            else System.out.println(-1);
        }
        sc.close();
    }
}
