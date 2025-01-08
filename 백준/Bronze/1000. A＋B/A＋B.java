import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);

        System.out.println(x+y);
        
    };
}
