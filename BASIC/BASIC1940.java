package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        String[] strs = br.readLine().split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strs[i]);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){

            for(int k=i+1;k<arr.length;k++){
                if(sum==arr[i]+arr[k]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
