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
    
    public List<Integer> PREorderTraversal()
    {
        if(this.root==null)
            return new ArrayList<>();

        List<Integer> result = new ArrayList();
        preorder(root,result);
        return result;
    }
    
    private void preorder(treenode root,List<Integer> result)
    {
        if(root!=null)
        {   
            result.add(root.data);
            preorder(root.left,result);
            preorder(root.right,result);
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
        
        System.out.println(tree.PREorderTraversal());
    }
}

