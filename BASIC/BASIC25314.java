package BASIC;
import java.util.Scanner;

public class BASIC25314 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int chance = N/4;
        
        for(int i=0;i<chance;i++){
            System.out.println("long");
            if(i==(chance-1)){
                System.out.println("int");
            }
        }
    }
}
