package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC17362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if(x>=8){
            if(x%8==0){
                x=2;
            }else{
                x=x%8;
            }
        }
        if(x<6) System.out.println(x);
        if(x==6) System.out.println(4);
        if(x==7) System.out.println(3);
    }
}
