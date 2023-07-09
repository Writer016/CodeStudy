//Baekjoon Online Judge -- https://www.acmicpc.net/problem/18310
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int homes[] = new int[N];	
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			homes[i] = Integer.parseInt(st.nextToken());
			}
		Arrays.sort(homes);		
		System.out.print(homes[(N-1)/2]);
	}
}