package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC1008 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strs = br.readLine().split(" ");
            double x = Double.parseDouble(strs[0]);
            double y = Double.parseDouble(strs[1]);

            System.out.println(x/y);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
