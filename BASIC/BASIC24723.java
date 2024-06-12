package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BASIC24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a =1;
        for(int i=0;i<n;i++){
            a = a*2;
        }
        System.out.println(a);
    }
}
