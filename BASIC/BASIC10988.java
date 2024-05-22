package BASIC;
import java.util.Scanner;

public class BASIC10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[]word = new char[s.length()];
        for(int i=0;i<s.length();i++){
            word[i]=s.charAt(i);
        }

        int x= s.length()/2;
        int y=s.length()-1; 
        int count=0;
        for(int i=0;i<x;i++){
            if(word[y]==word[i]){
                count++;
            }
            y--;
        }
    
        if(x==count){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
