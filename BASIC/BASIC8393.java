package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC8393 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());
            int y = x;
            int result = 0;
            for(int i=0;i<x;i++){
                result=result+y;
                y--;
            }
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
