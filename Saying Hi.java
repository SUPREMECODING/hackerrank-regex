import java.util.Scanner;
import java.util.regex.Pattern;

class Solution{

    private static final String REGEX = "^[Hh][Ii]\\s[^Dd]";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int no_of_lines = sc.nextInt() , i; 
        sc.nextLine();
        String LINE;
        Pattern p = Pattern.compile(REGEX);
        for(i = 0; i< no_of_lines; i++){
            LINE = sc.nextLine();
            if(p.matcher(LINE).find()) System.out.println(LINE);
        }

    }
}
