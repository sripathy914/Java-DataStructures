import java.util.*;
class treenode
{
    int data;
    treenode left,right;
    
    public treenode(int data)
    {
        this.data=data;
        this.left=this.right=null;
    }
}

class binarytree 
{
    treenode root;
    public binarytree()
    {
        this.root=null;
    }
    
    public List<Integer> postorderTraversal()
    {
        if(this.root==null)
            return new ArrayList<>();

        List<Integer> result = new ArrayList();
        postorder(root,result);
        return result;
    }
    
    private void postorder(treenode root,List<Integer> result)
    {
        if(root!=null)
        {   
            postorder(root.left,result);
            postorder(root.right,result);
            result.add(root.data);
        }
        
    }
}

class Main
{
    public static void main(String args[])
    {
        binarytree tree=new binarytree();
        
        tree.root=new treenode(1);
        tree.root.left=new treenode(2);
        tree.root.right=new treenode(3);
        
        tree.root.left.left=new treenode(4);
        tree.root.left.right=new treenode(5);
        
        tree.root.right.left=new treenode(6);
        tree.root.right.right=new treenode(7);
        
        System.out.println(tree.postorderTraversal());
    }
}

