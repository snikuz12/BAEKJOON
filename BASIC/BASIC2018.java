package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BASIC2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count =0;
        for(int i=1;i<=n/2;i++){
            long sum=0;
            for(int k=i;k<=n/2+1;k++){
                sum+=k;
                if(sum>n) break;
                if(sum==n){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count+1);
    }
}
