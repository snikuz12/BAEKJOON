package BASIC;

import java.util.*;

public class BASIC1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();  // 정점의 개수 입력
        int E = sc.nextInt();  // 간선의 개수 입력

        // 각 정점에 연결된 간선들을 저장할 리스트 배열을 초기화
        List<int[]>[] graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();  // 각 정점에 대해 새로운 리스트 생성
        }

        // 간선 정보를 입력받아 그래프에 추가
        for (int i = 0; i < E; i++) {
            int from = sc.nextInt();  // 시작 정점
            int to = sc.nextInt();    // 끝 정점
            int weight = sc.nextInt();  // 가중치
            graph[from].add(new int[]{to, weight});  // 양방향 간선 추가
            graph[to].add(new int[]{from, weight});
        }

        boolean[] visited = new boolean[V + 1];  // 각 정점이 방문되었는지 확인하기 위한 배열
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));  // 가중치에 따라 정렬되는 우선순위 큐
        pq.add(new int[]{1, 0});  // 시작 정점을 1로 설정, 가중치 0으로 큐에 추가

        int mstWeight = 0;  // 최소 스패닝 트리의 총 가중치
        int edgeCount = 0;  // 최소 스패닝 트리에 포함된 간선의 수

        // 우선순위 큐가 비어있지 않고, 최소 스패닝 트리에 포함된 간선의 수가 V-1보다 작은 동안 반복
        while (!pq.isEmpty() && edgeCount < V) {
            int[] current = pq.poll();  // 큐에서 가장 작은 가중치를 가진 간선을 꺼냄
            int to = current[0];  // 간선의 끝 정점
            int weight = current[1];  // 간선의 가중치

            // 해당 정점이 이미 방문되었는지 확인
            if (visited[to]) {
                continue;  // 방문되었으면 다음 간선을 처리
            }

            visited[to] = true;  // 해당 정점을 방문으로 표시
            mstWeight += weight;  // 최소 스패닝 트리의 총 가중치에 현재 간선의 가중치를 추가
            edgeCount++;  // 최소 스패닝 트리에 포함된 간선의 수 증가



            // 현재 정점과 연결된 모든 간선을 검사
            for (int[] edge : graph[to]) {
                int next = edge[0];  // 다음 정점
                int nextWeight = edge[1];  // 다음 간선의 가중치
                // 다음 정점이 아직 방문되지 않았다면 우선순위 큐에 추가
                if (!visited[next]) {
                    pq.add(new int[]{next, nextWeight});

                }
            }
        }

        // 최종 최소 스패닝 트리의 총 가중치
        System.out.println(mstWeight);
    }
}