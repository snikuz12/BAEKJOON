package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC10950 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            

            int n = Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++){
                String[] strs = br.readLine().split(" ");
                int x = Integer.parseInt(strs[0]);
                int y = Integer.parseInt(strs[1]);

                System.out.println(x+y);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
