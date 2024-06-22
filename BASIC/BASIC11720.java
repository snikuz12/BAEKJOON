package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int sum=0;
        String num = br.readLine();

        for(int i=0; i<count;i++){
            sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }
}
