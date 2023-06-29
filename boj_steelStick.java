//Baekjoon Online Judge -- https://www.acmicpc.net/problem/10799

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr;
		int res = 0;
		
		arr = sc.next();
		
		Stack<Character> eStack = new Stack<>();

		for(int i=0; i<arr.length(); i++){
		    if(arr.charAt(i) == '('){
		     eStack.push(arr.charAt(i));   
		    }else if (arr.charAt(i) == ')'){
		        eStack.pop();
		     if(arr.charAt(i-1)!=')'){ //razor
		         res=res+eStack.size();
		     } else {res++;}
		    }
		}
		System.out.print(res);
	}
}