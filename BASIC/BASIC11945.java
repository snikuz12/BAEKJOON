package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BASIC11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        for (int i = 0; i < n; i++) {
            String arr = br.readLine();
            StringBuilder answer = new StringBuilder();

            // 문자열 뒤집기
            for (int j = m - 1; j >= 0; j--) {
                answer.append(arr.charAt(j));
            }

            System.out.println(answer);
        }
    }
}

