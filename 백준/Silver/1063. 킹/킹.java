import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        char k1 = x[0].charAt(0);
        int k2 = Integer.parseInt(x[1]);
        char r1 = x[3].charAt(0);
        int r2 = Integer.parseInt(x[4]);
        int cnt = Integer.parseInt(x[6]);
        if(x.length==8){
            cnt = Integer.parseInt(x[6])*10+Integer.parseInt(x[7]);
        }
        char king1 = k1;
        int king2 = k2;


        for(int i=0; i<cnt; i++){
            String cmd = br.readLine();
            king1 = k1;
            king2 = k2;
            switch(cmd) {
                case "R":
                    k1 += 1;
                    if(k1 < 'A' || k1 > 'H') {
                        k1 = king1;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r1 += 1;
                        if (r1 < 'A' || r1 > 'H') {
                            k1 = king1;
                            r1 -= 1;
                        }
                    }
                    break;

                case "L":
                    k1 -= 1;
                    if(k1 < 'A' || k1 > 'H') {
                        k1 = king1;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r1 -= 1;
                        if (r1 < 'A' || r1 > 'H') {
                            k1 = king1;
                            r1 += 1;
                        }
                    }
                    break;

                case "B":
                    k2 -= 1;
                    if(k2 < 1 || k2 > 8) {
                        k2 = king2;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r2 -= 1;
                        if (r2 < 1 || r2 > 8) {
                            k2 = king2;
                            r2 += 1;
                        }
                    }
                    break;

                case "T":
                    k2 += 1;
                    if(k2 < 1 || k2 > 8) {
                        k2 = king2;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r2 += 1;
                        if (r2 < 1 || r2 > 8) {
                            k2 = king2;
                            r2 -= 1;
                        }
                    }
                    break;

                case "RT":
                    k1 += 1;
                    k2 += 1;
                    if(k1 < 'A' || k1 > 'H' || k2 < 1 || k2 > 8) {
                        k1 = king1;
                        k2 = king2;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r1 += 1;
                        r2 += 1;
                        if (r1 < 'A' || r1 > 'H' || r2 < 1 || r2 > 8) {
                            k1 = king1;
                            k2 = king2;
                            r1 -= 1;
                            r2 -= 1;
                        }
                    }
                    break;

                case "LT":
                    k1 -= 1;
                    k2 += 1;
                    if(k1 < 'A' || k1 > 'H' || k2 < 1 || k2 > 8) {
                        k1 = king1;
                        k2 = king2;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r1 -= 1;
                        r2 += 1;
                        if (r1 < 'A' || r1 > 'H' || r2 < 1 || r2 > 8) {
                            k1 = king1;
                            k2 = king2;
                            r1 += 1;
                            r2 -= 1;
                        }
                    }
                    break;

                case "RB":
                    k1 += 1;
                    k2 -= 1;
                    if(k1 < 'A' || k1 > 'H' || k2 < 1 || k2 > 8) {
                        k1 = king1;
                        k2 = king2;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r1 += 1;
                        r2 -= 1;
                        if (r1 < 'A' || r1 > 'H' || r2 < 1 || r2 > 8) {
                            k1 = king1;
                            k2 = king2;
                            r1 -= 1;
                            r2 += 1;
                        }
                    }
                    break;

                case "LB":
                    k1 -= 1;
                    k2 -= 1;
                    if(k1 < 'A' || k1 > 'H' || k2 < 1 || k2 > 8) {
                        k1 = king1;
                        k2 = king2;
                    }
                    if (r1 == k1 && r2 == k2) {
                        r1 -= 1;
                        r2 -= 1;
                        if (r1 < 'A' || r1 > 'H' || r2 < 1 || r2 > 8) {
                            k1 = king1;
                            k2 = king2;
                            r1 += 1;
                            r2 += 1;
                        }
                    }
                    break;
            }

        }
        System.out.print(k1);
        System.out.println(k2);
        System.out.print(r1);
        System.out.println(r2);
    }
}