package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int x= count-1;
        int y= count-1;


        for(int i=0;i<count;i++){
            for(int j=x;j>0;j--){
                System.out.print(" ");
            }
            x--;
            for(int k=y;k<count;k++){
                System.out.print("*");
            }
            y--;
            System.out.println();
        }

    }
}
