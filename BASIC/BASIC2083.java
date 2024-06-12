package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC2083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] strs = br.readLine().split(" ");
            int age=Integer.parseInt(strs[1]);
            int weight=Integer.parseInt(strs[2]);
            if(strs[0].equals("#") && age ==0 && weight ==0){
                break;
            }
            if(age>17 || weight >=80){
                System.out.println(strs[0]+" Senior");
            }else{
                System.out.println(strs[0]+" Junior");
            }
        }
        br.close();
    }
}
