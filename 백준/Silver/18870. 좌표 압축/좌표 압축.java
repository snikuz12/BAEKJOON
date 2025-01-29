import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(st.nextToken()); // 좌표 개수
        st = new StringTokenizer(br.readLine()); // 죄표 받기
        int[] arr= new int[cnt];
        int[] first = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            first[i] = arr[i];
        }
        Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<>();
        int x =0;
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], x);
                x++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(map.get(first[i])).append(" ");
        }
        System.out.println(sb);
    }
}
