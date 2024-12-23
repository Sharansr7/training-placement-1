5. import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        
        
        int q = scanner.nextInt();
        
        
        for (int i = 0; i < q; i++) {
            String queryType = scanner.next();
            if (queryType.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        
        
        scanner.close();
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}