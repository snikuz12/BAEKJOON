package BASIC;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        double [] num=new double[count];
        double max=0;
        double sum=0;
        for(int i=0;i<count;i++){
            num[i]=Integer.parseInt(strs[i]);
            if(num[i]>max) max=num[i];
        }

        for(int i=0;i<count;i++){
            num[i] = num[i]/max*100;
            sum += num[i];
        }
        System.out.println((double)sum/count);
    }
}
