package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC10768 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if(m==1){
            System.out.println("Before");
        }else if(m==2){
            if(d<18){
                System.out.println("Before");
            }else if(d==18){
                System.out.println("Special");
            }else if(d>18){
                System.out.println("After");
            }
        }else if(m>2){
            System.out.println("After");
        }
    }

}
