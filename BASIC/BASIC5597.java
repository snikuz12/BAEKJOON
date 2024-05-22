package BASIC;
import java.util.Scanner;

public class BASIC5597 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];

        for(int i=0;i<28;i++){
            int x = scanner.nextInt();
            array[x-1]=x;
        }

        for(int i=0;i<30;i++){
            if(array[i]==0){
                System.out.println(i+1);
            }
        }
    }
}