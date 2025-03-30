import java.util.*;

class Solution {
    public String solution(String code) {

        int mode = 0;
        ArrayList<Character> ret = new ArrayList<>();
        for(int i =0;i<code.length();i++){
            if(code.charAt(i)=='1'){
                if(mode ==0){
                    mode = 1;
                }else{
                    mode = 0;
                }
                continue;
            }
            if(mode ==0){
                if(i%2==0){
                    ret.add(code.charAt(i));
                }
            }
            else{
                if(i%2==1){
                    ret.add(code.charAt(i));
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        
    
        if (ret.size()==0) {
            answer.append("EMPTY");
        }else{
            for(int i=0;i<ret.size();i++){
            answer.append(ret.get(i));
            }
        }

        
        return answer.toString();
    }
}
