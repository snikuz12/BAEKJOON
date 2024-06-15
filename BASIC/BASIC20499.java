package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split("/");
        int k = Integer.parseInt(strs[0]);
        int d = Integer.parseInt(strs[1]);
        int a = Integer.parseInt(strs[2]);

        if(k+a < d || d ==0)
            System.out.println("hasu");
        else
            System.out.println("gosu");


    }
}
