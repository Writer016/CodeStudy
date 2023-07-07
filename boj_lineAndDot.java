//Baekjoon Online Judge -- https://www.acmicpc.net/problem/11663
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main {
	
	public static int binar(int tg, boolean s, int N, int dot[]){
			int p1=0; int p2=N-1;
			int res=0; int mid;
			
			while(true){
			
			if(p2-p1==1){
				if(s){
					if(dot[p1]==tg){res=p1;}
					else{res=p2;}
					break;
					}
				else{
					if(dot[p2]==tg){res=p2;}
					else{res=p1;}
					break;
				}
			}
				
			mid=Math.round((p2+p1)/2);
			
			if(tg<dot[mid]){
				p2=mid;
				continue; }
			else if(tg>dot[mid]){
				p1=mid; continue; }
			else if(tg==dot[mid]){
				res=mid; break;
				}
			}
			return res;
			}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int dot[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) dot[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(dot);
		
		int sLine; int eLine; int cLine;
		int eCount; int sCount;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			sLine=Integer.parseInt(st.nextToken());
			eLine=Integer.parseInt(st.nextToken());
			cLine=0;
			
		if(sLine<dot[0]){sCount=0;}
		else if(sLine>dot[N-1]){sb.append(cLine).append("\n"); continue;}
		else{
			sCount=binar(sLine, true, N, dot);  }
		
		if(eLine>dot[N-1]){eCount=N-1;}
		else if(eLine<dot[0]){sb.append(cLine).append("\n"); continue;}
		else{
			  eCount=binar(eLine, false, N, dot); }
		
		if(eCount-sCount+1>0) cLine=1+eCount-sCount;
		
		sb.append(cLine).append("\n");
			}
			
		System.out.print(sb);
	}
}