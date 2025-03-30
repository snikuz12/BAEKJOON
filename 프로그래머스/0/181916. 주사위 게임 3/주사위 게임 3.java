import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int [] dice = {0,0,0,0,0,0};
        dice[a-1]++;
        dice[b-1]++;
        dice[c-1]++;
        dice[d-1]++;
        int p =0 ;
        int q =0 ;
        int cnt = 0;
        int count = 0;
        int k= 0;
        int j =0;
        for(int x = 0;x<6;x++){
            if(dice[x] == 4){
                answer = 1111 * (x+1);
                break;
            }
            if(dice[x] == 3){
                p = x+1;
                cnt++;
            }
            if(dice[x]==1){
                count++;
                if(q==0){
                    q = x+1;    
                }
                if(count == 1){
                    if(j==0){
                        j = q;
                    }
                    answer =q;
                }
                if(count == 2){
                    k = x+1;
                }
            }
            if(dice[x] == 2){
                if(p == 0){
                    p = x+1;
                }else if(p != 0 ){
                    q = x+1;
                }
                answer = (p+q)* Math.abs(p-q);
            }
            
            if( cnt == 1){
                answer = (10*p+q)*(10*p+q);
            }
            if(x == 5){
                if(count == 2){
                   answer = j *k;
                }
            }

        }
        return answer;
    }
}