class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; 
        int num = 1;
        int start_row = 0; // 시작 행
        int start_col = 0; // 시작 열
        int end_row = n - 1; // 마지막 행
        int end_col = n - 1; // 마지막 열
        
        while (num <= n * n) {
            // 첫 번째 가로 증가 (start_row, start_col -> start_row, end_col)
            for (int y = start_col; y <= end_col; y++) {
                answer[start_row][y] = num;
                num++;
            }
            start_row++; // 가로 채운 후 행을 증가시킴

            // 두 번째 세로 증가 (start_row -> end_row, end_col)
            for (int x = start_row; x <= end_row; x++) {
                answer[x][end_col] = num;
                num++;
            }
            end_col--; // 세로 채운 후 열을 감소시킴

            // 세 번째 가로 감소 (end_row, end_col -> end_row, start_col)
            if (start_row <= end_row) {
                for (int y = end_col; y >= start_col; y--) {
                    answer[end_row][y] = num;
                    num++;
                }
                end_row--; // 가로 채운 후 행을 감소시킴
            }

            // 네 번째 세로 감소 (end_row -> start_row, start_col)
            if (start_col <= end_col) {
                for (int x = end_row; x >= start_row; x--) {
                    answer[x][start_col] = num;
                    num++;
                }
                start_col++; // 세로 채운 후 열을 증가시킴
            }
        }

        return answer;
    }
}
