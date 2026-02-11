import java.lang.*;
class Atree{
	class Node{
		int key,height;
		node left,right;
		Node(int d){
			key=d;
			height=1;
		}
	}
	Node root;
	int height(Node n){
                    if(n==0)
                              return 0;
                  return n.height;
          }
          int getBalance(Node n){
                    if(n=null)
                              return 0;
                    return height(node.left)-height(node.right);
          }
          //right rotation
          node rightRotate(Node y){
                    Node x=y.left;
                    Node t2=x.right;
                    x.right=y;
                    y.left=t2;
                    y.height=math.max(height(y.left),height(y.right))+1;
                    x.height=math.max(height(x.left),height(x.right))+1;
                    return x;
          }
          //left rotation
          node leftRotate(Node x){
                    Node y=x.right;
                    node t2=y.left;
                    y.left=x;
                    x.right=t2;
                    x.height=math.max(height(x.left),height(x.right))+1;
                    y.height=math.max(height(y.left),height(y.right))+1;   
                    return y; 
          }
          //insertion 
          Node insert(Node node,int key){
                    if(node==null)
                              return new node(key);
                    else if(key<node.left)
                              node.left=insert(node.left,key);
                    else if(key>node.right)
                              node.right=insert(node.right,key);
                    else
                              return node;
          
          Node.height=math.max(height(node.left),height(node.right))+1;
          int balance=getBalance(Node);
          //ll
          if(balance>1 && key<node.left.key)
                    return rightRotate(Node);
          //rr
          if(balance<-1 && key>node.right.key)
                    return leftRotate(node);
          }
          //lr
          if(balance>1 && key>node.left.key)
                    node.left=leftRotate(node.left);
                    return rightRotate(node);
          //rl
          if(balance<-1 && key<node.right.key)
                    node.right=rightRotate(node.right);
                    return leftRotate(node);
          }
          Node delete(Node node,int key){
                    if(node==null)
                              return node;
                    else if(key<node.left)
                              node.left=delete(node.left);
                    else if(key>node.right)
                              node.right=delete(node.right);
                    else
                              return Node;
          node.height=math.max(height(node.left),height(node.right))+1;
          int balance=getBalance(node);
          //ll
          if(balance>1 && getBalance(node.left)>0)
                    return rightRotate(node);
          //rr
          if(balance<-1 && getBalance(node.right)<=0)
                    return leftRotate(node);
          //lr
          if(balance>1 && getBalance(node.left)<0)
                    node.left=leftRotate(node.left);
                    return rightRotate(node);
          //rl
          if(balance<-1 && getBalance(node.right>0)
                    node.right=rightRotate(node.right);
                    return leftRotate(node);
          }
          return root;
}
                    
                    
