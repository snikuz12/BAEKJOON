package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = n;
        for(int i =0; i< n ; i++){
            for(int j=0;j<x;j++){
                System.out.print("*");
            }
            x--;
            System.out.println();
        }
    }
}
