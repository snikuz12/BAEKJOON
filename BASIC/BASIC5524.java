package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC5524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i =0;i<n;i++){
            String word = br.readLine();
            String answer = "";
            for(int k=0;k<word.length();k++){
                if(Character.isUpperCase(word.charAt(k))){
                    answer += Character.toLowerCase(word.charAt(k));
                }else answer += word.charAt(k);
            }
            System.out.println(answer);
        }
    }
}
