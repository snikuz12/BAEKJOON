import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(st.nextToken());
        Stack<Character> s;
        boolean ans;
        for (int i = 0; i < cnt; i++) {
            ans = true;
            s = new Stack<>();
            st = new StringTokenizer(br.readLine());
            String arr = st.nextToken();
            for (int j = 0; j < arr.length(); j++) {
                if (arr.charAt(j) == '(') {
                    s.push(arr.charAt(j));
                } else if (arr.charAt(j) == ')') {
                    if (s.empty()) {
                        ans = false;
                        break;
                    } else {
                        s.pop();
                    }
                }
            }
            if(!s.empty()) {
                ans = false;
            }
            if(ans){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}