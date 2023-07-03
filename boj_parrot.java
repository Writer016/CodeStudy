//Baekjoon Online Judge -- https://www.acmicpc.net/problem/14713
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.StringTokenizer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String str;
		StringTokenizer st;
		int c;
		int max=-1; //number of word
		
		HashMap<String, Integer> prtPos = new HashMap<>(); //String: word value, Integer: parrot id
		HashMap<String, Integer> wrdPos = new HashMap<>(); //String: word value, Integer: word id
		
		int pstPos[] = new int[N]; //index: (current)parrot id, value: (current)word id
		
		for(int i=0; i<N; i++){
			pstPos[i]=0;
			c=0;
			st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			str = st.nextToken();
			prtPos.put(str, i);
			wrdPos.put(str, c);
			c++;
			max++;
		}
		}
		
		Queue<String> stsQueue = new LinkedList<>(); //Full sentence
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			stsQueue.add(st.nextToken());
			}
			
		boolean pos = true;
		str = stsQueue.poll();
		
		if(max==stsQueue.size()){ //Number of all words == Full sentence's number of words
		while(str!=null){
			if(prtPos.containsKey(str)){
				if(pstPos[prtPos.get(str)]==wrdPos.get(str)){ //(current)Word(str)'s position == Word(str)'s position
					pstPos[prtPos.get(str)]++; //Increase current word's position
					str = stsQueue.poll(); //current word
					}
					else{
						pos=false;
						break;
						}
				}
				else{
					pos=false;
					break;
					}
			}
		}
		else{pos=false;}
		
		if(pos){
		System.out.print("Possible"); }
		else{
			System.out.print("Impossible");
			}
		
	}
}