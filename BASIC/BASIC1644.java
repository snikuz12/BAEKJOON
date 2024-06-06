package BASIC;

import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BASIC1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x= 2;
        int count =0;
        int result=0;
        boolean[] num = new boolean[n + 1];
        Arrays.fill(num, true);
        num[0] = num[1] = false; // 0 과 1은 소수 X

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (num[i]) {
                for (int j = i * i; j <= n; j += i) {
                    num[j] = false;
                }
            }
        }

        for(int i=2; i<=n;i++){
            if(num[i]){
                for(int j=i;j<=n;j++){
                    if(num[j]){
                        result+=j;
                        if(result >n){
                            result =0;
                            break;
                        }
                        if(result==n){

                            result=0;
                            count++;
                            break;
                        }
                    }
                }
            }

        }

        System.out.println(count);
    }
}
