package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min1=2100;
        int min2=2100;
        for(int i=0;i<3;i++){
            int price=Integer.parseInt(br.readLine());
            if(min1>price){
                min1=price;
            }
        }
        for(int i=0;i<2;i++){
            int price=Integer.parseInt(br.readLine());
            if(min2>price){
                min2=price;
            }
        }
        System.out.println(min1+min2-50);
    }
}
