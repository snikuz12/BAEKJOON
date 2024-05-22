package data_Structure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DS9012 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 첫 번째 줄에서 테스트 데이터의 수를 입력 받음
            int T = Integer.parseInt(reader.readLine());
            String[] results = new String[T];
            
            for (int i = 0; i < T; i++) {
                // 각 테스트 케이스의 괄호 문자열을 입력 받음
                String td = reader.readLine();
                // 입력 받은 괄호 문자열이 올바른지 여부를 판단하여 결과 배열에 저장
                results[i] = truthordare(td) ? "YES" : "NO";
            }
            
            // 결과 출력
            for (String result : results) {
                System.out.println(result);
            }
        } catch (IOException e) {
            System.err.println("An IOException was caught: " + e.getMessage());
        }
    }

    // 괄호 문자열이 올바른지 확인하는 메서드
    private static boolean truthordare(String td) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : td.toCharArray()) {
            if (ch == '(') {
                // 열린 괄호는 스택에 추가
                stack.push(ch);
            } else if (ch == ')') {
                // 닫힌 괄호가 나올 때, 스택이 비어있지 않으면 스택에서 열린 괄호를 제거
                if (stack.isEmpty()) {
                    return false; // 스택이 비어있으면 올바르지 않은 문자열
                }
                stack.pop();
            }
        }
        
        // 모든 괄호를 처리한 후, 스택이 비어있으면 올바른 문자열
        return stack.isEmpty();
    }
}

