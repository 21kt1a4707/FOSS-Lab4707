class Node
{
int data;
Node left,rihgt;
Public Node(int item)
{
data=item;
left=rihgt=null;
}
}
class BinaryTree
{
Node root;
Public BinaryTree(){root=null;}
int height(Node root)
{
if(root==null)
return 0;
else{int lheight=height(root.left);
int rheight=height(root.right);
if(lheight>rheight)
return(lheight+1);
else
return(rheight+1);
}
}
void print GivenLevel(Node root,int level)
{
if(root==null)
return;
if(level==1)
{
System.out.println(root.data+" ");
}
else if(level>1)
{
print GivenLevel(root.left, leve-1);
print GivenLevel(root.right, level-1);
}
}
void print LevelOrder()
{
int h=height(root);
int i;
for(i=1;i<=h;i++)
{
print GivenLevel(root,i);
System.out.println(System.lineseparator());
}
}
Public static void main(string args[])
{
BinaryTree tree=new BinaryTree();
tree.root=new Node(1);
tree.root.left=new Node(2);
tree.root.right=new Node(3);
tree.root.left.left=new Node(4);
tree.root.left.right=new Node(5);
System.out.println("Level Order traversal of binary tree is ");
tree.printLevelOrder();
}
}
