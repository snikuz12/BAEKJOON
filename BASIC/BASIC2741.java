package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC2741 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());

            for(int i=1;i<=x;i++){
                System.out.println(i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
