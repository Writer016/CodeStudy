//Baekjoon Online Judge -- https://www.acmicpc.net/problem/1449
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

StringTokenizer st = new StringTokenizer(br.readLine());
int N = Integer.parseInt(st.nextToken());
int L = Integer.parseInt(st.nextToken());

st = new StringTokenizer(br.readLine());
int arr[] = new int[N];
for(int i=0; i<N; i++) arr[i]=Integer.parseInt(st.nextToken());

Arrays.sort(arr);

int res=0;
int j=0;
int m=0;

for(int i=0; i<N; i++){
	j=i;
	while(true){
		if(j>=N){i=j; break;}
		if(arr[j]-arr[i]+1>L){i=j-1; break;}
		else if(arr[j]-arr[i]+1==L){i=j;break;}
		else {j++;}
		}
		res++;
	}
System.out.print(res);
	}
}