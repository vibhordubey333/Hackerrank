import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int swap = 0;
        int bribes;
        int pos = 0;
        for(int i = q.length-1; i >= 0; i--) {
            int j = 0;

            bribes = q[pos] - (pos + 1);
            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (q[i] - 2 > 0){
                j = q[i] - 2;
            }
            
            while(j < i) {
                if (q[j] > q[i]){
                    swap++;
                }
                j++;
            }
            pos++;
        }
        System.out.println(swap);
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
