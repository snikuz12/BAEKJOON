
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class pointComparator implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.y == p2.y) {
            return p1.x - p2.x;
        } else {
            return p1.y - p2.y;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());


        PriorityQueue<Point> pq = new PriorityQueue<>(1, new pointComparator());
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pq.offer(new Point(x, y));
        }

        while (!pq.isEmpty()) {
            Point point = pq.poll();
            System.out.println(point.x + " " + point.y);
        }
    }
}
