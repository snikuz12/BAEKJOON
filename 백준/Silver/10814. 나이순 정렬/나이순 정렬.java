import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class people {
    String name;
    int age;

    public people(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class peopleComparator implements Comparator<people> {
    @Override
    public int compare(people p1, people p2) {
        return p1.age - p2.age;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        peopleComparator pc = new peopleComparator();
        int cnt = Integer.parseInt(st.nextToken());
        people [] p = new people[cnt];

        for(int i =0;i<cnt; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people p1 = new people(name, age);
            p[i] = p1;
        }

        Arrays.sort(p, pc);

        for(int i =0;i<cnt; i++){
            System.out.println(p[i].age+ " " + p[i].name);
        }
    }
}