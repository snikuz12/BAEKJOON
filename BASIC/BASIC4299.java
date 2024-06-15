package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC4299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int sum = Integer.parseInt(strs[0]);
        int difference = Integer.parseInt(strs[1]);
        int x= (sum + difference) /2;
        int y= sum-x;
        if((sum + difference)%2 != 0 || difference > sum){
            System.out.println(-1);
        }else System.out.println(Math.max(x,y)+" "+Math.min(x,y));
    }
}
