import java.util.*;
class BFSAdjMatrix{
          int v;
          int[][] adj;
          BFSAdjMatrix(int v){
                    this.v=v;
                    adj=new int[v][v];          
          }
          public void BFS(int num){
                    boolean[] visited=new boolean[v];
                    Arrays.fill(visited,false);
                    Queue<Integer>q=new LinkedList<>();       
                    q.add(num);
                    visited[num]=true;
                    while(!q.isEmpty()){
                              int removed=q.poll();
                              System.out.println(removed+" ");
                              for(int i=0;i<v;i++){
                                        if(adj[removed][i]==1 && !visited[i])
                                                  q.add(i);
                                                  visited[i]=true;                              
                              }
                                                 
                    }
          }
          public static void main(String args[]){
                    Scanner s=new Scanner(System.in);
                    System.out.println("Enter the no of Vertices:");
                    int v=s.nextInt();
                    BFSAdjMatrix graph=new BFSAdjMatrix(v);
                    System.out.println("Enter the adjacency Matrix:");
                    for(int i=0;i<v;i++){
                              for(int j=0;j<v;j++){
                                        graph.adj[i][j]=s.nextInt();                              
                              }                    
                    }
                    System.out.println("Enter the Starting vertex:");
                    int num=s.nextInt();
                    System.out.println("The BFS of the given matrix from"+num+"is:");
                    graph.BFS(num);
          }
}
