import java.util.Scanner;

public class BASIC2444 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x=1;
        int y=N;

        for(int i=0;i<N;i++){
            for(int j=y;j>1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<x;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            x+=2;
            y-=1;
        }

        x=1;
        y=1+2*(N-2);
        
        for(int i=1;i<N;i++){
            for(int j=0;j<x;j++){
                System.out.print(" ");
            }

            for(int k=y;k>0;k--){
                System.out.print("*");
            }
            System.out.print("\n");
            y-=2;
            x+=1;
        }
    }
}
