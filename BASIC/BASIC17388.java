package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int s = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        int h = Integer.parseInt(strs[2]);
        int min=0;

        if(s+k+h>=100){
            System.out.println("OK");
        }else{
            min=Math.min(Math.min(s,k),h);
            if(min==s){
                System.out.println("Soongsil");
            }else if(min==k){
                System.out.println("Korea");
            }else if(min==h){
                System.out.println("Hanyang");
            }
        }
    }
}
