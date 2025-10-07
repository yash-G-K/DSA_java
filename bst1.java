
public class bst1{
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static node insert(node root,int val){
      if(root == null){
        root = new node(val);
        return root;
      }
      if(root.data>val){
        //left subtree
        root.left = insert(root.left,val);
    }else{
        //right subtree
        root.right = insert(root.right,val);
    }
    return root;
    }

    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //searching a node int BST
    public static boolean search(node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }

        
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        node root=null; 

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root,7)){
            System.out.println("found");    
        }else{
            System.out.println("not found");
        }
    }

}