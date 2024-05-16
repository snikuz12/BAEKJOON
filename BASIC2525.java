import java.util.Scanner;

public class BASIC2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int add = scanner.nextInt();

        if (add>=60){
            hour+=add/60;
            min+=add%60;
        }else{
            min+=add;
        }
        if(min>=60){
            hour+=1;
            min-=60;
        }
        if(hour>=24){
            hour-=24;
        }

        System.out.println(hour+" "+min);
        scanner.close();
    }
}
