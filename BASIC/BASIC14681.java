package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC14681 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            if(x>0){
                if(y>0){
                    System.out.println(1);
                }else{
                    System.out.println(4);
                }
            }else{
                if(y>0){
                    System.out.println(2);
                }else{
                    System.out.println(3);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
