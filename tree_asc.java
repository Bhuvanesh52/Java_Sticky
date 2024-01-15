class TreeNode {
    private TreeNode Left = null, Right = null;
    private int data;

    TreeNode(int data) {
        this.data = data;
    }

    void check(int data, TreeNode to_Insert) {
        if (data > this.data) {
            if (this.Right == null) {
                this.Right = to_Insert;
            } else {
                this.Right.check(data, to_Insert);
            }
        } else {
            if (this.Left == null) {
                this.Left = to_Insert;
            } else {
                this.Left.check(data, to_Insert);
            }
        }
    }

    void sort_node(TreeNode to_sort, boolean order) {
        if (to_sort != null && order) {
            sort_node(to_sort.Left, order);
            System.out.println(to_sort.data);
            sort_node(to_sort.Right, order);
        } else if (to_sort != null && !order) {
            sort_node(to_sort.Right, order);
            System.out.println(to_sort.data);
            sort_node(to_sort.Left, order);
        }
    }

    boolean to_delete_data(TreeNode parent, TreeNode to_del, int to_delete) {
        if(to_del==null)
        {
        	return false;
        }
        if(to_del.data==to_delete)
        {
	        if(to_del.Left==null && to_del.Right==null)
	        {
	        	if(parent.Left==to_del)
	        	{
	        		parent.Left=null;
	        	}else {
	        		parent.Right=null;
	        	}
	        }else
	        if(to_del.Left!=null && to_del.Right!=null)
	        {
	        	int find_min_node=find_Min(to_del.Right);//data node
	        	to_del.data=find_min_node;
	        	to_delete_data(to_del, to_del.Right,find_min_node);
	        }else {
	        	if(to_del.Left!=null)
	        	{
	        		if(parent.Left==to_del)
		        	{
		        		parent.Left=to_del.Left;
		        	}else {
		        		parent.Right=to_del.Left;
		        	}
	        	}else {
	        		if(parent.Right==to_del)
		        	{
		        		parent.Right=to_del.Right;
		        	}else {
		        		parent.Left=to_del.Right;
		        	}
	        	}
	        }
        }
        if(to_del.data>to_delete)//left
        {
        	to_delete_data(to_del,to_del.Left,to_delete);
        }else {
        	to_delete_data(to_del,to_del.Right,to_delete);
        }
        return true;
    }
 private int find_Min(TreeNode node1_toFind)
 {
	 while(node1_toFind.Left!=null)
	 {
		 node1_toFind=node1_toFind.Left;
	 }
	 return node1_toFind.data;
 }
}

public class BinarySearchTree {
    private TreeNode head = null;

    void add(int data) {
        TreeNode TN = new TreeNode(data);
        if (head == null) {
            head = TN;
        } else {
            head.check(data, TN);
        }
    }

    void ShowSort(boolean order) {
        head.sort_node(this.head, order);
    }

    void delete(int to_delete) {
        head.to_delete_data(null, this.head, to_delete);
    }

    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        BST.add(1);
        BST.add(2);
        BST.add(10);
        BST.add(5);
        BST.add(4);
        BST.add(6);
        BST.add(12);
        BST.add(11);
        BST.add(13);
        BST.delete(2);
        BST.ShowSort(true);
    }
}
