//Baekjoon Online Judge -- https://www.acmicpc.net/problem/1260

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;

public class Main {
static boolean dfsV[];
static StringBuilder sb;

	public static void DFS(ArrayList<Integer> nodes[], int curD){
		for(int i: nodes[curD]){
			if(!dfsV[i]){
				dfsV[i]=true;
				sb.append(i).append(" ");
				DFS(nodes, i);
				}
			}
	}
	
	public static void main(String[] args) throws IOException {
		
		Stack<Integer> dfsS = new Stack<>();
		Queue<Integer> bfsQ = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		int numA; int numB;
		ArrayList<Integer> nodes[] = new ArrayList[N+1];
		dfsV = new boolean[N+1];
		boolean bfsV[] = new boolean[N+1];
		
		for(int i=1; i<=N; i++) nodes[i]=new ArrayList<>();
		
		for(int i=0; i<E; i++){
			st = new StringTokenizer(br.readLine());
			numA = Integer.parseInt(st.nextToken());
			numB = Integer.parseInt(st.nextToken());
			nodes[numA].add(numB);
			nodes[numB].add(numA);
			}
		
		sb = new StringBuilder();
		
		int curD;
		int curB;
		
		for(int i=1; i<=N; i++) Collections.sort(nodes[i]);
		
		dfsS.push(start);
		sb.append(start).append(" ");
		dfsV[start]=true;
		DFS(nodes, start);
		
		sb.append("\n");
		
		bfsQ.offer(start);
		sb.append(start).append(" ");
		bfsV[start]=true;
		while(!bfsQ.isEmpty()){
			curB = bfsQ.poll();
			for(int i: nodes[curB]){
				if(!bfsV[i]){
					bfsV[i]=true;
					bfsQ.offer(i);
					sb.append(i).append(" ");
					}
				}
			}
			System.out.print(sb);
	}
}