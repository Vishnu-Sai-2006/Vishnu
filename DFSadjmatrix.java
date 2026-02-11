import java.util.*;
class DFSAdjMatrix{
          int v;
          int[][] adj;
          DFSAdjMatrix(int v){
                    this.v=v;
                    adj=new int[v][v];          
          }
          public void DFS(int num){
                    boolean[] visited=new boolean[v];
                    Arrays.fill(visited,false);
                    Stack<Integer>stk=new Stack<>();       
                    stk.push(num);
                    visited[num]=true;
                    while(!stk.isEmpty()){
                              int removed=stk.pop();
                              System.out.println(removed+" ");
                              for(int i=0;i<v;i++){
                                        if(adj[removed][i]==1 && !visited[i])
                                                  stk.push(i);
                                                  visited[i]=true;                              
                              }
                                                 
                    }
          }
          public static void main(String args[]){
                    Scanner s=new Scanner(System.in);
                    System.out.println("Enter the no of Vertices:");
                    int v=s.nextInt();
                    DFSAdjMatrix graph=new DFSAdjMatrix(v);
                    System.out.println("Enter the adjacency Matrix:");
                    for(int i=0;i<v;i++){
                              for(int j=0;j<v;j++){
                                        graph.adj[i][j]=s.nextInt();                              
                              }                    
                    }
                    System.out.println("Enter the Starting vertex:");
                    int num=s.nextInt();
                    System.out.println("The DFS of the given matrix from"+num+"is:");
                    graph.DFS(num);
          }
}
