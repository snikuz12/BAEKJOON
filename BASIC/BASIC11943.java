package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        String[] strs1 = br.readLine().split(" ");
        int c = Integer.parseInt(strs1[0]);
        int d = Integer.parseInt(strs1[1]);

        int result = Math.min(a + d, b + c);
        System.out.println(result);


    }
}
