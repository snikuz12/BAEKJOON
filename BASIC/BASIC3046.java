package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC3046 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [ ] strs =br.readLine().split(" ");
        int r1 = Integer.parseInt(strs[0]);
        int s = Integer.parseInt(strs[1]);
        System.out.println(s*2-r1);
    }
}
