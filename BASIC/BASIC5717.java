package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BASIC5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum;
        while(true){
            String[] strs = br.readLine().split(" ");
            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);
            sum = x+y;
            if(sum==0){
                break;
            }
            System.out.println(sum);
        }
    }
}
