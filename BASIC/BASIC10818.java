package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC10818{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[] number = new int[n];
            String[] strs = br.readLine().split(" ");
            for(int i=0;i<n;i++){
                number[i]=Integer.parseInt(strs[i]);
            }

            int max = number[0];
            for(int i =1;i<n;i++){
                if(max < number[i]){
                    max = number[i];
                }
            }

            int min = number[0];
            for(int i =1;i<n;i++){
                if(min > number[i]){
                    min = number[i];
                }
            }

            System.out.println(min+" "+max);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}