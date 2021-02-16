package Tree;

public class Tree {

    private TreeNode root;

    public void insert(int value){

        if (root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }

    //return the treeNode that has that value
    public TreeNode get(int value){
        if (root != null){
            return root.get(value);
        }
        return null;
    }

    public int min(){
       if (root == null){
           return Integer.MIN_VALUE;
       }
       return root.min();
    }

    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        return root.min();
    }

    public void traverseOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
        if (subTreeRoot == null){
            return subTreeRoot;
        }
        if (value < subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
        }
        else if (value > subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        }
        else{
            // Use case 1 and 2 : Node to delete has 1 or 0 children
            if (subTreeRoot.getLeftChild() == null){
                return subTreeRoot.getRightChild();
            }
            else if (subTreeRoot.getRightChild() == null){
                return subTreeRoot.getLeftChild();
            }

            //case 3  : Node to delete has 2 children
            // replace the value in the subtree root node with the smallest value
            // from the right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            // Delete the Node that has the smallest value in the right subtree
            //subTreeRoot.setRightChild(subTreeRoot.getRightChild(), subTreeRoot.getData());
        }
        return subTreeRoot;
    }
}