package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		
		int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		boolean[] visited = new boolean[graph.length];
		
		System.out.println(bfs(1, graph, visited) );
	}
	
	static String bfs(int start, int[][] arr, boolean[] visited) {
		
		String str = "";
		
		Queue<Integer> que = new LinkedList<>();
		que.offer(start); //시작 노드 1
		visited[start] = true;
		
		while( !que.isEmpty() ) {
			int nodeIndex = que.poll();
			str += nodeIndex + "->";
			
			for(int i = 0; i < arr[nodeIndex].length; i++ ) {
				
				int temp = arr[nodeIndex][i];
				
				if( visited[temp] == false ) {
					visited[temp] = true;
					que.offer(temp);
					System.out.println(que);
					System.out.println(Arrays.toString(visited));
				}
			}
			
			
		}
		
		
		return str;
	}
	
	
	
	
}
