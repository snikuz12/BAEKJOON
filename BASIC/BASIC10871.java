package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC10871 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strs = br.readLine().split(" ");

            int n = Integer.parseInt(strs[0]); 
            int x = Integer.parseInt(strs[1]); 
            int[] a = new int[n];

            String[] str = br.readLine().split(" ");
            for(int i = 0;i<n;i++){
                a[i]=Integer.parseInt(str[i]);
            }
            for(int i =0;i<n;i++){
                if(a[i]<x){
                    System.out.print(a[i]+" ");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
