package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for(int i=0;i<count;i++){
            int n=Integer.parseInt(br.readLine());
            long [] arr = new long[n];

            for(int k=0;k<n;k++) {
                if(k>2) {
                    arr[k] = arr[k - 3] + arr[k - 2];
                }else{
                    arr[k]=1;
                }

            }
            System.out.println(arr[n-1]);
        }
    }
}
