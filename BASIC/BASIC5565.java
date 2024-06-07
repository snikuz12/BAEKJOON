package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC5565 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        for(int i=1;i<10;i++){
            int price = Integer.parseInt(br.readLine());
            total -= price;
        }
        System.out.println(total);
    }
}
