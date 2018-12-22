import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static final String REGEX = "^[A-Z]{5}[0-9]{4}[A-Z]$";
    private static Pattern p = Pattern.compile(REGEX);
    
    private static boolean isValidPAN(String s) {
        if(p.matcher(s).find())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}

