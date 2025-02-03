

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(st.nextToken());  // N
        int size = Integer.parseInt(st.nextToken()); // M

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; // 초기화: 1, 2, 3, ..., M
        }

        while (true) {
            // 현재 조합 출력
            for (int i = 0; i < size; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");

            // 다음 조합 생성
            int idx = size - 1; // 끝자리부터 증가 시도
            while (idx >= 0 && arr[idx] == num - (size - 1 - idx)) {
                idx--; // 앞자리로 이동
            }

            if (idx < 0) break; // 더 이상 증가 불가능하면 종료

            arr[idx]++; // 증가
            for (int i = idx + 1; i < size; i++) {
                arr[i] = arr[i - 1] + 1; // 뒷자리들을 연속되게 조정
            }
        }

        System.out.print(sb);
    }
}
