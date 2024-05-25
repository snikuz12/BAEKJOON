package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC2438 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n= Integer.parseInt(br.readLine());
            int count=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<count;j++){
                    System.out.print("*");
                }
                System.out.println("");
                count++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
