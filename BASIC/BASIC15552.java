package BASIC;

import java.io.*;

public class BASIC15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());


        for(int i=0;i<count;i++){
            String[] strs = br.readLine().split(" ");
            int x= Integer.parseInt(strs[0]);
            int y = Integer.parseInt(strs[1]);
            String result = Integer.toString(x+y);
            bw.write(result +"\n");
        }
        bw.flush();
    }
}
