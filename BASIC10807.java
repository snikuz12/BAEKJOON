import java.util.Scanner;

public class BASIC10807 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] numbers = new int[N];
        int count=0;

        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }

        int x=scanner.nextInt();

        for(int j=0;j<numbers.length;j++){
            if(x==numbers[j]){
                count++;
            }
        }

        System.out.println(count);
    }
}