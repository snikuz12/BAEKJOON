package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BASIC1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        int min = Integer.parseInt(strs[0]);
        int max = Integer.parseInt(strs[1]);

        boolean[] array = new boolean[max+1];
        Arrays.fill(array, true);
        array[0]=array[1]=false;

        for (int i =2;i<Math.sqrt(max);i++){
            if(array[i]){
                for(int j=i*i; j<=max;j+=i){
                    array[j]=false;
                }
            }
        }

        for(int i=min;i<=max;i++){
            if(array[i]){
                System.out.println(i);
            }
        }

    }
}
