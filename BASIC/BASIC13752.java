package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int count = Integer.parseInt(br.readLine());
            for(int j=0;j<count;j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
