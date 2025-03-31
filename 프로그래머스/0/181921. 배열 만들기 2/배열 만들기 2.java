import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i =l;i<=r;i++){
            int j=1;
            String x = Integer.toString(i);  // 555
            char[] arr = x.toCharArray();  //[5,5,5]
            for(int k=0;k<arr.length;k++){
                if(arr[k] != '0' && arr[k] != '5'){
                    j=0;
                    break;
                }
            }
            if(j==0){
                continue;
            }else{
                list.add(Integer.parseInt(x));
            }

        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        int[] m_answer = {-1};
        if(answer.length == 0){
            return m_answer;
        }
        return answer;
    }
    
}

