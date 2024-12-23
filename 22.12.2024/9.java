9. import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        String regex = "[^a-zA-Z]+";
        
        String[] tokens = s.split(regex);
            
        List<String> tokenList = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenList.add(token);
            }
        }
            
        System.out.println(tokenList.size());
         
        for (String token : tokenList) {
            System.out.println(token);
        }
    }
}