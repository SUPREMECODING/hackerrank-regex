import java.util.*;
import java.util.regex.*;

class Solution{
    private final static String REGEX = "http[s]?:\\/\\/(ww[w2]\\.)?(([a-zA-Z0-9\\-]+\\.)+([a-zA-Z\\-])+)";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int no_of_lines = sc.nextInt() , i; 
        sc.nextLine();
        String LINE;
        HashSet<String> hs= new HashSet<String>();
        Pattern p = Pattern.compile(REGEX);
        Matcher m;
        for(i = 0; i< no_of_lines; i++){
            LINE = sc.nextLine();
            m = p.matcher(LINE);
            while(m.find()){
                LINE = m.group(2);
                hs.add(LINE);
            }
        }
        List<String> list = new ArrayList<String>(hs);
        Collections.sort(list);
        System.out.println(list.toString().replaceAll(", ", ";").replaceAll("(\\[|\\])", ""));
    }
}

