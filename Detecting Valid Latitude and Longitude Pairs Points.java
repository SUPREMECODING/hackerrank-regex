import java.util.*;
import java.util.regex.*;

class Solution {
    private static final String REGEX = "(\\([+-]?[1-9]\\d*(\\.\\d+)?\\b,\\s[+-]?[1-9]\\d*(\\.\\d+)?\\b\\))";//([-]?\d+(\.?\d+)?\b)
    private static final String lat_long = "([-]?\\d+(\\.?\\d+)?\\b)";

    private static String check(double[] xy){
        if(xy[0]<=90 && xy[0]>=-90)
            if(xy[1]<=180 && xy[1]>=-180)
                return "Valid";
        return "Invalid";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        double XY[] = new double[2];
        //System.out.println("input no. of testcases");
        int tc = sc.nextInt();
        sc.nextLine();
        Pattern p = Pattern.compile(REGEX);
        Pattern q = Pattern.compile(lat_long);
        for(i = 0; i< tc ; i++){
            
            String text = sc.nextLine();
            Matcher m = p.matcher(text);
            if(m.find()){
                m = q.matcher(m.group(0));
                for(j = 0; j < 2 ; j++){
                    m.find();
                        XY[j] = Double.parseDouble(m.group(0));
                }
                System.out.println(check(XY));
            }
            else
            System.out.println("Invalid");
        }
        sc.close();
    }
}
