//Baekjoon Online Judge -- https://www.acmicpc.net/problem/18870

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n]; //X
		int cArr[] = new int[n];
		int count=0; //rank numbers without duplicates
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<>(); //save X'
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
		arr[i] = cArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cArr); //ascending order sort
		
		for(int i=0; i<cArr.length; i++){
				if (!map.containsKey(cArr[i])){ map.put(cArr[i], count++); } //rank numbers without duplicates
			}
		
		for(int i=0; i<n; i++){
			sb.append(map.get(arr[i])).append(" ");
			}
			System.out.print(sb);
	}
}