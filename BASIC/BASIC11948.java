package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BASIC11948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[ ] f = new int[6];
        int sum=0;
        for(int i=0;i<6;i++){
            f[i]=Integer.parseInt(br.readLine());
            sum += f[i];
        }
        int min = f[0];
        for(int i=1;i<4;i++){
            if(min>f[i]){
                min=f[i];
            }
        }
        min += (f[4]>f[5]) ? f[5] : f[4];

        System.out.println(sum-min);
    }
}
