package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC10869 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strs = br.readLine().split(" ");

            int x = Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);

            System.out.println(x+y);
            System.out.println(x-y);
            System.out.println(x*y);
            System.out.println(x/y);
            System.out.println(x%y);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}