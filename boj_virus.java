//Baekjoon Online Judge -- https://www.acmicpc.net/problem/2606
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		int numA; int numB;
		Queue<Integer> nodesQ = new LinkedList<Integer>();
		boolean vis[] = new boolean[N+1];
		ArrayList<Integer> arr[] = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++){
		arr[i]=new ArrayList<Integer>();
		}
		
		StringTokenizer st;
		for(int i=0; i<E; i++){
			st = new StringTokenizer(br.readLine());
			numA = Integer.parseInt(st.nextToken());
			numB = Integer.parseInt(st.nextToken());
			arr[numA].add(numB);
			arr[numB].add(numA);
			}
		
		int num=0;
		int pollNum;
		vis[1] = true;
		nodesQ.offer(1);
		while(!nodesQ.isEmpty()){
			pollNum = nodesQ.poll();
			for(int i: arr[pollNum]){
				if(!vis[i]){
				nodesQ.offer(i);
				vis[i] = true;
				num++;
				}
			}
			}
			System.out.print(num);
	}
}