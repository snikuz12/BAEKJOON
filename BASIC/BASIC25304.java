package BASIC;
import java.util.Scanner;

public class BASIC25304 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt(); // 영수증에 적힌 총 금액
        int x=scanner.nextInt(); // 물건들의 총 개수
        int money=0; //비교 금액

        for(int i=0;i<x;i++){
            int price = scanner.nextInt(); // 물건의 값
            int count = scanner.nextInt(); // 물건의 개수

            money+=price * count;
            if(i==(x-1)){
                if(money==total){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
