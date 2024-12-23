3. import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
        int n = scanner.nextInt();
        
        
        List<List<Integer>> lists = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list.add(scanner.nextInt());
            }
            lists.add(list);
        }
        
        
        int q = scanner.nextInt();
        
       
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                
                System.out.println(lists.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                // If the index is out of bounds, print "ERROR!"
                System.out.println("ERROR!");
            }
        }
        
        scanner.close();
    }
}