package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int count=0;
            String arr = br.readLine();
            if(arr.charAt(0)=='#'){
                break;
            }
            for(int i=0;i<arr.length();i++){
                if(arr.charAt(i)=='a' || arr.charAt(i)=='e' || arr.charAt(i)=='i' || arr.charAt(i)=='o' || arr.charAt(i)=='u'
                || arr.charAt(i)=='A' || arr.charAt(i)=='E' || arr.charAt(i)=='I' || arr.charAt(i)=='O' || arr.charAt(i)=='U'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
