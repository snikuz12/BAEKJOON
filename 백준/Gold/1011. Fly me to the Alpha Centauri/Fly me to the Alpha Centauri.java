import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int add = 1;
		int count = 0;
		long now_Number = 0;
		int size = sc.nextInt();
		int[]result=new int[size];
		int distance = 0;
		int index = 0;
		for(int i = 0; i < size; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			distance =b-a;
			count = 0;
			add = 1;
			now_Number = 0;
			while (true) {
				if(now_Number >= distance) {
					result[index++] = count;
					break;
				}
				if (count != 0 && count % 2 ==0) {
					add++;
				}
				now_Number += add;
				count++;
			}
			
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}