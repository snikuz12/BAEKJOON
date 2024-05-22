package BASIC;
import java.util.Scanner;

public class BASIC2480 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();
        int price=0;
        int max=a;
        if(a==b && b==c){
            price=10000+a*1000;
            System.out.println(price);
            return;
        }else{
            if(a==b){
                price=1000+a*100;
                System.out.println(price);
                return;
            }
            if(b==c){
                price=1000+b*100;
                System.out.println(price);
                return;
            }
            if(a==c){
                price=1000+a*100;
                System.out.println(price);
                return;
            }
            else{
                if(max<b){
                    max=b;
                }
                if(max<c){
                    max=c;
                }
                price=max*100;
                System.out.println(price);
                return;
            }
        }
        
    }
}