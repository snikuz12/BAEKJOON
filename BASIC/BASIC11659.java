package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BASIC11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        int sum=0;
        int[] arr = new int[n+1];
        int[] answer = new int[n+1];
        arr[0]=0;
        answer[0]=0;
        String[] strs1 = br.readLine().split(" ");
        for(int i=1;i<arr.length;i++){
            arr[i]=Integer.parseInt(strs1[i-1]);
            sum+=arr[i];
            answer[i]=sum;
        }
        for(int i=0;i<m;i++){
            String[] strs2 = br.readLine().split(" ");
            int x = Integer.parseInt(strs2[0]);
            int y = Integer.parseInt(strs2[1]);
            System.out.println(answer[y]-answer[x-1]);
        }
    }
}
