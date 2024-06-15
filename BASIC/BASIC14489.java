package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC14489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int x =Integer.parseInt(strs[0]);
        int y =Integer.parseInt(strs[1]);

        String[] strs1 = br.readLine().split(" ");
        int c =Integer.parseInt(strs1[0]);

        if(x+y>=2*c){
            System.out.println((x+y)-(2*c));
        }else{
            System.out.println(x+y);
        }
    }
}
