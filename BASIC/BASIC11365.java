package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class BASIC11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] strs = br.readLine().split(" ");
            if(Objects.equals(strs[0], "END")){
                break;
            }
            StringBuilder answer = new StringBuilder();

            char x = ' ';
            int n=0;
            for(int i=strs.length-1;i>=0;i--){
                for(int j=strs[i].length()-1;j>=0;j--){
                    x=strs[i].charAt(j);
                    answer.append(x);
                }
                answer.append(" ");
                n++;
            }
            String a = answer.toString();
            System.out.println(a);
        }

    }
}
