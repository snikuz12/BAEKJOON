package BASIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC9498 {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());

            if(x>=90 && x<=100){
                System.out.println("A");
            }else if(x>=80 && x<=89 ){
                System.out.println("B");
            }else if(x>=70 && x<=79){
                System.out.println("C");
            }else if(x>=60 && x<=69){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
