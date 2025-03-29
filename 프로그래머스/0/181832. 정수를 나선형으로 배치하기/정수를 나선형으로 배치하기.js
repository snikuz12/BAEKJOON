function solution(n) {
    // n x n 2차원 배열 초기화
    const matrix = Array.from({ length: n }, () => Array(n).fill(0));
    let x = 0, y = 0, num = 1;
    let directions = [[0, 1], [1, 0], [0, -1], [-1, 0]]; // 오른쪽, 아래, 왼쪽, 위쪽
    let dirIdx = 0; // 현재 방향 인덱스

    while (num <= n * n) {
        matrix[x][y] = num++; // 숫자 채우기
        let nextX = x + directions[dirIdx][0];
        let nextY = y + directions[dirIdx][1];

        // 범위를 벗어나거나 이미 숫자가 채워진 경우 방향 전환
        if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= n || matrix[nextX][nextY] !== 0) {
            dirIdx = (dirIdx + 1) % 4; // 다음 방향
            nextX = x + directions[dirIdx][0];
            nextY = y + directions[dirIdx][1];
        }
        x = nextX;
        y = nextY;
    }

    return matrix;
}