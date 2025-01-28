import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int [] arr = new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<y;i++){
            int tmp = 0;
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}