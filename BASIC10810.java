import java.util.Scanner;

public class BASIC10810 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(); //바구니 개수
        int y=sc.nextInt(); //공 개수

        int[] X=new int[x];
        
        for(int z=0;z<y;z++){
            int i=sc.nextInt(); //첫번쨰 바구니
            int j=sc.nextInt(); //마지막 바구니
            int k=sc.nextInt(); //공 번호

            for(int q=i-1;q<j;q++){
                X[q]=k;
            }
        }
        
        for(int t=0;t<X.length;t++){
            System.out.print(X[t]+" ");
        }
    }
}
