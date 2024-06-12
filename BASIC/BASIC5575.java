package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC5575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h =0;
        int m =0;
        int s =0;
        for(int i=0;i<3;i++){
            int[] arr = new int[6];
            String[] strs = br.readLine().split(" ");
            for(int k=0;k<arr.length;k++){
                arr[k] = Integer.parseInt(strs[k]);
            }
            if(arr[5]<arr[2]){
                arr[4] -=1;
                s=arr[5]+60-arr[2];
            }else{
                s=arr[5]-arr[2];
            }

            if(arr[4]<arr[1]){
                arr[3]-=1;
                m=arr[4]+60-arr[1];
            }else{
                m=arr[4]-arr[1];
            }

            h=arr[3]-arr[0];
            System.out.println(h+" "+m+" "+s);
        }

    }
}
